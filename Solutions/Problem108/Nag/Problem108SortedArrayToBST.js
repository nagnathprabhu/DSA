/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {number[]} nums
 * @return {TreeNode}
 */

 const sortedArrayToBST = function(nums) {
    if (nums.length == 0) return null;
    
     const constructBinaryTree = (left, right) => {
    if(left > right) return null
    const midpoint = Math.floor(left + (right-left) /2);
    const node = new TreeNode (nums[midpoint], constructBinaryTree(left, midpoint-1, nums), constructBinaryTree(midpoint+1, right, nums));
    return node;
}
    return constructBinaryTree(0, nums.length-1);
};