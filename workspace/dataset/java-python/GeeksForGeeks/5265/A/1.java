

// Java program to find x such  
// that 1*n, 2*n, 3*n...x * n 
// have all digits from 1 to 9 
// at least once 
import java.io.*; 
import java.util.*; 
  
class GFG 
{ 
      
// Returns smallest value x  
// such that 1*n, 2*n, 3*n  
// ...x * n have all digits  
// from 1 to 9 at least once 
public static int smallestX(int n) 
{ 
    // taking temporary  
    // array and variable. 
    int[] temp = new int[10]; 
    for(int i = 0; i < 10; i++) 
    temp[i] = 0; 
  
    if (n == 0) 
        return -1; 
  
    // iterate till we get  
    // all the 10 digits  
    // at least once 
    int count = 0, x = 0; 
    for (x = 1; count < 10; x++)  
    { 
        int y = x * n; 
          
        // checking all 
        // the digits 
        while (y > 0)  
        { 
            if (temp[y % 10] == 0)  
            { 
                count++; 
                temp[y % 10] = 1; 
            } 
            y /= 10; 
        } 
    } 
    return x - 1; 
} 
  
// Driver Code 
public static void main(String args[]) 
{ 
    int n = 5; 
    System.out.print(smallestX(n)); 
} 
} 
  
// This code is contributed 
// by Akanksha Rai(Abby_akku) 

