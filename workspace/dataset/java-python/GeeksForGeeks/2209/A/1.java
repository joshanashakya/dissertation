

// A Simple Java  program to count number of ways to  
// represent a number n as sum of four.  
  
import java.io.*; 
  
class GFG { 
      
// Returns count of ways  
static int countWays(int n)  
{  
    int counter = 0; // Initialize result  
  
    // Generate all possible quadruplet and increment  
    // counter when sum of a quadruplet is equal to n  
    for (int i = 1; i < n; i++)  
        for (int j = i; j < n; j++)  
            for (int k = j; k < n; k++)  
                for (int l = k; l < n; l++)  
                    if (i + j + k + l == n)  
                    counter++;  
    return counter;  
}  
  
// Driver program  
      
    public static void main (String[] args) { 
        int n = 8;  
        System.out.println (countWays(n)); 
    } 
} 

