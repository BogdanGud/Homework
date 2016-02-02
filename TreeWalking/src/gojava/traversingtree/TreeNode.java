package gojava.traversingtree;

import java.util.Optional;

public class TreeNode {
    public final Optional<TreeNode> left;
    public final Optional<TreeNode> right;
    public final int key;

    public TreeNode(TreeNode left, TreeNode right, int key) {
        this.left = Optional.ofNullable(left);
        this.right = Optional.ofNullable(right);
        this.key = key;
    }
}

