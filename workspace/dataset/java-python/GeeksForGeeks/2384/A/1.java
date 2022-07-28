

// Java program for brute force  
// approach to find largest number 
// having digits in non-decreasing 
// order. 
import java.io.*; 
  
class GFG  
{ 
      
// Returns the required number 
static int nondecdigits(int n) 
{ 
    // loop to recursively check  
    // the numbers less than or  
    // equal to given number 
    int x = 0; 
    for (x = n; x >= 1; x--) 
    { 
        int no = x; 
        int prev_dig = 11; 
  
        // Keep traversing digits  
        // from right to left. For  
        // every digit check if it 
        // is smaller than prev_dig 
        boolean flag = true; 
        while (no != 0) 
        { 
            if (prev_dig < no % 10) 
            { 
                flag = false; 
                break; 
            } 
            prev_dig = no % 10; 
            no /= 10; 
        } 
  
        // We found the  
        // required number 
        if (flag == true) 
        break; 
    } 
  
    return x; 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
    int n = 200; 
    System.out.println (nondecdigits(n)); 
} 
} 
  
// This code is contributed by ajit 

