package Assignment;
import java.util.*;
class Student {
    String name;
    int marks1, marks2, marks3;
    double average;
    public Student(String name, int marks1, int marks2, int marks3) {
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }
    public void calculateAverage() {
        average = (marks1 + marks2 + marks3) / 3.0;
    }
    public void displayResult() {
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks1 + ", " + marks2 + ", " + marks3);
        System.out.println("Average: " + average);
        if (average >= 60) {
            System.out.println("Result: Passed");
        } else {
            System.out.println("Result: Failed");
        }
    }
}
public class _ayanjaved4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter marks in subject 1: ");
        int marks1 = scanner.nextInt();
        System.out.print("Enter marks in subject 2: ");
        int marks2 = scanner.nextInt();
        System.out.print("Enter marks in subject 3: ");
        int marks3 = scanner.nextInt();
        Student student = new Student(name, marks1, marks2, marks3);
        student.calculateAverage();
        student.displayResult();
        scanner.close();
    }
}
