/* 
Given a list of N words. Count the number of words that appear exactly twice in the list.
*/

class Solution
{
    public int countWords(String str[], int n)
    {
        int res=0;
        
        HashMap<String ,Integer> m = new HashMap<>();
        
        for (int i = 0; i < n; i++){
            if(m.containsKey(str[i])){
                int get = m.get(str[i]);
                m.put(str[i], get + 1);
            }
            else{
                m.put(str[i], 1);
            }
        }
        
        for (Map.Entry<String, Integer> it: m.entrySet()){
            if(it.getValue() == 2)
                res++;
        }
        
        return res;
    }
}