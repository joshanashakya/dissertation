

//Java implementation of the approach 
  
import java.io.*; 
  
class GFG { 
      
static int getResult(int n) 
{ 
    if ((n & 1)>0) 
        return 1; 
    return -1; 
} 
  
// Driver code 
    public static void main (String[] args) { 
      
    int n = 3; 
    System.out.println(getResult(n)); 
    } 
//This code is contributed by @Tushil.     
} 

