/*
Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal 
substring
 consisting of non-space characters only.

 

Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
*/
class Solution {
    public int lengthOfLastWord(String s) {
       String s2 = s.trim();
        int count = 0;
        StringBuilder sb=new StringBuilder();
        sb.append(s2);
        sb.reverse();
        for(int i = 0; i < s2.length(); i++)
        {
            if(sb.charAt(i) != ' ')
                count++;
            else 
            break;
        }
        return count;
    }
}
