package training.day5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class School {
    ArrayList<Student> students;
    ArrayList<Teacher> teachers;

    public School() {
        students = new ArrayList<>();
        teachers = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void printInformation() {
        System.out.println("Teachers:");
        for (Teacher teacher : teachers) {
            System.out.println("Name: " + teacher.getName());
            System.out.println("Gender: " + teacher.getGender());
            System.out.println("ID: " + teacher.getId());
            System.out.println("School: " + teacher.getSchool());
            System.out.println("Subjects: " + teacher.getSubjects());
            System.out.println("Salary: " + teacher.getSalary());
            System.out.println();
        }

        System.out.println("Students:");
        for (Student student : students) {
            System.out.println("Name: " + student.getName());
            System.out.println("Gender: " + student.getGender());
            System.out.println("ID: " + student.getId());
            System.out.println("Class: " + student.getClassName());
            System.out.println("Number in Class: " + student.getNumberInClass());
            System.out.println("Grades: " + student.getGrades());
            System.out.println("Subjects: " + student.getSubjects());
            System.out.println();
        }
    }

    public Student getStudentWithHighestGrade(String subject) {
        Student studentWithHighestGrade = null;
        double highestGrade = Double.MIN_VALUE;

        for (Student student : students) {
            Map<String, Double> grades = student.getGrades();
            if (grades.containsKey(subject)) {
                double grade = grades.get(subject);
                if (grade > highestGrade) {
                    highestGrade = grade;
                    studentWithHighestGrade = student;
                }
            }
        }

        return studentWithHighestGrade;
    }

    public Student getStudentWithLowestGrade(String subject) {
        Student studentWithLowestGrade = null;
        double lowestGrade = Double.MAX_VALUE;

        for (Student student : students) {
            Map<String, Double> grades = student.getGrades();
            if (grades.containsKey(subject)) {
                double grade = grades.get(subject);
                if (grade < lowestGrade) {
                    lowestGrade = grade;
                    studentWithLowestGrade = student;
                }
            }
        }

        return studentWithLowestGrade;
    }

    public double calculateAverageSalary() {
        double totalSalary = 0;
        for (Teacher teacher : teachers) {
            totalSalary += teacher.getSalary();
        }
        return totalSalary / teachers.size();
    }

    public double calculateAverageGradeForStudent(Student student) {
        double totalGrade = 0;
        int gradeCount = 0;

        Map<String, Double> grades = student.getGrades();
        for (double grade : grades.values()) {
            totalGrade += grade;
            gradeCount++;
        }

        return gradeCount > 0 ? totalGrade / gradeCount : 0;
    }

    public double calculateAverageGradeForClass() {
        double totalGrade = 0;
        int gradeCount = 0;

        for (Student student : students) {
            Map<String, Double> grades = student.getGrades();
            for (double grade : grades.values()) {
                totalGrade += grade;
                gradeCount++;
            }
        }

        return gradeCount > 0 ? totalGrade / gradeCount : 0;
    }

    public String getSubjectWithHighestGradeForStudent(Student student) {
        String subjectWithHighestGrade = null;
        double highestGrade = Double.MIN_VALUE;

        Map<String, Double> grades = student.getGrades();
        for (Map.Entry<String, Double> entry : grades.entrySet()) {
            String subject = entry.getKey();
            double grade = entry.getValue();
            if (grade > highestGrade) {
                highestGrade = grade;
                subjectWithHighestGrade = subject;
            }
        }

        return subjectWithHighestGrade;
    }

    public Teacher getTeacherWithHighestGrades() {
        Teacher teacherWithHighestGrades = null;
        double highestAverage = 0, grades = 0, gradesCount=0;

        for (Teacher teacher : teachers) {
            for(Student student : students){
                //grades+=student.getGradesFromTeacher().get(teacher.name);
                //gradesCount++;
                Map<String, Map<String, Double>> gradesMap = student.grades;
                Map<String, Double> studentGrades = gradesMap.get(teacher.name);

                if (studentGrades != null)
                    for (Double grade : studentGrades.values()){
                        grades+=grade;
                        gradesCount++;
                    }
            }
            if(grades/gradesCount>highestAverage){
                highestAverage=grades/gradesCount;
                teacherWithHighestGrades = teacher;
            }
        }

        return teacherWithHighestGrades;
    }
}
