
public class GraduateStudent extends Student {

    private double researchScore;


    public GraduateStudent(int id, String name,
                           int age, double researchScore) {
        super(id, name, age);
        this.researchScore = researchScore;
    }


    public void setResearchScore(double researchScore) {
        this.researchScore = researchScore;
    }


    public double getResearchScore() {
        return researchScore;
    }


    @Override
    public double calculateGpa() {
        return researchScore / 25;
    }


    @Override
    public String toString() {
        return
                super.toString() + " | Research Score: " + researchScore;
    }
}
