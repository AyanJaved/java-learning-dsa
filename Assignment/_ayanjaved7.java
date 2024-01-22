package Assignment;
class Student {
    static String school = "Integral"; // static data member
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    static void displaySchoolName() { // static member function
        System.out.println("School Name is : " + school);
    }
    static class Result { //static inner class
        static void displayResult(Student student) {
            System.out.println("Student Name: " + student.name);
            System.out.println("Marks: " + student.marks);
        }
    }
}

public class _ayanjaved7 {
    public static void main(String[] args) {
        Student student1 = new Student("Anuj", 85);
        Student student2 = new Student("Vikas", 92);
        Student.displaySchoolName();
        Student.Result.displayResult(student1);
        Student.Result.displayResult(student2);
    }
}

