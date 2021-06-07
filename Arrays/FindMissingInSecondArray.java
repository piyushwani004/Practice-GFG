/* 
Given two arrays A and B contains integers of size N and M, the task is to find numbers which are present in the first array, but not present in the second array.
*/


class Solution
{
    ArrayList<Long> findMissing(long A[], long B[], int N, int M)
    {
        ArrayList<Long> list = new ArrayList();
        
        HashSet<Long> s = new HashSet<Long>();
        for (int i = 0; i < M; i++)
            s.add(B[i]);
         
        
        for (int i = 0; i < N; i++)
            if (!s.contains(A[i]))
                list.add(A[i]);
        
        return list;
    }
}