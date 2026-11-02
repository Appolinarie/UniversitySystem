

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();


        Student student1 = new UndergraduateStudent(1, "Alice", 20, 80);

        Student student2 = new GraduateStudent(2, "John", 25, 90);

        Student student3 = new UndergraduateStudent(3, "Peter", 21, 70);


        students.add(student1);
        students.add(student2);
        students.add(student3);


        Course course1 = new Course(101, "Java Programming", 4);

        Course course2 = new Course(102, "Database Systems", 3);


        course1.enrollStudent(student1);
        course1.enrollStudent(student2);

        course2.enrollStudent(student2);
        course2.enrollStudent(student3);


        Instructor instructor1 = new Instructor(201, "Mr. Peter", "Computer Science");

        Instructor instructor2 = new Instructor(202, "Mrs. Alice", "Database Management");


        instructor1.assignCourse(course1);
        instructor2.assignCourse(course2);


        System.out.println("===== STUDENTS =====");

        for (Student student : students) {
            System.out.println(student);
        }


        System.out.println("\n===== COURSES =====");

        System.out.println(course1);
        System.out.println(course2);




        System.out.println("\n===== INSTRUCTORS =====");

        System.out.println(instructor1);
        System.out.println(instructor2);


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


        System.out.println("\n===== GPA CALCULATIONS =====");

        for (Student student : students) {
            System.out.println(
                    student.getName() +
                            " GPA: " + student.calculateGpa()
            );


        }
    }
}
