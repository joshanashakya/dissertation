

// Java program to find the sum of all 
// multiples of 2 and 5 below N 
  
class GFG{ 
// Function to find sum of AP series 
static long sumAP(long n, long d) 
{ 
    // Number of terms 
    n /= d; 
  
    return (n) * (1 + n) * d / 2; 
} 
  
// Function to find the sum of all 
// multiples of 2 and 5 below N 
static long sumMultiples(long n) 
{ 
    // Since, we need the sum of 
    // multiples less than N 
    n--; 
  
    return sumAP(n, 2) + sumAP(n, 5) - sumAP(n, 10); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    long n = 20; 
  
    System.out.println(sumMultiples(n)); 
} 
} 
// This code is contributed by mits 

