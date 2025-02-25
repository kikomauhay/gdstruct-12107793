public class CardStack {
    private CardNode head;
    private int size;

    public void push(Card card) {
        CardNode newNode = new CardNode(card);
        newNode.setNextCardNode(head);
        head = newNode;
        size++;
    }
    public Card pop() {
        if (isEmpty()) {
            return null;
        }
        Card removedCard = head.getCard();
        head = head.getNextCardNode();
        size--;
        return removedCard;
    }
    public int size()
    {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public CardNode getHead() {
        return head;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        CardNode current = head;
        while (current != null) {
            sb.append(current.getCard().getName());
            if (current.getNextCardNode() != null) {
                sb.append(", ");
            }
            current = current.getNextCardNode();
        }
        sb.append("]");
        return sb.toString();
    }
}
