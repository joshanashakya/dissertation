

// Java code for the implementation of 
// Linear extrapolation  
class GFG 
{ 
      
// Function to calculate the linear 
// extrapolation  
static double extrapolate(double[][] d, double x)  
{  
    double y = d[0][1] + (x - d[0][0]) /  
                (d[1][0] - d[0][0]) *  
                (d[1][1] - d[0][1]);  
  
    return y;  
}  
  
// Driver Code  
public static void main (String[] args) 
{ 
      
// Sample dataset  
double[][] d = {{ 1.2, 2.7 },{ 1.4, 3.1 }};  
  
// Sample x value  
double x = 2.1;  
  
// Finding the extrapolation  
System.out.println("Value of y at x = 2.1 : " + 
                    extrapolate(d, x));  
} 
} 
  
// This code is contributed by chandan_jnu 

