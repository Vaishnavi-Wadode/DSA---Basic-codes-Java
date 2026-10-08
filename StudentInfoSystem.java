import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    
    public Student(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}

public class StudentInfoSystem {
    private ArrayList<Student> students;
    private Scanner scanner;
    
    public StudentInfoSystem() {
        students = new ArrayList<>();
        scanner = new Scanner(System.in);
    }
    
    public boolean addStudent(Student student) {
        // TODO 1: implement a method to add a new student to the ArrayList
        students.add(student);
        return true;
    }
    
    public void displayMenu() {
        System.out.println("Options:");
        System.out.println("1. Add Student");
        System.out.println("2. Add Exam");
        System.out.println("3. View Next Exam");
        System.out.println("4. View Previous Exam");
        System.out.println("5. View Student Schedule");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }
    
    public void run() {
        int choice;
        
        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    Student newStudent = new Student(name);
                    
                    if (addStudent(newStudent)) {
                        System.out.println("Student added: " + name);
                    }
                    break;
                    
                case 2:
                    // Placeholder for Add Exam functionality
                    System.out.println("Add Exam feature coming soon...");
                    break;
                    
                case 3:
                    // Placeholder for View Next Exam functionality
                    System.out.println("View Next Exam feature coming soon...");
                    break;
                    
                case 4:
                    // Placeholder for View Previous Exam functionality
                    System.out.println("View Previous Exam feature coming soon...");
                    break;
                    
                case 5:
                    // Placeholder for View Student Schedule functionality
                    System.out.println("View Student Schedule feature coming soon...");
                    break;
                    
                case 6:
                    System.out.println("Exiting...");
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        } while (choice != 6);
    }
    
    public static void main(String[] args) {
        StudentInfoSystem system = new StudentInfoSystem();
        system.run();
    }
}