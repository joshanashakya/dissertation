

// Java program to demonstrate finding  
// square root of a number using log2()  
import java.io.*; 
  
class GFG  
{ 
static double squareRoot(double n)  
{  
    return Math.pow(2, 0.5 * (Math.log(n) / 
                              Math.log(2)));  
}  
  
// Driver Code 
public static void main (String[] args)  
{ 
    double n = 12;  
    System.out.println(squareRoot(n));  
} 
} 
  
// This code is contributed by akt_mit  

