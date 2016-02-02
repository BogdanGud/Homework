package gojava.traversingtree;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        TreeNode node10 = new TreeNode(null, null, 10);
        TreeNode node4 = new TreeNode(node10, null, 4);
        TreeNode node5 = new TreeNode(null, null, 5);
        TreeNode node1 = new TreeNode(node4, node5, 1);
        TreeNode node7 = new TreeNode(null, null, 7);
        TreeNode node8 = new TreeNode(null, null, 8);
        TreeNode node3 = new TreeNode(node7, node8, 3);
        TreeNode node2 = new TreeNode(node1, node3, 2);

        List<Integer> preorder = Traverser.preorderTravers(node2);
        System.out.println("Preorder traversal: " + preorder.toString());

        List<Integer> postorder = Traverser.postorderTravers(node2);
        System.out.println("Postorder traversal: " + postorder.toString());

        List<Integer> symmetrical = Traverser.symmetricTravers(node2);
        System.out.println("Symmetrycal traversal: " + symmetrical.toString());
    }
}
