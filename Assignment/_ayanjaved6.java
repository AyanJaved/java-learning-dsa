package Assignment;
import java.util.*;
class Student {
    String name;
    int roll;
    int marks1,marks2,marks3;
    double average;
    static String college="BBD";
    static void edit(){
        college = "Integral";
    }
    
    public Student(String name, int roll, int marks1, int marks2, int marks3) {
        this.name = name;
        this.roll = roll;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }
    public void calculateAverage() {
        average = (marks1 + marks2 + marks3) / 3.0;
    }
    
    public void display(){
        System.out.println(roll + " " + name +" " + college );
        if (average >= 60) {
            System.out.println("Result: Passed");
        } else {
            System.out.println("Result: Failed");
        }
    }
    public void finalize(){
        System.out.println("Student object garbage collected.");
    }
}
public class _ayanjaved6 {
    public static void main(String args[]){
        Student.edit();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter ROLL NO. : ");
        int roll = scanner.nextInt();
        System.out.print("Enter marks in subject 1: ");
        int marks1 = scanner.nextInt();
        System.out.print("Enter marks in subject 2: ");
        int marks2 = scanner.nextInt();
        System.out.print("Enter marks in subject 3: ");
        int marks3 = scanner.nextInt();
        Student st = new Student(name, roll, marks1, marks2, marks3);
        st.calculateAverage();
        st.display();
        scanner.close();
        System.gc();
    }
}
