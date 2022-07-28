

// Java implementation of the above approach 
import java.io.*; 
  
class GFG  
{ 
      
// Function to return the required number 
static int getMaxNum(int a, int b, int c) 
{ 
  
    // If b % c = 0 then b is the 
    // required number 
    if (b % c == 0) 
        return b; 
  
    // Else get the maximum multiple of 
    // c smaller than b 
    int x = ((b / c) * c); 
      
    if (x >= a && x <= b) 
        return x; 
    else
        return -1; 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    int a = 2, b = 10, c = 3; 
    System.out.println(getMaxNum(a, b, c)); 
} 
} 
  
// This Code is contributed by ajit..  

