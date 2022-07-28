

// Java program to print the largest 
// integer not greater than N with  
// all even digits 
import java .io.*; 
  
public class GFG { 
      
// function to check if all digits 
// are even of a given number 
static int checkDigits(int n) 
{ 
      
    // iterate for all digits 
    while (n > 0) 
    { 
          
        // if digit is odd 
        if (((n % 10) % 2) > 0)  
            return 0; 
  
        n /= 10; 
    } 
  
    // all digits are even 
    return 1; 
} 
  
// function to return the largest  
// number with all digits even 
static int largestNumber(int n) 
{ 
      
    // iterate till we find a 
    // number with all digits even 
    for (int i = n;; i--) 
        if (checkDigits(i) > 0) 
            return i; 
} 
  
    // Driver Code 
    static public void main (String[] args) 
    { 
        int N = 23;  
        System.out.println(largestNumber(N)); 
    } 
} 
  
// This code is contributed by vt_m. 

