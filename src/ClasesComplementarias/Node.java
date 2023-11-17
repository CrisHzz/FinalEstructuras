package ClasesComplementarias;

public class Node {
    private Tree value;

    private Node next;

    public Node(Tree value, Node next) {
        this.value = value;
        this.next = next;
    }

    public Node(Tree value) {
        this.value = value;
        this.next = null;
    }

    public Node() {
        this.value = null;
        this.next = null;
    }

    public Tree getValue() {
        return value;
    }

    public void setValue(Tree value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}
