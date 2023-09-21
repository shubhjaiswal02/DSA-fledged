Q. Insert into a Binary Search Tree

You are given the root node of a binary search tree (BST) and a value to insert into the tree. Return the root node of the BST after the insertion. It is guaranteed that the new value does not exist in the original BST.

Notice that there may exist multiple valid ways for the insertion, as long as the tree remains a BST after insertion. You can return any of them.

 

Example 1:


Input: root = [4,2,7,1,3], val = 5
Output: [4,2,7,1,3,5]


//Solution

class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null)
            return root = new TreeNode(val);

        if(root.val > val) //go left and ceck if root.left is khaali
        {
            //go left
            if(root.left == null)
                root.left = new TreeNode(val);
            else
                insertIntoBST(root.left,val);
        }
         else
        {
            //go right
            if(root.right == null)
                root.right = new TreeNode(val);
            else 
                insertIntoBST (root.right, val);
        }
        return root;
    }
}
