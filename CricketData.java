package SoftwarePattrn;

public class CricketData {

    int run;
    int wik;
    float over;
    CurrentScroeDisplay currentScroeDisplay;
    AvarageScoreDisplay avarageScoreDisplay;

    CricketData(CurrentScroeDisplay currentScroeDisplay, AvarageScoreDisplay avarageScoreDisplay) {
        this.avarageScoreDisplay = avarageScoreDisplay;
        this.currentScroeDisplay = currentScroeDisplay;
    }

    private int getLatestRun() {
        return 90;

    }

    private int getLatestWik() {
        return 2;
    }

    private float getLatestOver() {
        return (float) 10.2;
    }

    public void DataChange() {
        this.run = getLatestRun();
        this.wik = getLatestWik();
        this.over = getLatestOver();
        currentScroeDisplay.update(run, wik, over);
        avarageScoreDisplay.update(run, wik, over);
    }

}
