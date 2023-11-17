package ClasesComplementarias;

import Callback.CallbackFuncion;

public class Tree implements CallbackFuncion {
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

    public void RouteInOrder(CallbackFuncion executeTree) {
        try {
            Stack stackAux = new Stack();
            Tree actualNode = this;

            while (actualNode != null) {
                stackAux.push(actualNode);
                actualNode = actualNode.Sonleft;
            }

            while (!stackAux.isEmpty()==true) {
                actualNode = stackAux.pop();
                executeTree.executeTreeiterative(actualNode);

                if (actualNode.Sonright != null) {
                    for (actualNode = actualNode.Sonright; actualNode != null; actualNode = actualNode.Sonleft) {
                        stackAux.push(actualNode);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("You have been get into a wrong value,please try again");
        }finally {
            System.out.println("¡Thanks for using the program! ");
        }
    }
    @Override
    public void executeTreeiterative(Tree tree) {
        System.out.println(tree.value);
    }
}
