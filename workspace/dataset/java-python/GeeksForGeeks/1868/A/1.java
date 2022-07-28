

// Java implementation of the approach 
import java.io.*; 
  
class GFG  
{ 
      
// Function to compute number 
// using our deduced formula 
static int findNumber(int n) 
{ 
    // Initialize num to n-1 
    int num = n - 1; 
    num = 2 * (int)Math.pow(4, num); 
    num = (int)Math.floor(num / 3.0); 
    return num; 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    int n = 5; 
    System.out.println (findNumber(n)); 
} 
} 
  
// The code is contributed by ajit. 

