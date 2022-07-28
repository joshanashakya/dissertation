

// A Java program to 
// validate a number 
import java.io.*; 
  
class GFG  
{ 
      
// Function to validate 
// number (Check if frequency  
// of a digit is less than  
// the digit itself or not) 
static boolean validate(long n) 
{ 
    int count[] = new int[10] ;  
    while (n > 0) 
    { 
        // calculate frequency  
        // of each digit 
        int r = (int)n % 10; 
  
        // If count is already r,  
        // then incrementing it  
        // would invalidate,  
        // hence we return false. 
        if (count[r] == r) 
        return false;  
  
        count[r]++; 
        n /= 10; 
    } 
  
    return true; 
} 
  
// Driver Code 
public static void main (String[] args) 
{ 
    long n = 1552793; 
    if (validate(n)) 
        System.out.println("True"); 
    else
        System.out.println("False"); 
} 
} 
  
// This code is contributed by ajit 

