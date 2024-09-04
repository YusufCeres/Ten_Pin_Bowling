public class Player {
    private String name;
    private int[] scores;
    
    public Player(String name) {
        this.name = name;
        this.scores = new int[10]; // Ten frames in bowling
    }
    
    public String getName() {
        return name;
    }
    
    public int[] getScores() {
        return scores;
    }
    
    public void setScore(int frame, int score) {
        this.scores[frame] = score;
    }
    
    public int getTotalScore() {
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        return total;
    }
}
