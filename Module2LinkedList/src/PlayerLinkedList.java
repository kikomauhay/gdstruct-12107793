import java.util.Objects;

public class PlayerLinkedList {
    private PlayerNode head;
    private int size;

    public void addToFront(Player player)
    {
     PlayerNode newNode = new PlayerNode(player);
     newNode.setNextPlayerNode(head);
     head = newNode;
     size++;
    }
    public void remove()
    {
        head = head.getNextPlayerNode();
        size--;
    }

    public int size()
    {
        return size;
    }

    public boolean contains(Player player)
    {
        PlayerNode current = head;
        while (current != null)
        {
            if (current.getPlayer().equals(player))
            {
                return true;
            }
            current = current.getNextPlayerNode();
        }
        return false;
    }

    public int indexOf(Player player)
    {
        PlayerNode current = head;
        int index = 0;
        while (current != null)
        {
            if (current.getPlayer().equals(player))
            {
                return index;
            }
            current = current.getNextPlayerNode();
            index++;
        }
        return -1; // Not found
    }

    public void printLinkedList()
    {
        System.out.println("[HEAD] -> " );
        PlayerNode current = head;

        while(current != null)
        {
            System.out.println(current.getPlayer() + " -> ");
            current = current.getNextPlayerNode();

        }
        System.out.print("NULL");
        System.out.print("\n\n List Size: " + size());
    }
}
