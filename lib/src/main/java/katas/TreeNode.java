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
        isUnivalTreeOnLeft();
        isUnivalTreeOnRight();
        if (isLeafNode() ||
            leftOrRightAreEitherEmptyOrUnivalTreesOfSameValue() ||
            bothLeftAndRightAreUnivalTreesAndHaveSameValue()) {
                incrementCount();
                return true;
        }
        return false;
    }

    boolean isUnivalTreeOnLeft();

    boolean isUnivalTreeOnRight();

    private boolean leftOrRightAreEitherEmptyOrUnivalTreesOfSameValue() {
        return getLeft().isEmpty() && isUnivalTreeOnRight() && getValue().equals(getRight().getValue()) ||
               getRight().isEmpty() && isUnivalTreeOnLeft() && getValue().equals(getLeft().getValue());
    }

    private boolean bothLeftAndRightAreUnivalTreesAndHaveSameValue() {
        return getValue().equals(getLeft().getValue()) && getLeft().getValue().equals(getRight().getValue())
               && isUnivalTreeOnLeft() && isUnivalTreeOnRight();
    }

    private boolean isLeafNode() {
        return getLeft().isEmpty() && getRight().isEmpty();
    }

    int getCount();
}
