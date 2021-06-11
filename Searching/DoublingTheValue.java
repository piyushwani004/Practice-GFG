/* 
Given an array and an integer B, traverse the array (from the beginning) and if the element in array is B, double B and continue traversal. Find the value of B after the complete traversal.
*/

class Solution
{
    long solve(int n, long A[], long b)
    {
    
        for(int i=0 ; i< n ;i++){
            
            if(A[i] == b)
            {
                b=b+b;
            }
            
        }
    return b;
    }
}