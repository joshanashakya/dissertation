

// Simple Java rogram to find  
// MSB number for given n. 
import java.io.*; 
  
class GFG  
{ 
static int setBitNumber(int n) 
{ 
    if (n == 0) 
        return 0; 
  
    int msb = 0; 
    while (n != 0) 
    { 
        n = n / 2; 
        msb++; 
    } 
  
    return (1 << msb); 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    int n = 0; 
    System.out.println(setBitNumber(n)); 
} 
} 
  
// This code is contributed by ajit 

