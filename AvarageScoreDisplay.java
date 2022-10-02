package SoftwarePattrn;

public class AvarageScoreDisplay {

    private float runRate;
    private int PredictedScore;

    public void update(int run, int wik, float over) {
        this.runRate = (float) (run / over);
        this.PredictedScore = (int) (runRate * 50);
        display();
    }

    void display() {
        System.out.println("Avarage Score Display:\n" + "RunRate:" + runRate + "\nPridictedScore:"
                + PredictedScore);

    }

}
