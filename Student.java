public class Student {
    // Instance variables
    private int id;
    private String name;
    private int age;

    // Default constructor
    public Student() {
        id = 0;
        name = "Unknown";
        age = 0;
    }

    // Parameterized constructor
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }

    public static void main(String[] args) {
        // Create two student objects using default constructor
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        // Set details for the first student
        student1.id = 1;
        student1.name = "Priyakshi";
        student1.age = 50;

        student2.id = 2;
        student2.name = "Plaboni";
        student2.age = 20;

        student3.id = 3;
        student3.name = "Deep";
        student3.age = 1;
       


        // Display details for all students
        System.out.println("Details of Student 1:");
        student1.displayDetails();

        System.out.println("\nDetails of Student 2:");
        student2.displayDetails();

        System.out.println("\nDetails of Student 3:");
        student3.displayDetails();
    }
}
