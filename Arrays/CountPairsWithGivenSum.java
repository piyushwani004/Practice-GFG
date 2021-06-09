/* 
Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose sum is equal to K.
*/

class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        
       Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        int count=0;
        for(int i=0;i<n;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(k-arr[i]))
            {
                
                count=count+map.get(k-arr[i]);
                if(arr[i]==k-arr[i])
                count--;
            }
            
        }
        return count/2; 
    }
}