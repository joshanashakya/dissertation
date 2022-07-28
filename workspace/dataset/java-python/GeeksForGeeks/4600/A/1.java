

// Java implementation of the 
// Custom Fibonacci series 
class GFG 
{ 
  
// Function to return the nth term 
// of the required sequence 
static int nth_term(int a, int b, int n) 
{ 
    int z = 0; 
    if (n % 6 == 1) 
        z = a; 
    else if (n % 6 == 2) 
        z = b; 
    else if (n % 6 == 3) 
        z = b - a; 
    else if (n % 6 == 4) 
        z = -a; 
    else if (n % 6 == 5) 
        z = -b; 
    if (n % 6 == 0) 
        z = -(b - a); 
    return z; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int a = 10, b = 17, n = 3; 
  
    System.out.println(nth_term(a, b, n)); 
} 
} 
  
// This code is contributed by Rajput-Ji 

