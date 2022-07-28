

// Java implementation of the approach 
import java.util.*; 
      
class GFG 
{ 
      
// Function to return the 
// gcd of a and b 
static long gcd(long a, long b) 
{ 
    if (a == 0) 
        return b; 
  
    return gcd(b % a, a); 
} 
  
// Function to return the count of integers 
// from the range [1, num] which are 
// divisible by either a, b or c 
static long divTermCount(long a, long b,  
                         long c, long num) 
{ 
    // Calculate the number of terms divisible by a, b 
    // and c then remove the terms which are divisible 
    // by both (a, b) or (b, c) or (c, a) and then 
    // add the numbers which are divisible by a, b and c 
    return ((num / a) + (num / b) + (num / c) -  
                (num / ((a * b) / gcd(a, b))) -  
                (num / ((c * b) / gcd(c, b))) -  
                (num / ((a * c) / gcd(a, c))) +  
                (num / ((a * b * c) / gcd(gcd(a, b), c)))); 
} 
  
// Driver code 
static public void main (String []arr) 
{ 
    long a = 7, b = 3, c = 5, n = 100; 
  
    System.out.println(divTermCount(a, b, c, n)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

