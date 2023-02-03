/*Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

Follow up: Could you solve it without converting the integer to a string?
*/



class Solution {
    public boolean isPalindrome(int x) {
        int c=0; boolean result=false;
        double sum =0;
        int x2=x;
        int x3=x;
        int k=0;
        if(x<0){
        result =false;
        }
        if(x>=0)
        {
            while(x!=0)
            {
                x=x/10;
                c++;
            }
            c=c-1;
            while(x2!=0)
            {
                k=x2%10;
                sum = sum + k*Math.pow(10,c);
                x2=x2/10;
                c--;
            }
            if(sum==x3){
            result= true;
            }
        }     
   return result; }
}

