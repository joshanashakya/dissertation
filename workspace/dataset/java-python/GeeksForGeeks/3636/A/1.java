

// Java program find the distance 
// between two parallel lines 
class GFG 
{ 
      
// Function to find the distance  
// between parallel lines  
static double dist(double m,  
                double b1, double b2) 
{ 
    double d = Math.abs(b2 - b1) /  
                    ((m * m) - 1); 
    return d; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    double m = 2, b1 = 4, b2 = 3; 
     System.out.println(dist(m, b1, b2)); 
} 
} 
  
// This code is contributed by Code_Mech. 

