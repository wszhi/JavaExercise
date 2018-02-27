package recursion;


import java.util.ArrayList;

/*

输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。

思路：
根据前序遍历可以知道1是顶部的节点，然后根据中序遍历可知4、7、2是1的左边的节点，剩下的是右边的节点，同理可以递归得到结果
 */
public class ConstructBinaryTree {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre.length <= 0) {
            return null;
        }
        if (in.length <= 0) {
            return null;
        }
        int currentNode = pre[0];
        TreeNode treeNode = new TreeNode(currentNode);

        ArrayList newLeftNodesIn = new ArrayList();
        ArrayList newRightNodesIn = new ArrayList();
        boolean isLeftNode = true;
        for (int i = 0; i < in.length; i++) {
            if (in[i] == currentNode) {
                isLeftNode = false;
                continue;
            } else if (isLeftNode) {
                newLeftNodesIn.add(in[i]);
            } else {
                newRightNodesIn.add(in[i]);
            }
        }

        ArrayList newLeftNodesPre = new ArrayList();
        ArrayList newRightNodesPre = new ArrayList();

        for (int i = 1; i < pre.length; i++) {
            if (newLeftNodesIn.contains(pre[i])) {
                newLeftNodesPre.add(pre[i]);
            } else {
                newRightNodesPre.add(pre[i]);
            }
        }

        treeNode.left = reConstructBinaryTree(listToArray(newLeftNodesPre), listToArray(newLeftNodesIn));
        treeNode.right = reConstructBinaryTree(listToArray(newRightNodesPre), listToArray(newRightNodesIn));

        return treeNode;
    }

    private int[] listToArray(ArrayList list) {
        return list.stream().mapToInt(i -> Integer.parseInt(i.toString())).toArray();
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
