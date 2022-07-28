

// Java Program to get nth  
// Pentagonal pyramidal number. 
import java.io.*; 
  
class GFG  
{ 
  
// function to get nth  
// Pentagonal pyramidal number. 
static int pentagon_pyramidal(int n) 
{ 
    int sum = 0; 
  
    // Running loop from 1 to n 
    for (int i = 1; i <= n; i++)  
    { 
  
        // get nth pentagonal number 
        int p = (3 * i * i - i) / 2; 
  
        // add to sum 
        sum = sum + p; 
    } 
    return sum; 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
    int n = 4; 
    System.out.println(pentagon_pyramidal(n)); 
} 
} 
  
// This code is contributed by anuj_67. 

