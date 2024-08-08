package katas;

public class DailyCodingProblem20240806 {

    private int count = 0;

    public boolean findUnivalSubtrees(TreeNode currentNode) {
        if (currentNode.getLeft() == null && currentNode.getRight() == null) {
            count++;
            return true;
        }

        if (currentNode.getValue() == currentNode.getLeft().getValue() &&
            currentNode.getLeft().getValue() == currentNode.getRight().getValue()
            & findUnivalSubtrees(currentNode.getLeft()) & findUnivalSubtrees(currentNode.getRight())) {
            count++;
            return true;
        }
        return false;
    }

    public int getCount() {
        return count;
    }
}
