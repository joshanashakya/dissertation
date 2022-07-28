

// Java implementation of above approach 
import java.util.*; 
import java.lang.*; 
  
class GFG 
{ 
// Function to find the number of 
// solutions of n = n xor x 
static int numberOfSolutions(int n) 
{ 
    // Counter to store the number 
    // of solutions found 
    int c = 0; 
  
    for (int x = 0; x <= n; ++x) 
        if (n == x + (n ^ x)) 
            ++c; 
  
    return c; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int n = 3; 
    System.out.print(numberOfSolutions(n)); 
} 
} 
  
// This code is contributed  
// by Akanksha Rai(Abby_akku) 

