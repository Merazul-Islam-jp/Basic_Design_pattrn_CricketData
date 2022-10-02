package SoftwarePattrn;

public class CurrentScroeDisplay {
    private int run;
    private int wik;
    private float over;

    public void update(int run, int wik, float over) {
        this.over = over;
        this.wik = wik;
        this.run = run;
        Display();
    }

    public void Display() {
        System.out.println("\nCurrent Score Display: \n" +
                "Runs: " + run + "\nWickets:"
                + wik + "\nOvers: " + over);
    }

}
