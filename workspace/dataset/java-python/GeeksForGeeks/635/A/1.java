

// Java program to check 
// if M-th fibonacci  
// divides N-th fibonacci 
import java.io.*; 
  
class GFG  
{ 
static void check(int n, int m) 
{ 
    // exceptional case for F(2) 
    if (n == 2 || m == 2 || 
        n % m == 0)  
    { 
        System.out.println( "Yes"); 
    } 
      
    // if none of the above cases, 
    // hence not divisible 
    else 
    { 
        System.out.println( "No"); 
    } 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
    int m = 3, n = 9; 
    check(n, m); 
} 
} 
  
// This code is contributed 
// by anuj_67. 

