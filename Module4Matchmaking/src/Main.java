import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PlayerQueue players = new PlayerQueue(10);
        Random random = new Random();
        int gameCount = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Starting Matchmaking...");

        while (gameCount < 10) { // Loop until 10 games are completed
            System.out.println("\nPress Enter to Continue...");
            scanner.nextLine();

            int newPlayers = random.nextInt(7) + 1;
            System.out.println("\nAdding " + newPlayers + " players to the queue...");

            for (int i = 0; i < newPlayers; i++) {
                int playerId = random.nextInt(7); // Random ID
                players.enqueue(new Player(playerId, "Player" + playerId,
                        random.nextInt(100) + 1));
            }

            players.printQueue();

            if (players.getSize() >= 5) { // If we have enough players, start a game
                System.out.println("\nStarting Game " + (gameCount + 1) + " with 5 players!");

                for (int i = 0; i < 5; i++) {
                    Player removedPlayer = players.dequeue();
                    System.out.println(" -> " + removedPlayer.getName() + " joined the match!");
                }

                gameCount++;
            } else {
                System.out.println("\nNot enough players for a match, waiting for more...");
            }
        }

        System.out.println("\nMatchmaking complete! 10 games have been played.");
        scanner.close(); // Close scanner to prevent resource leak
    }
}
