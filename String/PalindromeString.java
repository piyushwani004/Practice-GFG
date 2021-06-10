/* 
Given a string S, check if it is palindrome or not.
*/

class Solution {
    int isPlaindrome(String S) {
        
        int i = 0, j = S.length() - 1;
 
        while (i < j) {
 
            if (S.charAt(i) != S.charAt(j))
                return 0;
 
            i++;
            j--;
        }
 
        return 1;
    }
};