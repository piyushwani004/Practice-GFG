/* 
Given an array of positive and negative numbers. Find if there is a subarray (of size at-least one) with 0 sum.
*/

class Solution{
    
    static boolean findsum(int arr[],int n)
    {
        
        int sum =0;
        Set<Integer> hs = new HashSet<Integer>();
        
        for(int i=0;i<n ;i++){
            
            sum += arr[i];
            
            if (arr[i] == 0
                || sum == 0
                || hs.contains(sum))
                return true;
            
            
            hs.add(sum);
            
        }
        return false;
    }
}