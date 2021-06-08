/* 
Given a string str and another string patt. Find the character in patt that is present at the minimum index in str
*/

class Solution{
    
    // Function to find the character in patt which is present in str at min index
    public static String printMinIndexChar(String str, String patt){
        
        String res ;
        
       int minIndex = Integer.MAX_VALUE;
     
       int M = str.length();  
       int N = patt.length();
     
       
       for(int i =0 ; i<N ;i++ ){
           
           for(int j =0 ; j<M ;j++){
               
               if(patt.charAt(i)== str.charAt(j) && j < minIndex){
                    minIndex = j;
                    break;
               }
               
           }
           
       }
       
       if (minIndex != Integer.MAX_VALUE)
           res = String.valueOf(str.charAt(minIndex));
        else
            res ="$";
       
       
      return res;
    }
    
}