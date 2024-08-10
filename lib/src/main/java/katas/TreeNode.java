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
        if (getLeft().isEmpty() && getRight().isEmpty()) {
            incrementCount();
            return true;
        }

        boolean isUnivalTreeOnLeft = getLeft().isUnivalSubtreeAndIncrementCount();
        boolean isUnivalTreeOnRight = getRight().isUnivalSubtreeAndIncrementCount();

        if (getLeft().isEmpty() && isUnivalTreeOnRight && getValue().equals(getRight().getValue()) ||
            getRight().isEmpty() && isUnivalTreeOnLeft && getValue().equals(getLeft().getValue())) {
            incrementCount();
            return true;
        }

        if (getValue().equals(getLeft().getValue()) && getLeft().getValue().equals(getRight().getValue()) &&
            isUnivalTreeOnLeft && isUnivalTreeOnRight) {
            incrementCount();
            return true;
        }
        return false;
    }

    int getCount();
}
