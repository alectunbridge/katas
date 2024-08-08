package katas;

public class DailyCodingProblem20240806 {

    private int count = 0;

    public boolean isUnivalSubtreeAndIncrementCount(TreeNode currentNode) {
        if (currentNode.getLeft().isEmpty() && currentNode.getRight().isEmpty()) {
            count++;
            return true;
        }

        boolean isUnivalTreeOnLeft = isUnivalSubtreeAndIncrementCount(currentNode.getLeft());
        boolean isUnivalTreeOnRight = isUnivalSubtreeAndIncrementCount(currentNode.getRight());

        if (currentNode.getValue().equals(currentNode.getLeft().getValue()) &&
            currentNode.getLeft().getValue().equals(currentNode.getRight().getValue())
            && isUnivalTreeOnLeft && isUnivalTreeOnRight) {
            count++;
            return true;
        }
        return false;
    }

    public int getCount() {
        return count;
    }
}
