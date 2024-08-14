package katas;

public class ConcreteTreeNode implements TreeNode {
    private final Integer value;
    private TreeNode left;
    private TreeNode right;
    private TreeNode parent;
    private int count;

    public ConcreteTreeNode(int value) {
        this.value = value;
        parent = new NullNode();
        left = new NullNode();
        right = new NullNode();
    }

    @Override
    public void setLeft(TreeNode left) {
        left.setParent(this);
        this.left = left;
    }

    @Override
    public void setRight(TreeNode right) {
        right.setParent(this);
        this.right = right;
    }

    @Override
    public void incrementCount() {
        count++;
        if (!parent.isEmpty()) {
            parent.incrementCount();
        }
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
    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "%d(%s)(%s)".formatted(value, left.toString(), right.toString());
    }

    public boolean isEmpty() {
        return false;
    }

    @Override
    public int getCount() {
        return count;
    }

    private class NullNode implements TreeNode {
        @Override
        public void setLeft(TreeNode left) {
            throw new UnsupportedOperationException("Cannot set children on null node");
        }

        @Override
        public void setRight(TreeNode right) {
            throw new UnsupportedOperationException("Cannot set children on null node");
        }

        @Override
        public void incrementCount() {
            //do nowt
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

        @Override
        public void setParent(TreeNode parent) {
            //do nowt
        }

        @Override
        public int getCount() {
            return count;
        }

        @Override
        public boolean isUnivalSubtreeAndIncrementCount() {
            return false;
        }
    }
}
