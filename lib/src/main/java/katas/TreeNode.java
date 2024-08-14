package katas;

public interface TreeNode {
    void setLeft(TreeNode left);

    void setRight(TreeNode right);

    void incrementCount();

    Integer getValue();

    boolean isEmpty();

    TreeNode getLeft();

    TreeNode getRight();

    void setParent(TreeNode parent);

    default boolean isUnivalSubtreeAndIncrementCount() {
        boolean isUnivalOnLeft = getLeft().isUnivalSubtreeAndIncrementCount();
        boolean isUnivalOnRight = getRight().isUnivalSubtreeAndIncrementCount();
        if ((getLeft().isEmpty() || isUnivalOnLeft && getValue().equals(getLeft().getValue())) &&
            (getRight().isEmpty() || isUnivalOnRight && getValue().equals(getRight().getValue()))) {
            incrementCount();
            return true;
        }
        return false;
    }

    int getCount();
}
