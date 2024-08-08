package katas;



import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DailyCodingProblem20240806Test {
    static final ConcreteTreeNode NODE_0;

    static{
        ConcreteTreeNode node3l = new ConcreteTreeNode(1);
        ConcreteTreeNode node3r = new ConcreteTreeNode(1);

        ConcreteTreeNode node2al = new ConcreteTreeNode(1);
        ConcreteTreeNode node2bl = new ConcreteTreeNode(0);
        node2bl.setLeft(node3l);
        node2bl.setRight(node3r);

        ConcreteTreeNode node1al = new ConcreteTreeNode(1);
        node1al.setLeft(node2al);
        ConcreteTreeNode node1br = new ConcreteTreeNode(0);
        node1br.setLeft(node2bl);

        NODE_0 = new ConcreteTreeNode(0);
        NODE_0.setLeft(node1al);
        NODE_0.setRight(node1br);
    }

    @Test
    void turnTreeToString(){
        /*
         0-5
        /  \
       1-2   0-3
      /     /  \
     1-1   0-2
          / \
        1-1  1-1

    0(1(1))(0(0(1)(1))


        */


        assertThat(NODE_0).hasToString("0(1(1()())())(0(0(1()())(1()()))())");
    }

    @Test
    void testNoOfUnivalTrees() {
        NODE_0.isUnivalSubtreeAndIncrementCount();
        assertThat(NODE_0.getCount()).isEqualTo(5);
    }
}