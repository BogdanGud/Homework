package gojava.traversingtree;


public class Traverser {
    public static void preorderTravers(Tree treeNode) {
        if (treeNode != null) {
            System.out.print(treeNode.getKey() + ", ");
            preorderTravers(treeNode.getLeft());
            preorderTravers(treeNode.getRight());
        }

    }

    public static void revertWalk(Tree treeNode) {
        if (treeNode == null) {
            return;
        }
        if (treeNode.getLeft() == null && treeNode.getRight() == null) {
            System.out.print(treeNode.getKey() + ", ");
        } else {
            revertWalk(treeNode.getLeft());
            revertWalk(treeNode.getRight());
            System.out.print(treeNode.getKey() + ", ");
        }
    }

    public static void symmetricWalk(Tree treeNode) {
        if (treeNode != null) {
            symmetricWalk(treeNode.getLeft());
            System.out.print(treeNode.getKey() + ", ");
            symmetricWalk(treeNode.getRight());
        }
    }
}
