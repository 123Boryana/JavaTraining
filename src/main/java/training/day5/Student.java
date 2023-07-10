package training.day5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Student extends Person {
    String className;
    int numberInClass;
    Map<String, Map<String, Double>> grades;
    ArrayList<String> subjects;

    public Student(String name, String gender, int id, String className, int numberInClass) {
        super(name, gender, id);
        this.className = className;
        this.numberInClass = numberInClass;
        this.grades = new HashMap<>();
        this.subjects = new ArrayList<>();
    }

    public String getClassName() {
        return className;
    }

    public int getNumberInClass() {
        return numberInClass;
    }

    //returns subject and grade
    public Map<String, Double> getGrades() {
        Map<String, Double> AnswerGrades = new HashMap<>();
        for (Map.Entry<String, Map<String, Double>> entry : grades.entrySet()) {
            String teacherName = entry.getKey();
            Map<String, Double> subjectGrades = entry.getValue();

            System.out.println("Student: " + teacherName);
            for (Map.Entry<String, Double> subjectEntry : subjectGrades.entrySet()) {
                String subject = subjectEntry.getKey();
                Double grade = subjectEntry.getValue();
                System.out.println("Subject: " + subject + ", Grade: " + grade);
                AnswerGrades.put(subject, grade);
            }
            System.out.println();
        }
        return AnswerGrades;
    }

    //returns teacher and grade
    public Map<String, Map<String, Double>> getGradesFromTeacher() {
        return grades;
    }


    public void addGrade(String teacher, String subject, double grade) {
        HashMap<String, Double> studentGrades = new HashMap<>();
        studentGrades.put(subject, grade);
        grades.put(teacher, studentGrades);
    }

    public ArrayList<String> getSubjects() {
        return subjects;
    }

    public void addSubject(String subject) {
        subjects.add(subject);
    }

    public String toString(){
        return  name + " " + gender + " " + id + " " + className + " " + numberInClass + " " + grades + " " + subjects;
    }
}