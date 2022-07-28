

// A better Java program to  
// find count of all numbers 
// that multiples 
import java.io.*; 
  
class GFG  
{ 
      
// Returns count of all numbers 
// smaller than or equal to n 
// and multples of 3 or 7 or both 
static int countMultiples(int n) 
{ 
    return n / 3 + n / 7 - n / 21; 
} 
  
// Driver code 
public static void main (String args [] )  
{ 
    System.out.println("Count = " +  
                        countMultiples(25)); 
} 
} 
  
// This code is contributed by aj_36  

