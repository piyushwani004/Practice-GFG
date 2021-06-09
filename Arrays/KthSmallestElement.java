/* 
Given an array arr[] and a number K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct
*/

class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
       
       Arrays.sort(arr);;
       return arr[k-1];
       
    } 
}