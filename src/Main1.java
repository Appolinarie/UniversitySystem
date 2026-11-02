import java.util.List;

public class Main1 {

    public static void main(String[] args) {


        StudentDAO studentDAO = new StudentDAO();
        CourseDAO courseDAO = new CourseDAO();
        EnrollmentDAO enrollmentDAO = new EnrollmentDAO();



        System.out.println("===== INSERT STUDENT =====");

        studentDAO.insertStudent(4, "Mary", 22, 85.5);



        System.out.println("\n===== ALL COURSES =====");

        List<Course> courses = courseDAO.getAllCourses();

        for (Course course : courses) {
            System.out.println(course);
        }



        System.out.println("\n===== UPDATE ENROLLMENT =====");

        enrollmentDAO.updateEnrollment(1, "Completed");



        System.out.println("\n===== DELETE STUDENT =====");

        studentDAO.deleteStudent(4);

    }
}