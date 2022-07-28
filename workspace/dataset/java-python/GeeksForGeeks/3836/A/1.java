

// Java Program to find the minimum 
// positive X such that the given 
// equation holds true 
class Solution 
{ 
// This function gives the required 
// answer 
static int minimumX(int n, int k) 
{ 
    int ans =Integer.MAX_VALUE; 
   
    // Iterate over all possible 
    // remainders 
    for (int rem = k - 1; rem > 0; rem--) { 
   
        // it must divide n 
        if (n % rem == 0) 
            ans = Math.min(ans, rem + (n / rem) * k); 
    } 
    return ans; 
} 
   
// Driver Code to test above function 
public static void main(String args[]) 
{ 
    int n = 4, k = 6; 
    System.out.println( minimumX(n, k)); 
   
    n = 5; k = 5; 
    System.out.println(minimumX(n, k)); 
      
} 
} 
//contributed by Arnab Kundu 

