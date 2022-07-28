

// Java program to find the  
// frequency of k in matrix 
// in matrix where m(i, j)=i+j 
import java.util.*; 
import java.lang.*; 
  
public class GfG{ 
  
    public static int find(int n, int k) 
    { 
        if (n + 1 >= k) 
            return (k - 1); 
        else
            return (2 * n + 1 - k); 
    } 
          
    // Driver function  
    public static void main(String argc[]) 
    { 
        int n = 4, k = 7; 
        int freq = find(n, k); 
        if (freq < 0) 
            System.out.print(" element"
            + " not exist \n "); 
        else
            System.out.print(" Frequency"
            + " of " + k + " is " + 
            freq + "\n"); 
    } 
} 
  
// This code is contributed by Sagar Shukla 

