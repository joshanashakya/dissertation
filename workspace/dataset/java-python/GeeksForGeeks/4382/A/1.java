

// Java program to Find values of a, in equation 
// (a+b)<=n and a+b is divisible by x. 
  
import java.io.*; 
  
class GFG { 
   
// function to Find values of a, in equation 
// (a+b)<=n and a+b is divisible by x. 
static void PossibleValues(int b, int x, int n) 
{ 
    // least possible which is divisible by x 
    int leastdivisible = (b / x + 1) * x; 
  
    int flag = 1; 
  
    // run a loop to get required answer 
    while (leastdivisible <= n) { 
  
        if (leastdivisible - b >= 1) { 
            System.out.print( leastdivisible - b + " "); 
  
            // increase value by x 
            leastdivisible += x; 
  
            // answer is possible 
            flag = 0; 
        } 
        else
            break; 
    } 
  
    if (flag>0) 
         System.out.println(-1); 
} 
  
// Driver code 
    public static void main (String[] args) { 
            int b = 10, x = 6, n = 40; 
  
    // function call 
    PossibleValues(b, x, n); 
    } 
} 
  
  
// This code is contributed 
// by shs 

