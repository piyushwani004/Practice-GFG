/* 
Given an array(0-based indexing), you have to find the max sum of i*A[i] where A[i] is the element at index i in the array. The only operation allowed is to rotate(clock-wise or counter clock-wise) the array any number of times.
*/

class GfG
{
    static int max_sum(int arr[], int n)
    {
    
        int cum_sum = 0;
        for (int i = 0; i < n; i++)
            cum_sum += arr[i];
 
        int curr_val = 0;
        for (int i = 0; i < n; i++)
            curr_val += i * arr[i];
 
        int res = curr_val;
 
        for (int i = 1; i < n; i++)
        {
        
            int next_val = curr_val - (cum_sum -
                          arr[i-1]) + arr[i-1] *
                          (n-1);
 
            curr_val = next_val;
 
            res = Math.max(res, next_val);
        }
 
        return res;
    }
}