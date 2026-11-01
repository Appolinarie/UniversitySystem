
public class UndergraduateStudent extends Student {

    private double marks;


    public UndergraduateStudent(int id, String name,
                                int age, double marks) {
        super(id, name, age);
        this.marks = marks;
    }


    public void setMarks(double marks) {
        this.marks = marks;
    }


    public double getMarks() {
        return marks;
    }


    @Override
    public double calculateGpa() {
        return marks / 20;
    }


    @Override
    public String toString() {
        return
                super.toString() + " | Marks: " + marks;
    }
}
