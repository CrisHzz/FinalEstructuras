package ClasesComplementarias;

public class NodeTree {
    private Tree value;

    private NodeTree next;

    public NodeTree(Tree value, NodeTree next) {
        this.value = value;
        this.next = next;
    }

    public NodeTree(Tree value) {
        this.value = value;
        this.next = null;
    }

    public NodeTree() {
        this.value = null;
        this.next = null;
    }

    public Tree getValue() {
        return value;
    }

    public void setValue(Tree value) {
        this.value = value;
    }

    public NodeTree getNext() {
        return next;
    }

    public void setNext(NodeTree next) {
        this.next = next;
    }

}
