

// Java implementation of the above approach 
import java.util.*; 
  
class GFG 
{ 
  
// Function to find the minimum no of operations 
static int minOperations(int n, int m) 
{ 
    int a = 0, k = 1; 
  
    // find the maximum of two and store it in p 
    int p = Math.max(n, m); 
  
    // increase it until it is achievable from 
    // given n and m 
    while (n != m)  
    { 
  
        // Here value added to n and m will be 
        // S(n)=p-n+p-m; 
        // check whether integer value of n exist 
        // by the formula 
        // n=(-1+Math.sqrt(1+8*S(n)))/2  
        float s = (float)(p - n + p - m); 
        float q = (float) ((-1 + Math.sqrt(8 * s + 1)) / 2); 
        if (q - Math.floor(q) == 0) 
        { 
            a = (int) q; 
            n = m; 
        } 
  
        p = p + 1; 
    } 
    return a; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int n = 1, m = 3; 
  
    // Function calling 
    System.out.print(minOperations(n, m)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

