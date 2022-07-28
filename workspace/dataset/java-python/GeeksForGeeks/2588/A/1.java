

// Alternate Fibonacci Series  
// using Dynamic Programming 
import java.io.*; 
  
class GFG  
{ 
static void alternateFib(int n) 
{ 
    if (n < 0) 
    return; 
  
    /* 0th and 1st number of the 
       series are 0 and 1*/
    int f1 = 0; 
    int f2 = 1; 
  
    System.out.print(f1 + " "); 
    for (int i = 2; i <= n; i++)  
    { 
        int f3 = f2 + f1; 
          
        if (i % 2 == 0) 
            System.out.print(f3 + " "); 
  
        f1 = f2; 
        f2 = f3; 
    } 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
    int N = 15; 
    alternateFib(N); 
} 
} 
  
// This code is contributed 
// by chandan_jnu. 

