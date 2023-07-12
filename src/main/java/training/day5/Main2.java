package training.day5;

import java.util.ArrayList;
import java.util.Arrays;

public class Main2 {

    public static void teacherSigningTheGrades(Teacher teacherWithHighestGrades) {
        if (teacherWithHighestGrades != null) {
            System.out.println("Teacher signing the highest grades: " + teacherWithHighestGrades.getName());
        } else {
            System.out.println("No teacher found");
        }
    }

    public static void main(String[] args) {
        School school = new School();

        Student student1 = new Student("Ani", "Female", 1, "Class A", 1);
        student1.addGrade("Ivanov", "Math", 5.50);
        student1.addGrade("Ivanov", "Physics", 4.20);
        student1.addGrade("Petrov", "Chemistry", 5.30);
        student1.addGrade("Petrov", "Biology", 6.00);
        Teacher teacher1 = new Teacher("Ivanov", "Male", 1001, "ABC School", new ArrayList<>(Arrays.asList("Math", "Physics")), 5000.0);
        Teacher teacher2 = new Teacher("Petrov", "Male", 1002, "XYZ School", new ArrayList<>(Arrays.asList("Chemistry", "Biology")), 5500.0);


        school.addStudent(student1);
        school.addTeacher(teacher1);
        school.addTeacher(teacher2);

        school.printInformation();

        String subject = "Biology";
        Student studentWithHighestGrade = school.getStudentWithHighestGrade(subject);
        if (studentWithHighestGrade != null) {
            System.out.println("Student with the highest grade in " + subject + ": " + studentWithHighestGrade.getName());
        } else {
            System.out.println("No student found for " + subject);
        }

        Student studentWithLowestGrade = school.getStudentWithLowestGrade(subject);
        if (studentWithLowestGrade != null) {
            System.out.println("Student with the lowest grade in " + subject + ": " + studentWithLowestGrade.getName());
        } else {
            System.out.println("No student found for " + subject);
        }

        double averageSalary = school.calculateAverageSalary();
        System.out.println("Average Salary of Teachers: " + averageSalary);

        double averageGrade = school.calculateAverageGradeForStudent(student1);
        System.out.println("Average Grade of Student " + student1.getName() + ": " + averageGrade);

        double averageClassGrade = school.calculateAverageGradeForClass();
        System.out.println("Average Grade of the Class: " + averageClassGrade);

        String subjectWithHighestGrade = school.getSubjectWithHighestGradeForStudent(student1);

        Teacher teacherWithHighestGrades = school.getTeacherWithHighestGrades();
        teacherSigningTheGrades(teacherWithHighestGrades);
    }
}