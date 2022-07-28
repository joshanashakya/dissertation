

// Java Program to find the diagonal 
// of a regular pentagon 
class GFG 
{ 
      
// Function to find the diagonal  
// of a regular pentagon 
static double pentdiagonal(double a) 
{ 
  
    // Side cannot be negative 
    if (a < 0) 
        return -1; 
  
    // Length of the diagonal 
    double d = 1.22 * a; 
    return d; 
} 
  
// Driver code 
static public void main (String args[]) 
{ 
    double a = 6; 
    System.out.println(pentdiagonal(a)); 
} 
} 
  
// This code is contributed 
// by Akanksha Rai 

