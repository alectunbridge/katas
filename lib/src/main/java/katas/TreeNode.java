package katas;

import java.util.Optional;

public class TreeNode {
    protected final Integer value;
    protected Optional<TreeNode> left;
    protected Optional<TreeNode> right;
    protected Optional<TreeNode> parent;
    private int count;

    public TreeNode(int value) {
        this.value = value;
        left = Optional.empty();
        right = Optional.empty();
        parent = Optional.empty();
    }

    public void setLeft(TreeNode left) {
        left.parent = Optional.of(this);
        this.left = Optional.of(left);
    }

    public void setRight(TreeNode right) {
        right.parent = Optional.of(this);
        this.right = Optional.of(right);
    }

    public Integer getValue() {
        return value;
    }

    public int getCount() {
        return count;
    }

    public void incrementCount() {
        count++;
        parent.ifPresent(TreeNode::incrementCount);
    }

    public boolean isUnivalSubtreeAndIncrementCount() {
        boolean isUnivalOnLeft = left.map(TreeNode::isUnivalSubtreeAndIncrementCount).orElse(false);
        boolean isUnivalOnRight = right.map(TreeNode::isUnivalSubtreeAndIncrementCount).orElse(false);
        if ((left.isEmpty() || isUnivalOnLeft && getValue().equals(left.map(TreeNode::getValue).orElse(null))) &&
            (right.isEmpty() || isUnivalOnRight && getValue().equals(right.map(TreeNode::getValue).orElse(null)))) {
            incrementCount();
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "%d(%s)(%s)".formatted(value,
                left.map(node -> String.valueOf(node.toString())).orElse(""),
                right.map(node -> String.valueOf(node.toString())).orElse(""));
    }
}
