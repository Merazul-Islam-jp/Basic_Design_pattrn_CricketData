package SoftwarePattrn;

public class Cricket_Main {
    public static void main(String[] args) {
        CurrentScroeDisplay currentScroeDisplay = new CurrentScroeDisplay();
        AvarageScoreDisplay avarageScoreDisplay = new AvarageScoreDisplay();
        CricketData obj = new CricketData(currentScroeDisplay, avarageScoreDisplay);
        obj.DataChange();
    }

}
