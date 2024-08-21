package Collection.EX9.business.entiy;

import java.util.Scanner;

public class Student {
    private int studentId;
    private String studentName;
    private double averageScore;

    public Student() {
    }

    public Student(int studentId, String studentName, double averageScore) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.averageScore = averageScore;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", averageScore=" + averageScore +
                '}';
    }
    public void inputData(Scanner scanner)
    {
        System.out.println("Student ID: ");
        this.studentId = Integer.parseInt(scanner.nextLine());
        System.out.println("Student Name: ");
        this.studentName = scanner.nextLine();
        System.out.println("Student Avg Score: ");
        this.averageScore = Double.parseDouble(scanner.nextLine());
    }
}
