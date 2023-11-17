package ClasesComplementarias;

public class Stack {
    private Node peak;

    public Stack() {
        this.peak = null;
    }

    public void push(Tree value) {
        Node newNode = new Node(value, this.peak);
        this.peak = newNode;
    }

    public Tree pop() {
        Tree value = this.peak.getValue();
        this.peak = this.peak.getNext();
        return value;
    }


    public boolean isEmpty() {
        return this.peak == null;
    }




}
