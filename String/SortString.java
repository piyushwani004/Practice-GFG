/* 
Given a string of lowercase characters from ‘a’ – ‘z’. We need to write a program to print the characters of this string in sorted order
*/

mport java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     
     
	public static void main (String[] args)
	 {
	 
	   Scanner in =new Scanner(System.in);
	   int testcase = in.nextInt();
	   while(testcase > 0 ){
	    
	        String str=in.next();
		    char[] ch=str.toCharArray();
		    Arrays.sort(ch);
		    System.out.println(ch);
		    testcase--;
	   }
	 
	 }
}