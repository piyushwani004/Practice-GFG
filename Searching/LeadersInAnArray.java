class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        int max_from_right =  arr[n-1];
        ArrayList<Integer> res =new ArrayList<Integer>();
        res.add(max_from_right);
        for (int i = n-2; i >= 0; i--)
        {
            if (max_from_right <= arr[i])
            {          
            max_from_right = arr[i];
            res.add(max_from_right);
            }
        }   
        Collections.reverse(res);
        return res;
    }
}