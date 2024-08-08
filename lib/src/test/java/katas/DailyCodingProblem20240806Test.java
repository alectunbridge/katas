package katas;



import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DailyCodingProblem20240806Test {
    static final TreeNode NODE_0;

    static{
        TreeNode node3l = new TreeNode(1);
        TreeNode node3r = new TreeNode(1);

        TreeNode node2al = new TreeNode(1);
        TreeNode node2bl = new TreeNode(0);
        node2bl.setLeft(node3l);
        node2bl.setRight(node3r);

        TreeNode node1al = new TreeNode(1);
        node1al.setLeft(node2al);
        TreeNode node1br = new TreeNode(0);
        node1br.setLeft(node2bl);

        NODE_0 = new TreeNode(0);
        NODE_0.setLeft(node1al);
        NODE_0.setRight(node1br);
    }

    @Test
    void turnTreeToString(){
        /*
         0
        / \
       1   0
      /   / \
     1   0
        / \
       1   1

    0(1(1))(0(0(1)(1))


        */


        assertThat(NODE_0).hasToString("0(1(1()())())(0(0(1()())(1()()))())");
    }

    @Test
    void testNoOfUnivalTrees() {
        DailyCodingProblem20240806 solver = new DailyCodingProblem20240806();
        assertThat(solver.findUnivalSubtrees(NODE_0)).isEqualTo(5);
    }
}