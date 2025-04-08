public class Tree {
    private Node root;

    public void insert(int value){
        if(root == null)
        {
            root =  new Node(value);
            return;
        }

        root.insert(value);
    }

    public void inOrderTraverse(){
        if (root == null){
            System.out.println("Tree is empty.");
            return;
        }

        root.inOrderTraverse();
    }

    public void inOrderTraverseDescending() {
        if (root == null) {
            System.out.println("Tree is empty.");
            return;
        }
        root.traverseInOrderDescending();
    }

    public Node get(int value){
        if (root == null){
           return null;
        }

        return root.get(value);
    }

    public Node getMin() {
        if (root == null) {
            return null;
        }
        return root.getMin();
    }

    public Node getMax() {
        if (root == null) {
            return null;
        }
        return root.getMax();
    }
}
