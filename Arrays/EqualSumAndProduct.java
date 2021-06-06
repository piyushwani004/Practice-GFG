/* 
Given an array Arr of length N, return the count of number of contiguous subarrays for which the sum and product of elements are equal.
*/

class Solution {
    int numOfsubarrays(int[] arr, int n) {
        
        
        int count=0;
        
        for(int i=0 ;i<n ;i++){
            
            int product = arr[i];
            int sum=arr[i];
            
            for(int j=i+1;j<n;j++)
            {
                
                if(product==sum)
                {
                    count++;
                }
                
                product = product*arr[j];
                sum =sum+ arr[j];
            
            }
            if(product==sum)
                {
                    count++;
                }
            
        }
        
        return count;
    }
}