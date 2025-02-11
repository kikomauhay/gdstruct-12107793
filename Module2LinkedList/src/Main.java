public class Main {
    public static void main(String[] args)
    {
        PlayerLinkedList playerLinkedList = new PlayerLinkedList();
        playerLinkedList.addToFront(new Player(1,"Chinatsu", 100));
        playerLinkedList.addToFront(new Player (2, "Taiki", 50));
        playerLinkedList.addToFront(new Player (3, "Hina", 75));

        playerLinkedList.size();
        playerLinkedList.printLinkedList();

        playerLinkedList.remove();
        playerLinkedList.size();
        playerLinkedList.printLinkedList();

        System.out.println("\nCheck if player exists");
        boolean found = playerLinkedList.contains(new Player (1,"Chinatsu", 100));
        int foundIndex = playerLinkedList.indexOf(new Player (1,"Chinatsu", 100));
        System.out.println("Found player? " + found + " at index " + foundIndex);
    }
}
