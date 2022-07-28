

// Java Program to find  
// the nth Centered  
// Triangular number 
import java.io.*; 
  
class GFG  
{ 
      
// function for Centered 
// Trigunal number 
static int Centered_Trigunal_num(int n) 
{ 
    // formula for find Centered 
    // Trigunal number nth term 
    return (3 * n * n +  
            3 * n + 2) / 2; 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
  
// For 3rd Centered  
// Trigunal number 
int n = 3; 
System.out.println(Centered_Trigunal_num(n)); 
  
// For 12th Centered  
// Trigunal number 
n = 12; 
System.out.println(Centered_Trigunal_num(n)); 
} 
} 
  
// This code is contributed by ajit 

