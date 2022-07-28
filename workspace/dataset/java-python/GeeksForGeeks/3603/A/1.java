

// Java program to illustrate 
// the above problem 
  
import java.io.*; 
  
class GFG { 
   
// function to check if it's possible to 
// divide the square in two equal parts 
static void halfsquare(int n, int x, int y) 
{ 
    int half = n / 2; 
  
    // if the painted square is linked anyway 
    // to the center of the square 
    // then it's not possible 
    if ((half == x || half == x - 1) &&  
        (half == y || half == y - 1)) 
        System.out.println( "NO"); 
  
    // else yes it's possible 
    else
        System.out.println( "YES"); 
} 
  
// Driver code 
  
    public static void main (String[] args) { 
            // initialize the size of the square 
    int n = 100; 
  
    // initialize the dimention of the painted square 
    int x = 51, y = 100; 
  
    halfsquare(n, x, y); 
    } 
} 
// This code is contributed  
// by inder_verma.. 

