

// Recursive Java program  
// to compute modular power  
import java.io.*;  
  
class GFG  
{  
static int exponentMod(int A,  
                       int B, int C)  
{  
          
    // Base cases  
    if (A == 0)  
        return 0;  
    if (B == 0)  
        return 1;  
      
    // If B is even  
    long y;  
    if (B % 2 == 0) 
    {  
        y = exponentMod(A, B / 2, C);  
        y = (y * y) % C;  
    }  
      
    // If B is odd  
    else 
    {  
        y = A % C;  
        y = (y * exponentMod(A, B - 1,  
                             C) % C) % C;  
    }  
      
    return (int)((y + C) % C);  
}  
  
// Driver Code 
public static void main(String args[])  
{  
    int A = 2, B = 5, C = 13;  
    System.out.println("Power is " +  
                        exponentMod(A, B, C));  
}  
}  
  
// This code is contributed  
// by Swetank Modi.  

