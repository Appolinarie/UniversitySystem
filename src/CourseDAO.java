
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CourseDAO {

    public void insertCourse(String courseName, int credits) {
        String sql = "INSERT INTO courses (course_name, credits) VALUES (?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, courseName);
            pstmt.setInt(2, credits);
            pstmt.executeUpdate();
            System.out.println("Course successfully added.");
        } catch (SQLException e) {
            System.err.println("Database error: " + e.getMessage());
        }
    }

    public List<String> getAllCourses() {
        List<String> courses = new ArrayList<>();
        String sql = "SELECT * FROM courses";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                courses.add("Course ID: " + rs.getInt("id") + ", Name: " + rs.getString("course_name") + ", Credits: " + rs.getInt("credits"));
            }
        } catch (SQLException e) {
            System.err.println("Database error: " + e.getMessage());
        }
        return courses;
    }
}