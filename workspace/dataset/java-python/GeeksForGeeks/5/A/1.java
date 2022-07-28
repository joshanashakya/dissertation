

// Java program to count number of divisors 
// of N which are divisible by K 
  
import java.io.*; 
  
class GFG { 
     
// Function to count number of divisors 
// of N which are divisible by K 
 static int countDivisors(int n, int k) 
{ 
    // Variable to store 
    // count of divisors 
    int count = 0, i; 
  
    // Traverse from 1 to n 
    for (i = 1; i <= n; i++) { 
  
        // increase the count if both 
        // the conditions are satisfied 
        if (n % i == 0 && i % k == 0) { 
  
            count++; 
        } 
    } 
  
    return count; 
} 
  
// Driver code 
    public static void main (String[] args) { 
      int n = 12, k = 3; 
  
    System.out.println(countDivisors(n, k)); 
    } 
} 
// This code is contributed by shashank.. 

