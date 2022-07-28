

// Java program for above implementation 
class GFG 
{ 
// Function find the maximum expectation 
static double expect(double m, double n) 
{ 
    double ans = 0.0, i; 
  
    for (i = m; i > 0; i--) 
      
        // formula to find the maximum number  
        // and sum of maximum numbers 
        ans += (Math.pow(i / m, n) -  
                Math.pow((i - 1) / m, n)) * i; 
  
    return ans; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    double m = 6, n = 3; 
    System.out.println(String.format("%.5f", 
                             expect(m, n))); 
} 
} 
  
// This code is contributed by mits 

