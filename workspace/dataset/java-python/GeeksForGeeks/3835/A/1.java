

// Java Program to find the minimum 
// positive X such that the given 
// equation holds true 
import java.util.*; 
  
class solution 
{ 
  
// This function gives the required 
// answer 
static int minimumX(int n, int k) 
{ 
    int mini = Integer.MAX_VALUE; 
  
    // Iterate for all the factors 
    for (int i = 1; i * i <= n; i++) { 
  
        // Check if i is a factor 
        if (n % i == 0) { 
            int fir = i; 
            int sec = n / i; 
            int num1 = fir * k + sec; 
  
            // Consider i to be A and n/i to be B 
            int res = (num1 / k) * (num1 % k); 
            if (res == n) 
                mini = Math.min(num1, mini); 
  
            int num2 = sec * k + fir; 
            res = (num2 / k) * (num2 % k); 
  
            // Consider i to be B and n/i to be A 
            if (res == n) 
                mini = Math.min(num2, mini); 
        } 
    } 
    return mini; 
} 
  
// Driver Code to test above function 
public static void main(String args[]) 
{ 
    int n = 4, k = 6; 
    System.out.println(minimumX(n, k)); 
  
    n = 5; 
    k = 5; 
    System.out.println(minimumX(n, k)); 
} 
} 

