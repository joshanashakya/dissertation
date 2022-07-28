

// Java implementation of the approach  
import java.util.*; 
  
class GFG  
{  
      
// Function to return the  
// number of men initially  
static int numberOfMen(int D, int m, int d)  
{  
  
    int Men = (m * (D - d)) / d;  
  
    return Men;  
}  
  
// Driver code  
public static void main(String args[]) 
{  
    int D = 5, m = 4, d = 4;  
  
    System.out.println(numberOfMen(D, m, d));  
  
}  
}  
// This code is contributed by Arnab Kundu 

