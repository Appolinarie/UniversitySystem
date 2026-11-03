import java.util.HashSet;
import java.util.Set;

public abstract class Student {
    private int id;
    private String name;
    private String email;
    private Set<Course> enrolledCourses;

    public Student() {
        this.enrolledCourses = new HashSet<>();
    }

    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.enrolledCourses = new HashSet<>();
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



    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public Set<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(Set<Course> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }


    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
    }

    public void dropCourse(Course course) {
        enrolledCourses.remove(course);
    }


    public abstract double calculateGPA();

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Email: " + email + ", Courses Enrolled: " + enrolledCourses.size();
    }
}