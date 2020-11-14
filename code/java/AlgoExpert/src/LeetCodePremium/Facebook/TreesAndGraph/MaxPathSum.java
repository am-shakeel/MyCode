package LeetCodePremium.Facebook.TreesAndGraph;

public class MaxPathSum {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    }

    int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        if(root.left == null && root.right == null){
            return root.val ;
        }

        helper(root);
        return max;
    }

    public int helper(TreeNode node){
        if(node == null) return 0;
        int left = helper(node.left);
        int right =  helper(node.right);

        max = Math.max(max, node.val + left + right);

        return Math.max(0, node.val + Math.max(left, right));
    }
}
