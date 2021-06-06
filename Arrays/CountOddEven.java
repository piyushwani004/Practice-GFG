/* 
Given an array A[] of N elements. The task is to count number of even and odd elements in the array.
*/

class Solution
{
    public void countOddEven(int[] arr, int n)
    {
        
        int odd=0 ,even=0;
        
        for(int i=0;i<n;i++){
            
             if ((arr[i] & 1) == 1)
                odd++;
            else
                even++;
        }
        
        System.out.println(odd +" "+ even);
        
    }
}