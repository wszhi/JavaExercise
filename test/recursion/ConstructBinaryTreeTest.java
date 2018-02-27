package recursion;

import org.junit.Test;

public class ConstructBinaryTreeTest {

    @Test
    public void should_return_nodes() throws Exception {
        ConstructBinaryTree constructBinaryTree = new ConstructBinaryTree();
        int[] pre={1,2,4,7,3,5,6,8};
        int[] in={4,7,2,1,5,3,8,6};
        ConstructBinaryTree.TreeNode treeNode = constructBinaryTree.reConstructBinaryTree(pre, in);
        System.out.println(treeNode);
    }
}