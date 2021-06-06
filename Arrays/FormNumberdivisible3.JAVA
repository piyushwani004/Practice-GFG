/*
Given an array arr of integers of length N, the task is to find whether it’s possible to construct an integer using all the digits of these numbers such that it would be divisible by 3. If it is possible then print “1” and if not print “0”.
*/

class Solution{
    static int isPossible(int N, int arr[]){
        int rem=0;
        for(int i=0;i<N;i++){
            rem=(rem+arr[i])%3;
            
        }
        if(rem==0)
        return 1;
        else return 0;
    }
}