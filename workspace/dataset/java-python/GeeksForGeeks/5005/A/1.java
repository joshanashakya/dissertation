

// Java program to find the values of 
// X and Y using the given equations 
import java.io.*; 
  
class GFG  
{ 
      
// Function to find the 
// values of X and Y 
static void findValues(int a, int b) 
{ 
    // base condition 
    if ((a - b) % 2 == 1)  
    { 
            System.out.println ("-1"); 
        return; 
    } 
  
    // required answer 
    System.out.println (((a - b) / 2)+ " " + 
                            ((a + b) / 2)); 
} 
  
    // Driver Code 
    public static void main (String[] args) 
    { 
        int a = 12, b = 8; 
        findValues(a, b); 
    } 
} 
  
// This code is contributed by ajit...  

