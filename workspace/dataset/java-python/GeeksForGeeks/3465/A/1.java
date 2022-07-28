

// Java implementation of the approach 
class GFG 
{ 
      
// Function to print the equation 
// of the required line 
static void line(double x0, double y0) 
{ 
    double c = (int)(2 * y0 * x0); 
    System.out.println(y0 + "x" + " + " +  
                       x0 + "y = " + c); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    double x0 = 4, y0 = 3; 
    line(x0, y0); 
} 
} 
  
// This code is contributed  
// by Code_Mech 

