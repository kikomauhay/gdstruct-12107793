import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<Player> playerList = new ArrayList<Player>();
        playerList.add(new Player(1,"Trundle",18));
        playerList.add(new Player(2,"Malphite",10));
        playerList.add(new Player(3,"Darius",16));


        System.out.println("Initial values");
        printArrayList(playerList);

//        int playerIndex = 1;
//        System.out.println("\nGet element at " + playerIndex);
//        System.out.println(playerList.get(playerIndex));
//
//        System.out.println("\ninsert element at " +playerIndex);
//        playerList.add(playerIndex, new Player(4,"Veigar", 10));
//        printArrayList(playerList);
//
//        playerIndex = 0;
//        System.out.println("\nRemove element at " + playerIndex);
//        playerList.remove(playerIndex);
//        printArrayList(playerList);

        System.out.println("\nCheck if player exists");
        boolean found = playerList.contains(new Player(3,"Darius",16));
        int foundIndex = playerList.indexOf(new Player(3,"Darius",16));
        System.out.println("Found player? " + found + " at index " + foundIndex);
    }

    private static void printArrayList(List<Player> players)
    {
//        Method 1:
        for (Player p: players)
        {
            System.out.println(p);
        }

//        Method 2:
//        players.forEach(p -> System.out.println(p));
    }
}
