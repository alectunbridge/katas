package katas;

public class ConcreteTreeNode implements TreeNode {
    private final Integer value;
    private TreeNode left;
    private TreeNode right;

    public ConcreteTreeNode(int value) {
        this.value = value;
        left = new NullNode();
        right = new NullNode();
    }

    public void setLeft(ConcreteTreeNode left) {
        this.left = left;
    }

    public void setRight(ConcreteTreeNode right) {
        this.right = right;
    }

    public Integer getValue() {
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
                .formatted(value, left.toString(), right.toString());
    }

    public boolean isEmpty() {
        return false;
    }

    private class NullNode implements TreeNode {
        NullNode() {

        }

        @Override
        public String toString() {
            return "";
        }

        @Override
        public Integer getValue() {
            return null;
        }

        @Override
        public boolean isEmpty() {
            return true;
        }

        @Override
        public TreeNode getLeft() {
            return this;
        }

        @Override
        public TreeNode getRight() {
            return this;
        }
    }
}
