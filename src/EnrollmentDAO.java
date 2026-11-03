import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EnrollmentDAO {

    public void enrollStudentInCourse(int studentId, int courseId) {
        String sql = "INSERT INTO enrollments (student_id, course_id) VALUES (?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, studentId);
            pstmt.setInt(2, courseId);
            pstmt.executeUpdate();
            System.out.println("Student successfully enrolled in course.");
        } catch (SQLException e) {
            System.err.println("Enrollment error: " + e.getMessage());
        }
    }

    public List<String> getStudentsWithCourses() {
        List<String> results = new ArrayList<>();
        String sql = "SELECT s.name AS student_name, c.course_name " +
                "FROM students s " +
                "JOIN enrollments e ON s.id = e.student_id " +
                "JOIN courses c ON e.course_id = c.id";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                results.add("Student: " + rs.getString("student_name") + " -> Enrolled in: " + rs.getString("course_name"));
            }
        } catch (SQLException e) {
            System.err.println("Database error during join query: " + e.getMessage());
        }
        return results;
    }
}