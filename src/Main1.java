import java.util.InputMismatchException;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentDAO studentDAO = new StudentDAO();
        CourseDAO courseDAO = new CourseDAO();
        EnrollmentDAO enrollmentDAO = new EnrollmentDAO();

        boolean running = true;
        while (running) {
            System.out.println("\n=== University Student Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Delete Student");
            System.out.println("4. Add Course");
            System.out.println("5. View All Courses");
            System.out.println("6. Enroll Student in Course");
            System.out.println("7. View Students with Enrolled Courses (JOIN)");
            System.out.println("8. Exit");
            System.out.print("Select an option: ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter email: ");
                        String email = scanner.nextLine();
                        System.out.print("Enter type (UG/Grad): ");
                        String type = scanner.nextLine();
                        System.out.print("Enter score (UG average or Research score): ");
                        double score = scanner.nextDouble();
                        studentDAO.insertStudent(name, email, type, score);
                        break;
                    case 2:
                        System.out.println("\n--- Students List ---");
                        studentDAO.getAllStudents().forEach(System.out::println);
                        break;
                    case 3:
                        System.out.print("Enter Student ID to delete: ");
                        int studentId = scanner.nextInt();
                        studentDAO.deleteStudent(studentId);
                        break;
                    case 4:
                        System.out.print("Enter Course Name: ");
                        String courseName = scanner.nextLine();
                        System.out.print("Enter Credits: ");
                        int credits = scanner.nextInt();
                        courseDAO.insertCourse(courseName, credits);
                        break;
                    case 5:
                        System.out.println("\n--- Courses List ---");
                        courseDAO.getAllCourses().forEach(System.out::println);
                        break;
                    case 6:
                        System.out.print("Enter Student ID: ");
                        int sId = scanner.nextInt();
                        System.out.print("Enter Course ID: ");
                        int cId = scanner.nextInt();
                        enrollmentDAO.enrollStudentInCourse(sId, cId);
                        break;
                    case 7:
                        System.out.println("\n--- Student Enrollments (JOIN) ---");
                        enrollmentDAO.getStudentsWithCourses().forEach(System.out::println);
                        break;
                    case 8:
                        running = false;
                        System.out.println("Exiting application. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid option. Please choose between 1 and 8.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input format. Please enter correct numeric values where required.");
                scanner.nextLine(); // clear invalid token
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        }
        scanner.close();
    }
}