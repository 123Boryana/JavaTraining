package training.day5;

import java.util.ArrayList;

public class Teacher extends Person {
    private String school;
    private ArrayList<String> subjects;
    private double salary;

    public Teacher(String name, String gender, int id, String school, ArrayList<String> subjects, double salary) {
        super(name, gender, id);
        this.school = school;
        this.subjects = subjects;
        this.salary = salary;
    }

    public String getSchool() {
        return school;
    }

    public ArrayList<String> getSubjects() {
        return subjects;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString(){
        return  getName() + " " + getGender() + " " + getId() + " " + getSchool() + " " + getSubjects() + " " + getSalary();
    }
}