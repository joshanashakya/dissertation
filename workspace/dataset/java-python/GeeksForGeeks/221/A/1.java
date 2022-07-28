

// Java implementation of the approach 
import java.io.*; 
  
class GFG  
{ 
  
// Function to return the number of teams 
static int number_of_teams(int M) 
{ 
    // To store both roots of the equation 
    int N1, N2, sqr; 
  
    // sqrt(b^2 - 4ac) 
    sqr = (int)Math.sqrt(1 + (8 * M)); 
  
    // First root (-b + sqrt(b^2 - 4ac)) / 2a 
    N1 = (1 + sqr) / 2; 
  
    // Second root (-b - sqrt(b^2 - 4ac)) / 2a 
    N2 = (1 - sqr) / 2; 
  
    // Return the positive root 
    if (N1 > 0) 
        return N1; 
    return N2; 
} 
  
    // Driver code 
    public static void main (String[] args) 
    { 
        int M = 45; 
        System.out.println( number_of_teams(M)); 
    } 
} 
  
// this code is contributed by vt_m.. 

