package gojava.traversingtree;

public class Main {

    public static void main(String[] args) {

        Tree tree2 = new Tree(2);
        Tree tree1 = new Tree(1);
        Tree tree3 = new Tree(3);
        Tree tree4 = new Tree(4);
        Tree tree5 = new Tree(5);
        Tree tree7 = new Tree(7);
        Tree tree8 = new Tree(8);
        Tree tree10 = new Tree(10);

        tree2.setLeft(tree1);
        tree2.setRight(tree3);

        tree1.setLeft(tree4);
        tree1.setRight(tree5);

        tree3.setLeft(tree7);
        tree3.setRight(tree8);

        tree4.setLeft(tree10);

        System.out.println("Preorder traversal:");
        Traverser.preorderTravers(tree2);
        System.out.println();

        System.out.println("Postorder traversal:");
        Traverser.revertWalk(tree2);
        System.out.println();

        System.out.println("Summetrycal traversal:");
        Traverser.symmetricWalk(tree2);
    }


}
