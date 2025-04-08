public class Main {
    public static void main(String[] args){
        Tree tree = new Tree();
        tree.insert(11);
        tree.insert(1);
        tree.insert(25);
        tree.insert(30);
        tree.insert(7);

        tree.inOrderTraverse();

        int searchValue = 25;
        System.out.println("\nNode for value " + searchValue + " = " + tree.get(searchValue));

        tree.inOrderTraverseDescending();

        System.out.println("\nMin Value: " + tree.getMin());
        System.out.println("\nMax Value: " + tree.getMax());

    }
}
