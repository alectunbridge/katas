package katas;

public class TreeNode {
    private final int value;
    private TreeNode left;
    private TreeNode right;

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public TreeNode(Integer value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }

    @Override
    public String toString() {
        return "%d(%s)(%s)"
                .formatted(value, left == null ? "" : left.toString(), right == null ? "" : right.toString());
    }
}
