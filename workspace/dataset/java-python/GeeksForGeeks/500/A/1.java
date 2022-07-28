

// Java implementation of the approach 
class GFG 
{ 
  
// Function to print the first n terms 
// of the lower Wythoff sequence 
static void lowerWythoff(int n) 
{ 
  
    // Calculate value of phi 
    double phi = (1 + Math.sqrt(5)) / 2.0; 
  
    // Find the numbers 
    for (int i = 1; i <= n; i++)  
    { 
  
        // a(n) = floor(n * phi) 
        double ans = Math.floor(i * phi); 
  
        // Print the nth numbers 
        System.out.print((int)ans); 
  
        if (i != n) 
            System.out.print(" , "); 
    } 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int n = 5; 
  
    lowerWythoff(n); 
} 
} 
  
// This code is contributed by 29AjayKumar 

