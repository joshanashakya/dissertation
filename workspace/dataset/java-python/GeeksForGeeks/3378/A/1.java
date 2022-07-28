

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
  
// Function to return the number of ways 
// to insert the bracket pairs 
static int cntWays(String str, int n) 
{ 
    int x = n + 1; 
    int ways = x * x * (x * x - 1) / 12; 
    return ways; 
} 
  
// Driver code 
public static void main(String []args)  
{ 
    String str = "ab"; 
    int n = str.length(); 
  
    System.out.println(cntWays(str, n)); 
} 
} 
  
// This code is contributed by Rajput-Ji 

