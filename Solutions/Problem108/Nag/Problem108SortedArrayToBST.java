//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    TreeNode() {
//    }
//
//    TreeNode(int val) {
//        this.val = val;
//    }
//
//    TreeNode(int val, TreeNode left, TreeNode right) {
//        this.val = val;
//        this.left = left;
//        this.right = right;
//    }
//
//}

public class Problem108SortedArrayToBST {


    public static TreeNode sortedArrayToBST (int[] nums){
        if(nums.length == 0) return null;
        return Problem108SortedArrayToBST.constructBST(nums, 0, nums.length -1);
    }

    public static TreeNode constructBST(int[]nums, int left, int right){
        // base case of when to stop constructing tree
        if(left > right) return null;
        int midpoint = left + (right-left)/2;
        TreeNode node =  new TreeNode(nums[midpoint]);
        node.left = constructBST(nums, left, midpoint-1);
        node.right = constructBST(nums, midpoint+1, nums.length-1);
        return node;
    }

}
