

// Java implementation of the approach 
class GFG  
{ 
  
// Function to return the count of good permutations 
static int Permutations(int n, int k) 
{ 
    // For m = 0, ans is 1 
    int ans = 1; 
  
    // If k is greater than 1 
    if (k >= 2) 
        ans += (n) * (n - 1) / 2; 
  
    // If k is greater than 2 
    if (k >= 3) 
        ans += (n) * (n - 1) * (n - 2) * 2 / 6; 
  
    // If k is greater than 3 
    if (k >= 4) 
        ans += (n) * (n - 1) * (n - 2) * (n - 3) * 9 / 24; 
  
    return ans; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int n = 5, k = 2; 
    System.out.println(Permutations(n, k)); 
} 
} 
  
// This code contributed by Rajput-Ji 

