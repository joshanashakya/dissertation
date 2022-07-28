

// Java program to print  
// greater of x^y and y^x 
import java.io.*; 
  
class GFG 
{ 
static void printGreater(int x, 
                         int y) 
{ 
    double X = y * Math.log(x); 
    double Y = x * Math.log(y); 
    if (Math.abs(X - Y) < 1e-9) 
    { 
        System.out.println("Equal"); 
    } 
    else if (X > Y) 
    { 
        System.out.println(x + "^" + y); 
    } 
    else
    { 
        System.out.println(y + "^" + x); 
    } 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
    int x = 5, y = 8; 
    printGreater(x, y); 
} 
} 
  
// This code is contributed  
// by anuj_67. 

