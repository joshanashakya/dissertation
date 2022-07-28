

// Java program to find 
// the greater value 
import java.io.*; 
  
class GFG  
{ 
  
// Function to find maximum 
static boolean findGreater(int x,    
                           int y) 
{ 
    // Case 1 
    if (x > y) 
    { 
        return false; 
    } 
  
    // Case 2 
    else 
    { 
        return true; 
    } 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
    int x = 4; 
    int y = 9; 
      
    if(findGreater(x, y)) 
    System.out.println("1"); 
    else
    System.out.println("2"); 
} 
} 
  
// This code is contributed 
// by inder_verma. 

