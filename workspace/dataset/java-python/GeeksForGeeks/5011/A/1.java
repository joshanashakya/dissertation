

// Java program to find sum of  
// harmonic series using recursion  
import java.io.*;  
  
class GFG  
{  
  
float sum(float n)  
{  
    // Base condition  
    if (n < 2)  
        return 1;  
  
    else
        return 1 / n + (sum(n - 1));  
}  
  
// Driven Code  
public static void main(String args[])  
{  
  GFG g = new GFG();  
  System.out.println(g.sum(8));  
  System.out.print(g.sum(10));  
}  
}  
  
// This code is contributed by Shivi_Aggarwal  

