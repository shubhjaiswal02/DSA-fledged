/*Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
*/
class Solution {
    public int searchInsert(int[] nums, int target) {
        int index = 0;
        for ( int i = 0; i< nums.length;i++)
        {
            if (nums[i]==target)
                index = i;
            else if (nums[i]< target && nums[i]<=target)
                index = i+1;
        }
       
   return index; }
}
