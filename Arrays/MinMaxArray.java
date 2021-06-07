/* 
Given an array A of size N of integers. Your task is to find the minimum and maximum elements in the array.
*/
class pair  
{  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} 

class Compute 
{
    static pair getMinMax(long a[], long n)  
    {   
        pair p;
        long mn= a[0];
        long mx =-1;
        for (int i = 0; i < a.length; i++) {
        mn = Math.min(a[i], mn);
        mx = Math.max(a[i], mx);
        
    }
     p = new pair(mn,mx);
     return p;
    }
}
