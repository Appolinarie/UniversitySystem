
public class Enrollment {
    private int enrollmentId;
    private String studentName;
    private String courseName;
    private Double grade;

    public Enrollment(int enrollmentId, String studentName, String courseName, Double grade) {
        this.enrollmentId = enrollmentId;
        this.studentName = studentName;
        this.courseName = courseName;
        this.grade = grade;
    }

    public void setEnrollmentId(int enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public int getEnrollmentId() {
     return enrollmentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getCourseName() {
        return courseName;
    }

    public Double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Enrollment{id=" + enrollmentId + ", student='" + studentName +
                "', course='" + courseName + "', grade=" + (grade == null ? "not graded" : grade) + "}";
    }
}
