package gojava.traversingtree;

public class Tree {
    Tree left;
    Tree right;
    Tree parent;
    int key;

    public Tree(Tree left, Tree right, Tree parent, int key) {
        this.setLeft(left);
        this.setRight(right);
        this.setParent(parent);
        this.setKey(key);
    }

    public Tree() {

    }

    public Tree(int key) {
        this.setKey(key);
    }

    public Tree getLeft() {
        return left;
    }

    public void setLeft(Tree left) {
        this.left = left;
        left.setParent(this);
    }

    public Tree getRight() {
        return right;
    }

    public void setRight(Tree right) {
        this.right = right;
        right.setParent(this);
    }

    public Tree getParent() {
        return parent;
    }

    public void setParent(Tree parent) {
        this.parent = parent;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
}

