import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    private List<Player> players;
    private List<Frame> frames;

    public Game() {
        players = new ArrayList<>();
        frames = new ArrayList<>();
    }

    public void addPlayer(String name) {
        players.add(new Player(name));
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);

        for (int frameIndex = 0; frameIndex < 10; frameIndex++) {
            for (Player player : players) {
                System.out.println("Frame " + (frameIndex + 1) + " for " + player.getName());
                Frame frame = new Frame();

                // First roll
                System.out.print("Enter first roll: ");
                int firstRoll = scanner.nextInt();
                frame.setFirstRoll(firstRoll);

                if (!frame.isStrike()) { // If not a strike, roll again
                    System.out.print("Enter second roll: ");
                    int secondRoll = scanner.nextInt();
                    frame.setSecondRoll(secondRoll);
                }

                // Calculate bonuses
                if (frameIndex > 0) {
                    Frame previousFrame = frames.get((frameIndex - 1) * players.size() + players.indexOf(player));
                    if (previousFrame.isStrike()) {
                        previousFrame.setBonus(firstRoll + frame.getScore());
                    } else if (previousFrame.isSpare()) {
                        previousFrame.setBonus(firstRoll);
                    }
                }

                // Add the frame
                frames.add(frame);
                player.setScore(frameIndex, frame.getScore());
            }

            displayScores();
        }

        scanner.close();
    }

    public void displayScores() {
        for (Player player : players) {
            System.out.println("Scores for " + player.getName() + ": " + player.getTotalScore());
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int numPlayers = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline

        for (int i = 0; i < numPlayers; i++) {
            System.out.print("Enter name for player " + (i + 1) + ": ");
            String playerName = scanner.nextLine();
            game.addPlayer(playerName);
        }

        game.playGame();
        scanner.close();
    }
}
