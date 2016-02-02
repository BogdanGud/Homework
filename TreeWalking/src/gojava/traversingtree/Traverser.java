package gojava.traversingtree;


import java.util.ArrayList;
import java.util.List;

public class Traverser {
    public static List<Integer> preorderTravers(TreeNode treeNode) {
        List<Integer> keys = new ArrayList<Integer>();
        preorderTravers(treeNode, keys);
        return keys;
    }

    private static void preorderTravers(TreeNode treeNode, List<Integer> keys) {
        if (treeNode != null) {
            keys.add(treeNode.key);
            if (treeNode.left.isPresent()) {
                preorderTravers(treeNode.left.get(), keys);
            }
            if (treeNode.right.isPresent()) {
                preorderTravers(treeNode.right.get(), keys);
            }
        }
    }

    public static List<Integer> postorderTravers(TreeNode treeNode) {
        List<Integer> keys = new ArrayList<Integer>();
        postorderTravers(treeNode, keys);
        return keys;
    }


    public static void postorderTravers(TreeNode treeNode, List<Integer> keys) {
        if (treeNode == null) {
            return;
        }
        if (!treeNode.left.isPresent() && !treeNode.right.isPresent()) {
            keys.add(treeNode.key);
        } else {
            if (treeNode.left.isPresent()) {
                postorderTravers(treeNode.left.get(), keys);
            }
            if (treeNode.right.isPresent()) {
                postorderTravers(treeNode.right.get(), keys);
            }
            keys.add(treeNode.key);
        }
    }

    public static List<Integer> symmetricTravers(TreeNode treeNode) {
        List<Integer> keys = new ArrayList<Integer>();
        symmetricTravers(treeNode, keys);
        return keys;
    }

    private static void symmetricTravers(TreeNode treeNode, List<Integer> keys) {
        if (treeNode == null) {
            return;
        }
        if (treeNode.left.isPresent()) {
            symmetricTravers(treeNode.left.get(), keys);
        }
        keys.add(treeNode.key);
        if (treeNode.right.isPresent()) {
            symmetricTravers(treeNode.right.get(), keys);
        }
    }
}
