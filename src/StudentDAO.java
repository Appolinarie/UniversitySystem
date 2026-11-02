
import java.sql.*;

public class StudentDAO {


    public void insertStudent(int id, String name, int age, double gpa) {

        String sql = "INSERT INTO student(student_id, student_name, age, gpa) VALUES (?, ?, ?, ?)";

        try (
                Connection con = DBConnection.getConnection();
                PreparedStatement pst = con.prepareStatement(sql)
        ) {

            pst.setInt(1, id);
            pst.setString(2, name);
            pst.setInt(3, age);
            pst.setDouble(4, gpa);

            pst.executeUpdate();

            System.out.println("Student inserted successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    public void deleteStudent(int studentId) {

        String sql = "DELETE FROM Student WHERE student_id = ?";

        try (
                Connection con = DBConnection.getConnection();
                PreparedStatement pst = con.prepareStatement(sql)
        ) {

            pst.setInt(1, studentId);

            int rows = pst.executeUpdate();

            if (rows > 0) {
                System.out.println("Student deleted successfully!");
            } else {
                System.out.println("Student not found!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
