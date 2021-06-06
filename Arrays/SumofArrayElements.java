
/*
Given an integer array arr of size n, you need to sum the elements of array.
*/
class Get
{
    public static int sumElement(int arr[], int n)
    {
        int sum =0;
        
        
        for(int i=0 ; i<n ; i++ ){
            
            sum = sum + arr[i];
            
        }
        
        return sum;
    }
}