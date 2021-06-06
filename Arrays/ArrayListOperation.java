/* 
Given an ArrayList of N lowercase characters. The task is to count frequency of elements in the list.
*/

class Geeks
{
    // Function to insert element
    public static void insert(ArrayList<Character> clist, char c)
    {
        
        clist.add(c);
    }
    
    // Function to count frequency of element
    public static void freq(ArrayList<Character> clist, char c)
    {
     
        if(clist.contains(c))
        System.out.println(Collections.frequency(clist,c));
        else
        System.out.println("Not Present");
        
    }
}