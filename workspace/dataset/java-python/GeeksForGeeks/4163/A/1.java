

// Java Program to find the fist character   
// that is repeated 
  
import java.util.*; 
import java.lang.*; 
  
public class GFG 
{ 
    public static int findRepeatFirst(String s) 
    { 
        // this is optimized method 
        int p = -1, i, k; 
  
        // initialized counts of occurrences of 
        // elements as zero 
        int MAX_CHAR = 256; 
        int hash[] = new int[MAX_CHAR]; 
  
        // initialized positions 
        int pos[] = new int[MAX_CHAR]; 
  
        for (i = 0; i < s.length(); i++) 
        { 
            k = (int)s.charAt(i); 
            if (hash[k] == 0) 
            { 
                hash[k]++; 
                pos[k] = i; 
            } 
            else if (hash[k] == 1) 
                hash[k]++; 
        } 
  
        for (i = 0; i < MAX_CHAR; i++) 
        { 
            if (hash[i] == 2) 
            { 
                if (p == -1) // base case 
                    p = pos[i]; 
                else if (p > pos[i]) 
                    p = pos[i]; 
            } 
        } 
  
        return p; 
    } 
  
// Driver code 
    public static void main(String[] args) 
    { 
        String str = "geeksforgeeks"; 
        int pos = findRepeatFirst(str); 
        if (pos == -1) 
            System.out.println("Not found"); 
        else
            System.out.println(str.charAt(pos)); 
    } 
} 
  
// Code Contributed by Mohit Gupta_OMG 

