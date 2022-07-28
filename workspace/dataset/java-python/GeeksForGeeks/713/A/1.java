

// An efficient Java program to find bit-wise & of all  
// numbers from x to y. 
import java.io.*; 
  
class GFG  
{ 
      
    static long andOperator(long a,long b) 
    {  
        while(a < b) 
        {  
            // -b is the 2's complement of b when do bitwise or with b  
            //we get LSB and we subtract that from b  
            b -= (b & -b);  
        }  
        return b;  
    }  
      
    // Driver code 
    public static void main (String[] args)  
    { 
        long a, b;  
        a = 10; b = 15;  
        System.out.println(andOperator(a, b)); 
    } 
} 
  
// This code is contributed by apurva raj 

