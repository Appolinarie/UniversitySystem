

import java.util.HashMap;
import java.util.Map;

public class Instructor {

    private int id;
    private String name;
    private String specialization;

    private Map<Integer, Course> assignedCourses = new HashMap<>();


    public Instructor(int id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public Map<Integer, Course> getAssignedCourses() {
        return assignedCourses;
    }

    // Assign a course
    public void assignCourse(Course course) {
        assignedCourses.put(course.getCourseid(), course);
    }

    // toString method
    @Override
    public String toString() {
        return
                "ID: " + id + " | Name: " + name + " | Specialization: " + specialization + " | Assigned Courses: " + assignedCourses.size();
    }
}
