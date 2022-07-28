

// Java program to find kth  
// common factor of two numbers 
import java.lang.*; 
  
class GFG { 
      
// Returns k'th common factor of x and y. 
static int findKHCF(int x, int y, int k) { 
      
    // Find smaller of two numbers 
    int small = Math.min(x, y); 
  
    // Count common factors until we either 
    // reach small or count becomes k. 
    int count = 1; 
    for (int i = 2; i <= small; i++) { 
    if (x % i == 0 && y % i == 0) 
        count++; 
    if (count == k) 
        return i; 
    } 
  
    // If we reached small 
    return -1; 
} 
  
// Driver code 
public static void main(String[] args) { 
      
    int x = 4, y = 24, k = 3; 
    System.out.print(findKHCF(x, y, k)); 
} 
} 
  
// This code is contributed by Anant Agarwal. 

