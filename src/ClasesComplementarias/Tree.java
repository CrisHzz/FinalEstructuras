package ClasesComplementarias;

public class Tree {
    public int value;
    public Tree Sonleft;

    public Tree Sonright;

    public Tree(int value) {
        this.value = value;
        this.Sonleft = null;
        this.Sonright = null;
    }

    public Tree() {
        this.value = 0;
        this.Sonleft = null;
        this.Sonright = null;
    }



}
