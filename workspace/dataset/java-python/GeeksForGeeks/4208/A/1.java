

// Java program for the above approach 
class GFG 
{ 
  
// Function to find the distinct pairs from 
// 1-a & 1-b such that their sum is divisible by n. 
static int findCountOfPairs(int a, int b, int n) 
{ 
    int ans = 0; 
  
    // Iterate over 1 to a to find distinct pairs 
    for (int i = 1; i <= a; i++)  
    { 
        // For each integer from 1 to a 
        // b/n integers exists such that pair 
        // sum is divisible by n 
        ans += b / n; 
  
        // If (i%n +b%n ) >= n one more pair is possible 
        ans += (i % n + b % n) >= n ? 1 : 0; 
    } 
  
    // Return answer 
    return ans; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int a = 5, b = 13, n = 3; 
    System.out.println(findCountOfPairs(a, b, n)); 
} 
} 
  
// This code has been contributed by 29AjayKumar 

