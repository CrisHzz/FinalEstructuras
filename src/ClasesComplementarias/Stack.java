package ClasesComplementarias;

public class Stack {
    private NodeTree peak;

    public Stack() {
        this.peak = null;
    }

    public void push(Tree value) {
        this.peak = new NodeTree(value, this.peak);
    }

    public Tree pop() {
        Tree value = this.peak.getValue();
        this.peak = this.peak.getNext();
        return value;
    }

    public boolean isEmpty() {
        return this.peak == null;
    }

    public void clear(){
        this.peak = null;
    }

    public NodeTree getPeak() {
        return peak;
    }

    public void setPeak(NodeTree peak) {
        this.peak = peak;
    }
}
