

// Java Program to get nth  
// Pentagonal pyramidal number. 
import java.io.*; 
  
class GFG  
{ 
      
// function to get nth  
// Pentagonal pyramidal number. 
static int pentagon_pyramidal(int n) 
{ 
    return n * n *  
          (n + 1) / 2; 
} 
  
// Driver Code 
public static void main (String[] args) 
{ 
    int n = 4; 
    System.out.println(pentagon_pyramidal(n)); 
} 
} 
  
// This code is contributed by ajit 

