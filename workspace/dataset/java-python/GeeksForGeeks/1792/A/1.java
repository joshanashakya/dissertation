

// Java program to find sum 
// in Nth group 
import java.util.*; 
  
class GFG 
{ 
  
// calculate sum of Nth group 
static int nth_group(int n) 
{ 
    return n * (2 * (int)Math.pow(n, 2) + 1); 
} 
  
// Driver code 
public static void main(String arr[]) 
{ 
    int N = 5; 
    System.out.println(nth_group(N)); 
} 
} 
  
// This code is contributed by Surendra 

