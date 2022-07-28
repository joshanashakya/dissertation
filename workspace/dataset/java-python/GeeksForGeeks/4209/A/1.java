

// Java implementation of above approach 
import java.io.*; 
  
class GFG  
{ 
      
// Function to find the distinct pairs from 
// 1-a & 1-b such that their sum is divisible by n. 
static int findCountOfPairs(int a, int b, int n) 
{ 
    int ans = 0; 
  
    // pairs from 1 to n*(a/n) and 1 to n*(b/n) 
    ans += n * (a / n) * (b / n); 
  
    // pairs from 1 to n*(a/n) and n*(b/n) to b 
    ans += (a / n) * (b % n); 
  
    // pairs from n*(a/n) to a and 1 to n*(b/n) 
    ans += (a % n) * (b / n); 
  
    // pairs from n*(a/n) to a and n*(b/n) to b 
    ans += ((a % n) + (b % n)) / n; 
  
    // Return answer 
    return ans; 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    int a = 5, b = 13, n = 3; 
    System.out.println (findCountOfPairs(a, b, n)); 
} 
} 
  
// This code is contributed by ajit.. 

