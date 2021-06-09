/*
Given an array, rotate the array by one position in clock-wise direction.
*/

class Compute {
    
    public void rotate(long arr[], long n)
    {
        
       long t = arr[arr.length-1];
       for(int i = arr.length-2;i>=0;i--){
           arr[i+1]  = arr[i];
       }
       arr[0] = t;
        
        
    }
}