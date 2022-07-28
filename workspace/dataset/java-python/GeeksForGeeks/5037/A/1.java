

// Java Program to find  
// Lexicographically Kth  
// smallest way to reach 
// given coordinate from origin 
import java.io.*; 
  
class GFG  
{ 
  
// Return (a+b)!/a!b! 
static int factorial(int a,  
                     int b) 
{ 
    int res = 1; 
  
    // finding (a+b)! 
    for (int i = 1;  
             i <= (a + b); i++) 
        res = res * i; 
  
    // finding (a+b)!/a! 
    for (int i = 1; i <= a; i++) 
        res = res / i; 
  
    // finding (a+b)!/b! 
    for (int i = 1; i <= b; i++) 
        res = res / i; 
  
    return res; 
} 
  
// Return the Kth smallest  
// way to reach given  
// coordinate from origin 
static void Ksmallest(int x,  
                      int y, int k) 
{ 
    // if at origin 
    if (x == 0 && y == 0) 
        return; 
  
    // if on y-axis 
    else if (x == 0) 
    { 
        // decrement y. 
        y--; 
  
        // Move vertical 
        System.out.print("V"); 
  
        // recursive call to 
        // take next step. 
        Ksmallest(x, y, k); 
    } 
  
    // If on x-axis 
    else if (y == 0)  
    { 
        // decrement x. 
        x--; 
  
        // Move horizontal. 
        System.out.print("H"); 
  
        // recursive call to 
        // take next step. 
        Ksmallest(x, y, k); 
    } 
    else
    { 
        // If x + y C x is 
        // greater than K 
        if (factorial(x - 1, y) > k) 
        { 
            // Move Horizontal 
            System.out.print( "H"); 
  
            // recursive call to 
            // take next step. 
            Ksmallest(x - 1, y, k); 
        } 
        else 
        { 
            // Move vertical 
            System.out.print("V"); 
  
            // recursive call to 
            // take next step. 
            Ksmallest(x, y - 1, k -  
            factorial(x - 1, y)); 
        } 
    } 
} 
  
// Driver Code 
public static void main (String[] args) 
{ 
    int x = 2, y = 2, k = 2; 
  
    Ksmallest(x, y, k); 
} 
} 
  
// This code is contributed  
// by anuj_67. 

