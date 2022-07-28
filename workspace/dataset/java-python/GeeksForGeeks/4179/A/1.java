

// Java program to find Break Even Point 
import java.io.*; 
import java.lang.*; 
  
class GFG 
{ 
// Function to calculate  
// Break Even Point 
public static int breakEvenPoint(int exp1,  
                                 int S, int M) 
{ 
    double earn = S - M;  
      
    double exp = exp1; 
  
    // Calculating number of 
    // articles to be sold  
    double res = Math.ceil(exp / earn);  
  
    int res1 = (int) res; 
      
    return res1; 
} 
  
// Driver Code 
public static void main (String[] args) 
{ 
    int exp = 3550, S = 90, M = 65;  
    System.out.println(breakEvenPoint(exp, S, M));  
} 
} 
  
// This code is contributed 
// by Naman_Garg 

