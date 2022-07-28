

// Java program to find a and b 
// such that a*b=N and a+b=N 
  
class GFG{ 
// Function to return the smallest string 
static void findAandB(double N) 
{ 
    double val = N * N - 4.0 * N; 
  
    // Not possible 
    if (val < 0) { 
        System.out.println("NO"); 
        return; 
    } 
  
    // find a and b 
    double a = (N + Math.sqrt(val)) / 2.0; 
    double b = (N - Math.sqrt(val)) / 2.0; 
  
    System.out.println("a = "+a); 
    System.out.println("b = "+b); 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    double N = 69.0; 
    findAandB(N); 
} 
} 
// This Code is contributed by mits 

