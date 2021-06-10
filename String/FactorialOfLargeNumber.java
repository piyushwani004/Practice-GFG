import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger; 
import java.util.Scanner; 
  

class GFG {
     private static BigInteger factorial(int N) 
    { 
        // Initialize result 
        BigInteger f = new BigInteger("1"); // Or BigInteger.ONE 
  
        // Multiply f with 2, 3, ...N 
        for (int i = 2; i <= N; i++) 
            f = f.multiply(BigInteger.valueOf(i)); 
  
        return f; 
    } 
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++){
		    int m=s.nextInt();
		    System.out.println(factorial(m));
		}
	}
}