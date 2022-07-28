

// Java program to find last digit of a number  
// obtained by dividing factorial of a number 
// with factorial of another number. 
import java.io.*; 
  
class GFG { 
  
// Function which computes the last digit 
// of resultant of B!/A! 
static int computeLastDigit(long A, long B) 
{ 
  
    int variable = 1; 
    if (A == B) // If A = B, B! = A! and B!/A! = 1 
        return 1; 
  
    // If difference (B - A) >= 5, answer = 0 
    else if ((B - A) >= 5)  
        return 0; 
  
    else { 
  
        // If non of the conditions are true, we 
        // iterate from A+1 to B and multiply them.  
        // We are only concerned for the last digit, 
        // thus we take modulus of 10 
        for (long i = A + 1; i <= B; i++) 
            variable = (int)(variable * (i % 10)) % 10; 
  
        return variable % 10; 
    } 
} 
  
// driver function 
public static void main(String[] args) 
{ 
    System.out.println(computeLastDigit(2632, 2634)); 
} 
} 
  
// This article is contributed by Prerna Saini 

