import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        CardStack deck = new CardStack();
        CardStack hand = new CardStack();
        CardStack graveyard = new CardStack();
        Scanner scanner = new Scanner(System.in);

        for(int i = 1; i <= 30; i++)
        {
            deck.push(new Card("Card " + i));
        }

        while(!deck.isEmpty())
        {
            GamePlay(deck,hand,graveyard);
            Display(deck,hand,graveyard);

            System.out.println("Press Enter to continue...");
            scanner.nextLine();
        }

        System.out.println("Game Over!");
        scanner.close();
    }

    static void GamePlay(CardStack deck, CardStack hand, CardStack graveyard) {
        int choice = (int) (Math.random() * 3 + 1);
        int x = (int) (Math.random() * 5 + 1);

        switch (choice) {
            case 1: // Draw cards
                System.out.println("Drawing " + x + " cards...");
                for (int i = 0; i < x && !deck.isEmpty(); i++) {
                    hand.push(deck.pop());
                }
                break;
            case 2: // Discard cards
                System.out.println("Discarding " + x + " cards...");
                for (int i = 0; i < x && !hand.isEmpty(); i++) {
                    graveyard.push(hand.pop());
                }
                break;
            case 3: // Retrieve from graveyard
                System.out.println("Retrieving " + x + " cards...");
                for (int i = 0; i < x && !graveyard.isEmpty(); i++) {
                    hand.push(graveyard.pop());
                }
                break;
        }
    }

    static void Display(CardStack deck, CardStack hand, CardStack graveyard) {
        System.out.println("\n--- Game Status ---");
        System.out.println("Deck Count: " + deck.size());
        System.out.println("Hand Count: " + hand.size());
        System.out.println("Graveyard Count: " + graveyard.size());
        System.out.println("-------------------\n");

        CardNode current = hand.getHead();
        while (current != null) {
            System.out.println("- " + current.getCard().getName());
            current = current.getNextCardNode();
        }
    }
}
