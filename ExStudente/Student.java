package ExStudente;

import java.util.ArrayList;
import java.time.*;

public class Student {

    private String firstname;
    private String lastname;
    private String birthdate;
    private ArrayList<String> grades;

    public Student(String firstname, String lastname, String birthdate, ArrayList<String> grades) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
        this.grades = grades;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public ArrayList<String> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<String> grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student [firstName=" + firstname + ", lastName=" + lastname + ", birthdate=" + birthdate + ", grades="
                + grades + "]";
    }

    public int getAge() {
        LocalDate Dob;
        Dob = LocalDate.parse(birthdate);

        LocalDate currentDate = LocalDate.now();
        int age = Period.between(Dob, currentDate).getYears();
        return age;
    }

    public float getAverageGrade() {
        int currentGrade = 0;
        float sumOfGrades = 0;
        int counter = 0;

        for (String grade : grades) {
            currentGrade = Integer.parseInt(grade);
            sumOfGrades += currentGrade;
            counter++;
        }
        return sumOfGrades / counter;
    }
}
