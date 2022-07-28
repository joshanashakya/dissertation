

// Java program to toggle set  
// bits starting from MSB 
  
class GFG { 
      
static int toggle(int n) { 
      
    // temporary variable to 
    // use XOR with one of a n 
    int temp = 1; 
  
    // Run loop until the only 
    // set bit in temp crosses 
    // MST of n. 
    while (temp <= n) { 
          
    // Toggle bit of n 
    // corresponding to 
    // current set bit in 
    // temp. 
    n = n ^ temp; 
  
    // Move set bit to next 
    // higher position. 
    temp = temp << 1; 
    } 
    return n; 
} 
  
// Driver code 
public static void main(String arg[])  
{ 
    int n = 10; 
    n = toggle(n); 
    System.out.print(n); 
} 
} 
  
// This code is contributed by Anant Agarwal. 

