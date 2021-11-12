package ExStudente;

import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        String firstName = "Paolo";
        String lastName = "Rossi";
        String birthdate = "1996-10-08";
        ArrayList<String> grades = new ArrayList<>();
        grades.add("7");
        grades.add("9");
        grades.add("6");
        Student st = new Student(firstName, lastName, birthdate, grades);
        Student st1 = new Student(firstName, lastName, birthdate, grades);


        System.out.println(st.getAge());
        System.out.println(st.getAverageGrade());
        System.out.println(st1.getAge());
        System.out.println(st1.getAverageGrade());

    }
}