

// Java program to find maximum  
// no of pieces by given number 
// of cuts  
import java.util.*; 
  
class GFG 
{ 
// Function for finding maximum 
// pieces with n cuts.  
public static int findMaximumPieces(int n)  
{  
    // to maximize number of pieces  
    // x is the horizontal cuts  
    int x = n / 2;  
  
    // Now (x) is the horizontal cuts  
    // and (n-x) is vertical cuts, then  
    // maximum number of pieces = (x+1)*(n-x+1)  
    return ((x + 1) * (n - x + 1));  
}  
  
// Driver code 
public static void main (String[] args)  
{ 
    // Taking the maximum number  
    // of cuts allowed as 3  
    int n = 3;  
      
    // Finding and printing the  
    // max number of pieces  
    System.out.print("Max number of pieces for n = " + 
                   n + " is " + findMaximumPieces(3));  
          
} 
} 
  
// This code is contributed by Kirti_Mangal 

