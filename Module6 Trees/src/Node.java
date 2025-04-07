public class Node {
    private int data;
    private Node leftChild;
    private Node rightChild;

    public Node(int value){
        this.data = value;
        leftChild = null;
        rightChild = null;
    }

    public void insert(int value){
        if(data == value){
            return;
        }

        if(data > value){
            if(rightChild == null) {
                rightChild = new Node(value);
            }
            else{
                rightChild.insert(value);
            }
        }
        else{
            if(leftChild == null){
                leftChild = new Node(value);
            }
            else{
                leftChild.insert(value);
            }
        }
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
}
