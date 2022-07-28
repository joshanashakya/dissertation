

//Java  program to find minimum  
// and maximum no. of pairs 
  
import java.io.*; 
  
class GFG { 
    static void MinimumMaximumPairs(int n, int m) 
{ 
    int max_pairs = ((n - m + 1) * (n - m)) / 2; 
  
    int min_pairs = m * (((n - m) / m + 1) * ((n - m) / m)) / 2 +  
                        (int)Math.ceil((double)((n - m) / 
                                        (double)(m))) * ((n - m) % m); 
  
        System.out.println("Minimum no. of pairs = " + min_pairs); 
        System.out.println("Maximum no. of pairs = " + max_pairs); 
} 
  
// Driver code 
    public static void main (String[] args) { 
  
    int n = 5, m = 2; 
    MinimumMaximumPairs(n, m); 
} 
} 
// This code is contributed by Sachin. 

