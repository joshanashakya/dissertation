

// Java program to find sum of multiples  
// of a number up to N efficiently 
  
class GFG { 
      
// Function for calculating sum  
// of multiples of a upto N 
static int calculate_sum(int a, int N) { 
      
    // Number of multiples 
    int m = N / a; 
  
    // sum of first m natural numbers 
    int sum = m * (m + 1) / 2; 
  
    // sum of multiples 
    int ans = a * sum; 
  
    return ans; 
} 
  
// Driver code 
public static void main(String[] args) { 
      
    int a = 7, N = 49; 
    System.out.println("Sum of multiples of " + a +  
                       " up to " + N + " = " + 
                               calculate_sum(a, N)); 
} 
} 
  
// This code is contributed by Anant Agarwal. 

