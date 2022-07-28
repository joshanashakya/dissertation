

// Java implementation of the approach 
class Solution 
{ 
  
   
// Function to return the required sum 
static long getSum(int n, int d) 
{ 
    long sum = 0; 
    while (d <= n) { 
        sum += d; 
        d += 10; 
    } 
    return sum; 
} 
   
// Driver code 
public static void main(String args[]) 
{ 
    int n = 30, d = 3; 
    System.out.print(getSum(n, d)); 
      
} 
} 
//contributed by Arnab Kundu 

