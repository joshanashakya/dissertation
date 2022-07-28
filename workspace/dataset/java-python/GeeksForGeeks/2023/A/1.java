

//Java implementation of the approach 
import java.io.*; 
  
class GFG  
{ 
  
// Function to find the arcsin(x) 
static void find_Solution(double x, int n) 
{ 
    double sum = x, e = 2, o = 1, p = 1; 
    for (int i = 2; i <= n; i++)  
    { 
  
        // The power to which 'x' is raised 
        p += 2; 
  
        sum += (double)(o / e) *  
               (double)(Math.pow(x, p) / p); 
  
        // Numerator value 
        o = o * (o + 2); 
  
        // Denominator value 
        e = e * (e + 2); 
    } 
    System.out.println (sum); 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    double x = -0.5; 
  
    if (Math.abs(x) >= 1) 
    { 
        System.out.println ("Invalid Input"); 
    } 
      
    int n = 8; 
    find_Solution(x, n); 
} 
} 
  
// This code is contributed by ajit 

