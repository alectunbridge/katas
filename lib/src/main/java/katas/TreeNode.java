package katas;

public interface TreeNode {
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

        if (getValue().equals(getLeft().getValue()) &&
            getLeft().getValue().equals(getRight().getValue())
            && isUnivalTreeOnLeft && isUnivalTreeOnRight) {
            incrementCount();
            return true;
        }
        return false;
    }

    int getCount();
}
