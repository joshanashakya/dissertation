

// Java implementation of above approach 
import java.io.*; 
public class gfg 
{ 
    // Function To find digitsum for a number 
public int digitsum(int n) 
{ 
    // Logic for digitsum 
    int r = n % 9; 
    if (r == 0) 
        return 9; 
    else
        return r; 
} 
  
// Function to find minimum digit sum 
public int find(int n, int d) 
{ 
    // Variable to store answer 
    // Intialise by 10 as the answer 
    // will always be less than 10 
    int minimum = 10; 
  
  
    // Values of digitsum will repeat after 
    // i=8, due to modulo taken with 9 
    for (int i = 0; i < 9; i++) { 
        int current = (n + i * d); 
        minimum = Math.min(minimum, digitsum(current)); 
    } 
  
    return minimum; 
} 
} 
  
class geek 
{ 
// Driver Code 
public static void main(String[]args) 
{ 
    gfg g = new gfg(); 
    int n = 2546, d = 124; 
    System.out.println("Minimum possible digitsum is : "+ (g.find(n, d))); 
} 
} 
//This code is contributed by shs.. 

