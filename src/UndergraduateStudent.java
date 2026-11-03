
public class UndergraduateStudent extends Student {
    private double ugScoreAverage;

    public UndergraduateStudent(int id, String name, String email, double ugScoreAverage) {
        super(id, name, email);
        this.ugScoreAverage = ugScoreAverage;
    }

    public double getUgScoreAverage() {
        return ugScoreAverage;
    }

    public void setUgScoreAverage(double ugScoreAverage) {
        this.ugScoreAverage = ugScoreAverage;
    }

    @Override
    public double calculateGPA() {
        return (ugScoreAverage / 100.0) * 4.0;
    }

    @Override
    public String toString() {
        return "Undergraduate Student [" + super.toString() + ", UG Score Avg: " + ugScoreAverage + "]";
    }
}