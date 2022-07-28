

// Java program to find the sum of all 
// multiples of A and B below N 
  
class GFG{ 
  
static int __gcd(int a, int b)  
    {  
      if (b == 0)  
        return a;  
      return __gcd(b, a % b);   
    }  
      
// Function to find sum of AP series 
static int sumAP(int n, int d) 
{ 
    // Number of terms 
    n /= d; 
  
    return (n) * (1 + n) * d / 2; 
} 
  
// Function to find the sum of all 
// multiples of A and B below N 
static int sumMultiples(int A, int B, int n) 
{ 
    // Since, we need the sum of 
    // multiples less than N 
    n--; 
  
    // common factors of A and B 
    int common = (A * B) / __gcd(A,B); 
  
    return sumAP(n, A) + sumAP(n, B) - sumAP(n, common); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int n = 100, A = 5, B = 10; 
  
    System.out.println("Sum = "+sumMultiples(A, B, n)); 
} 
} 
// this code is contributed by mits 

