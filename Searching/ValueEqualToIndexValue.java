/* 
Given an array Arr of N positive integers. Your task is to find the elements whose value is equal to that of its index value
*/

class Solution {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        
        ArrayList<Integer> list =new ArrayList<Integer>();
        
        for(int i =0 ; i<n ; i++){
            
            if(arr[i] == i+1){
                list.add(arr[i]);
            }
            
        }
        return list;
        
    }
}