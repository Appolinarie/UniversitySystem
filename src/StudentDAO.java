import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    public void insertStudent(String name, String email, String studentType, double score) {
        String sql = "INSERT INTO Student (id,name, email, student_type, score) VALUES (?,?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.setString(3, studentType);
            pstmt.setDouble(4, score);
            pstmt.executeUpdate();
            System.out.println("Student successfully inserted.");
        } catch (SQLException e) {
            System.err.println("Database error during insert: " + e.getMessage());
        }
    }

    public List<String> getAllStudents() {
        List<String> students = new ArrayList<>();
        String sql = "SELECT * FROM Student";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                String info = "ID: " + rs.getInt("id") +
                        ", Name: " + rs.getString("name") +
                        ", Email: " + rs.getString("email") +
                        ", Type: " + rs.getString("student_type");
                students.add(info);
            }
        } catch (SQLException e) {
            System.err.println("Database error during fetch: " + e.getMessage());
        }
        return students;
    }

    public void deleteStudent(int studentId) {
        String sql = "DELETE FROM Student WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, studentId);
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Student deleted successfully.");
            } else {
                System.out.println("Student ID not found.");
            }
        } catch (SQLException e) {
            System.err.println("Database error during delete: " + e.getMessage());
        }
    }
}