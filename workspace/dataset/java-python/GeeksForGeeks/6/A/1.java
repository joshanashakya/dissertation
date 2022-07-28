

// Java  program to count number of divisors  
// of N which are divisible by K 
  
import java.io.*; 
  
class GFG { 
      
// Function to count number of divisors  
// of N which are divisible by K  
static int countDivisors(int n, int k)  
{  
    // integer to count the divisors  
    int count = 0, i;  
  
    // Traverse from 1 to sqrt(N)  
    for (i = 1; i < Math.sqrt(n); i++) {  
  
        // Check if i is a factor  
        if (n % i == 0) {  
            // increase the count if i  
            // is divisible by k  
            if (i % k == 0) {  
                count++;  
            }  
  
            // (n/i) is also a factor  
            // check whether it is divisible by k  
            if ((n / i) % k == 0) {  
                count++;  
            }  
        }  
    }  
  
    // If the number is a perfect square  
    // and it is divisible by k  
    if ((i * i == n) && (i % k == 0)) {  
        count--;  
    }  
  
    return count;  
}  
  
// Driver code  
      
    public static void main (String[] args) { 
      
        int n = 12, k = 3;  
        System.out.println( countDivisors(n, k));  
          
    } 
} 
//This Code is Contributed by akt_mit 

