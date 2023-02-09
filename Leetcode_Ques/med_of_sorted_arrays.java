/* Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
*/

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      int  m = nums1.length;
        int n = nums2.length;
        int merge[] = new int [m+n];
        double med = 0.0;
        int mergeindex1 = 0;
        int mergeindex2 = 0;
        int mergeLength = 0;
        int j = 0;
        int c= 0;

        //merging the arrays.
        for (int i = 0; i< m; i++)
        {
            merge[i] = nums1[i];
             c++;
            }
         for (int k = 0; k <n; k++) {
  
            merge[c++] = nums2[k];
        }

              
        Arrays.sort(merge);
        
        mergeLength = merge.length;
        if (mergeLength == 1)
        {
            med = merge[0];
        }
        else if (mergeLength %2 !=0)
        {
            mergeindex1 = ((mergeLength + 1)/2)-1 ;
           merge[ mergeindex2] = 0;
            med = (merge[mergeindex1] + merge[mergeindex2]);
        }
        else 
        {
            mergeindex1 = mergeLength /2 ;
            
            mergeindex2 = mergeindex1 - 1;
            med = merge[mergeindex1] + merge[mergeindex2] ;
            med = med/2;
        }
        

    return med;}
}
