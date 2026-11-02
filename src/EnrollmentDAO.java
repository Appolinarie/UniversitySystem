import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EnrollmentDAO {

    // UPDATE ENROLLMENT
    public void updateEnrollment(int enrollmentId, String status) {

        String sql = "UPDATE enrollments SET status = ? WHERE enrollment_id = ?";

        try (
                Connection con = DBConnection.getConnection();
                PreparedStatement pst = con.prepareStatement(sql)
        ) {

            pst.setString(1, status);
            pst.setInt(2, enrollmentId);

            int rows = pst.executeUpdate();

            if (rows > 0) {
                System.out.println("Enrollment updated successfully!");
            } else {
                System.out.println("Enrollment not found!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}