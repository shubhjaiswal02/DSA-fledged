/* Given two integer arrays nums1 and nums2, return an array of their intersection.
Each element in the result must be unique and you may return the result in any order.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.

*/

class Solution {
    public int[] intersection(int[] nums1, int[] nums2)
     {  int k=0;         
        ArrayList<Integer> al = new ArrayList<>();
        int c=0;
        Set <Integer> set = new HashSet<>();
        for (int x:nums1)
        {
            set.add(x);
        }
        for (int x:nums2)
        {
            if(set.contains(x))
            {
               al.add(x);
               set.remove(x);
            }
        }
        int arr[] = new int[al.size()];
        for (int i =0;i<al.size();i++)
        {
            k = al.get(i);
            arr[i]= k;
        }    
return arr; 
  }
}

/* Use of HashSet, ArrayList and their functions. */



