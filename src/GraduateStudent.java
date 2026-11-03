public class GraduateStudent extends Student {
    private double researchScore;

    public GraduateStudent(int id, String name, String email, double researchScore) {
        super(id, name, email);
        this.researchScore = researchScore;
    }

    public double getResearchScore() { return researchScore; }
    public void setResearchScore(double researchScore) { this.researchScore = researchScore; }

    @Override
    public double calculateGPA() {
        return Math.min(4.0, (researchScore / 90.0) * 4.0);
    }

    @Override
    public String toString() {
        return "Graduate Student [" + super.toString() + ", Research Score: " + researchScore + "]";
    }
}