import java.util.ArrayList;
import java.util.List;

public class Instructor {
    private int id;
    private String name;
    private String email;
    private String department;
    private List<Course> assignedCourses;

    public Instructor() {
        this.assignedCourses = new ArrayList<>();
    }

    public Instructor(int id, String name, String email, String department) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.department = department;
        this.assignedCourses = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
    public String getDepartment() {
        return department;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<Course> getAssignedCourses() {
        return assignedCourses;
    }
    public void setAssignedCourses(List<Course> assignedCourses) {
        this.assignedCourses = assignedCourses;
    }

    public void assignCourse(Course course) {
        assignedCourses.add(course);
    }

    @Override
    public String toString() {
        return "Instructor [ID: " + id + ", Name: " + name + ", Email: " + email + ", Department: " + department + ", Assigned Courses: " + assignedCourses.size() + "]";
    }
}