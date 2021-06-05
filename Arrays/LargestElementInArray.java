class Compute {
    
    public int largest(int arr[], int n)
    {
        int larg=0;
        
        larg = arr[0];
    
        for(int i =1 ; i<n ;i++){
            
            if(larg < arr[i]){
                larg = arr[i]
            }
            
        }
        
        return larg;
        
    }
}