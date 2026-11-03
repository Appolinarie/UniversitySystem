import java.util.HashSet;
import java.util.Set;

public class Course {
    private int courseId;
    private String courseName;
    private int credits;
    private Instructor instructor;
    private Set<Student> roster;

    public Course() {
        this.roster = new HashSet<>();
    }

    public Course(int courseId, String courseName, int credits, Instructor instructor) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
        this.instructor = instructor;
        this.roster = new HashSet<>();
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCredits() {
        return credits;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }


    public Set<Student> getRoster() {
        return roster;
    }

    public void setRoster(Set<Student> roster) {
        this.roster = roster;
    }


    public void addStudentToRoster(Student student) {
        roster.add(student);
    }

    @Override
    public String toString() {
        return "Course [ID: " + courseId + ", Name: " + courseName + ", Credits: " + credits + "]";
    }
}