import ClasesComplementarias.*;
public class Main {
    public static Tree createTree(int value, Tree Sonleft, Tree Sonright) {
        Tree nodeTree = new Tree(value);
        nodeTree.Sonleft = Sonleft;
        nodeTree.Sonright = Sonright;
        return nodeTree;
    }
    public static void main(String[] args) {
        System.out.println("The route in order of the tree is: ");
        Tree node9 = createTree(9, null, null);
        Tree node4 = createTree(4, null, node9);
        Tree node2 = createTree(2, node4, null);
        Tree node6 = createTree(6, null, null);
        Tree node7 = createTree(7, null, null);
        Tree node3 = createTree(3, node6, node7);
        Tree daddyTree = createTree(1, node2, node3);
        daddyTree.RouteInOrder(new Tree());
        //Este arbol fue creado de abajo hacia arriba para que sea mas facil de visualizar tambien puedes crearlo de arriba hacia abajo pero la funcion CreateTree no va a servir
    }
}
