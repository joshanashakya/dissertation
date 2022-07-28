

// Java implementation of the approach 
class GFG 
{ 
      
static int MAXN = 30; 
  
// Function to return the length of longest 
// contiguous string containing only 4's from 
// the first N characters of the string 
static int countMaxLength(int N) 
{ 
    // Initialize result 
    int res; 
  
    // Initialize prefix sum array of 
    // characters and product variable 
    int pre[] = new int[MAXN]; 
    int p = 1; 
  
    // Preprocessing of prefix sum array 
    pre[0] = 0; 
    for (int i = 1; i < MAXN; i++) 
    { 
        p *= 2; 
        pre[i] = pre[i - 1] + i * p; 
    } 
  
    // Initialize variable to store the 
    // string length where N belongs to 
    int ind = 0; 
  
    // Finding the string length where 
    // N belongs to 
    for (int i = 1; i < MAXN; i++) 
    { 
        if (pre[i] >= N) 
        { 
            ind = i; 
            break; 
        } 
    } 
  
    int x = N - pre[ind - 1]; 
    int y = 2 * ind - 1; 
  
    if (x >= y) 
        res = Math.min(x, y); 
    else
        res = Math.max(x, 2 * (ind - 2) + 1); 
  
    return res; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int N = 25; 
    System.out.println(countMaxLength(N)); 
} 
} 
  
// This code is contributed by Code_Mech. 

