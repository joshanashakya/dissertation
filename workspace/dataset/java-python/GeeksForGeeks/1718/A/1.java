

// Java Program to find nth 
// centered tridecagonal number 
import java.io.*; 
  
class GFG  
{ 
  
// Function to find nth centered 
// tridecagonal number 
static long centeredTridecagonalNum(long n) 
{ 
    // Formula to calculate nth 
    // centered tridecagonal number 
    return (13 * n * (n - 1) + 2) / 2; 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
    long n = 3; 
    System.out.println(centeredTridecagonalNum(n)); 
    n = 10; 
    System.out.println(centeredTridecagonalNum(n)); 
} 
} 
  
// This code is contributed by anuj_67. 

