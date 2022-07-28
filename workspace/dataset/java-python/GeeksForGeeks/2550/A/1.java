

// Recursive Java program to  
// find value of Iterated Logarithm 
import java.io.*; 
  
class GFG 
{ 
static int _log(double x,  
                double base) 
{ 
    return (int)(Math.log(x) /  
                 Math.log(base)); 
} 
  
static double recursiveLogStar(double n,  
                               double b) 
{ 
    if (n > 1.0) 
        return 1.0 +  
               recursiveLogStar(_log(n,  
                                 b), b); 
    else
        return 0; 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    int n = 100, base = 5; 
    System.out.println("Log*(" + n + ") = " + 
                  recursiveLogStar(n, base)); 
} 
} 
  
// This code is contributed by jit_t 

