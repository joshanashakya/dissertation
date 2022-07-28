

// Java program to count pairs of numbers 
// from 1 to N with Product divisible 
// by their Sum 
  
import java.io.*; 
  
class GFG { 
   
  
  
// Function to count pairs 
static int countPairs(int n) 
{ 
    // variable to store count 
    int count = 0; 
  
    // Generate all possible pairs such that 
    // 1 <= x < y < n 
    for (int x = 1; x < n; x++) { 
        for (int y = x + 1; y <= n; y++) { 
            if ((y * x) % (y + x) == 0) 
                count++; 
        } 
    } 
  
    return count; 
} 
  
// Driver code 
  
    public static void main (String[] args) { 
            int n = 15; 
  
    System.out.println(countPairs(n)); 
    } 
} 
// This code is contributed by anuj_67.. 

