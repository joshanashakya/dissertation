

// Java implementation of the above approach 
import java.io.*; 
  
class GFG  
{ 
          
// Function that will find out 
// the number 
static void printNumber(int holes) 
{ 
  
    // If number of holes 
    // equal 0 then return 1 
    if (holes == 0) 
        System.out.print("1"); 
  
    // If number of holes 
    // equal 0 then return 0 
    else if (holes == 1) 
        System.out.print("0"); 
  
    // If number of holes 
    // is more than 0 or 1. 
    else
    { 
        int rem = 0, quo = 0; 
  
        rem = holes % 2; 
        quo = holes / 2; 
  
        // If number of holes is 
        // odd 
        if (rem == 1) 
            System.out.print("4"); 
  
        for (int i = 0; i < quo; i++) 
                System.out.print("8"); 
    } 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    int holes = 3; 
      
    // Calling Function 
    printNumber(holes); 
} 
} 
  
// This code is contributed by Sachin. 

