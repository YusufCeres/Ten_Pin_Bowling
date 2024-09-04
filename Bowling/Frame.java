public class Frame {
    private int firstRoll;
    private int secondRoll;
    private int bonus;
    private boolean isStrike;
    private boolean isSpare;
    
    public Frame() {
        this.firstRoll = 0;
        this.secondRoll = 0;
        this.bonus = 0;
        this.isStrike = false;
        this.isSpare = false;
    }
    
    public void setFirstRoll(int pins) {
        this.firstRoll = pins;
        if (pins == 10) {
            this.isStrike = true;
        }
    }
    
    public void setSecondRoll(int pins) {
        this.secondRoll = pins;
        if (firstRoll + secondRoll == 10) {
            this.isSpare = true;
        }
    }
    
    public int getScore() {
        return firstRoll + secondRoll + bonus;
    }
    
    public boolean isStrike() {
        return isStrike;
    }
    
    public boolean isSpare() {
        return isSpare;
    }
    
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
