/* 
Given an array H representing heights of buildings. You have to count the buildings which will see the sunrise (Assume : Sun rise on the side of array starting point).
*/


class Solution {
    int countBuildings(int h[], int n) {
        
        int count = 1;
        
        int first = h[0];
        
        for(int i=1; i< n ; i++){
            
            if (h[i] > first) {
                count++;
                first = h[i];
            }
            
        }
        return count;
    }
}