
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // 1. Create a List of students
        List<Student> students = new ArrayList<>();

        // 2. Create students
        Student student1 = new UndergraduateStudent(
                1, "Alice", 20, 80
        );

        Student student2 = new GraduateStudent(
                2, "John", 25, 90
        );

        Student student3 = new UndergraduateStudent(
                3, "Peter", 21, 70
        );

        // 3. Add students to the List
        students.add(student1);
        students.add(student2);
        students.add(student3);

        // 4. Create courses
        Course course1 = new Course(
                101, "Java Programming", 4
        );

        Course course2 = new Course(
                102, "Database Systems", 3
        );

        // 5. Enroll students in courses
        course1.enrollStudent(student1);
        course1.enrollStudent(student2);

        course2.enrollStudent(student2);
        course2.enrollStudent(student3);

        // 6. Create instructors
        Instructor instructor1 = new Instructor(
                201, "Mr. Peter", "Computer Science"
        );

        Instructor instructor2 = new Instructor(
                202, "Mrs. Alice", "Database Management"
        );

        // 7. Assign courses to instructors
        instructor1.assignCourse(course1);
        instructor2.assignCourse(course2);

        // 8. Display all students
        System.out.println("===== STUDENTS =====");

        for (Student student : students) {
            System.out.println(student);
        }

        // 9. Display all courses
        System.out.println("\n===== COURSES =====");

        System.out.println(course1);
        System.out.println(course2);

        // 10. Display students enrolled in each course
        System.out.println("\n===== COURSE ROSTERS =====");

        System.out.println("Java Programming:");

        for (Student student : course1.getEnrollmentStudent()) {
            System.out.println(student.getName());
        }

        System.out.println("Database Systems:");

        for (Student student : course2.getEnrollmentStudent()) {
            System.out.println(student.getName());
        }

        // 11. Display instructors
        System.out.println("\n===== INSTRUCTORS =====");

        System.out.println(instructor1);
        System.out.println(instructor2);

        // 12. Display courses assigned to instructors
        System.out.println("\n===== ASSIGNED COURSES =====");

        System.out.println(instructor1.getName() + ":");

        for (Course course :
                instructor1.getAssignedCourses().values()) {
            System.out.println(course.getCoursename());
        }

        System.out.println(instructor2.getName() + ":");

        for (Course course :
                instructor2.getAssignedCourses().values()) {
            System.out.println(course.getCoursename());
        }

        // 13. Demonstrate polymorphism
        System.out.println("\n===== GPA CALCULATIONS =====");

        for (Student student : students) {
            System.out.println(
                    student.getName() +
                            " GPA: " + student.calculateGpa()
            );
        }
    }
}
