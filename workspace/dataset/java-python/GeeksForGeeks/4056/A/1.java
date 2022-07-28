

// Java program to find sum of series  
// 1 + x^2/2 + x^3/3 + ....+ x^n/n 
  
class GFG 
{ 
  
// Java code to print the sum  
// of the given series 
static double sum(int x, int n) 
{ 
    double i, total = 1.0, multi = x; 
    for (i = 1; i <= n; i++)  
    { 
        total = total + multi / i; 
        multi = multi * x; 
    } 
    return total; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int x = 2; 
    int n = 5; 
    System.out.printf("%.2f", sum(x, n)); 
} 
} 
  
// This code is contributed by 
// Smitha Dinesh Semwal 

