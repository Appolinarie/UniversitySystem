import java.util.HashSet;
import java.util.Set;

public class Course {

    private int courseid;
    private String coursename;
    private int credithours;

    private Set<Student> enrollmentStudent = new HashSet<>();

    public Course(int courseid, String coursename, int credithours){
        this.courseid =courseid;
        this.coursename =coursename;
        this.credithours =credithours;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public void setCredithours(int credithours) {
        this.credithours = credithours;
    }

    public int getCourseid() {
        return courseid;
    }

    public String getCoursename() {
        return coursename;
    }

    public int getCredithours() {
        return credithours;
    }

    public Set<Student> getEnrollmentStudent() {
        return enrollmentStudent;
    }

    public void setEnrollmentStudent(Set<Student> enrollmentStudent) {
        this.enrollmentStudent = enrollmentStudent;
    }

    public void enrollStudent(Student student){
        enrollmentStudent.add(student);
    }

    @Override
    public String toString(){
        return
                "COURSEID:" + courseid +"|CourseName:" + coursename +"|CreaditHours:" + credithours;
    }
}
