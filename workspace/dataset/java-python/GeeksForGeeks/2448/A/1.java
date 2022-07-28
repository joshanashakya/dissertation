

// Java program of number of leading zeros in  
// binary representation of a given number 
import java.io.*; 
  
class GFG { 
    // Function to count the no. of leading zeros  
static int countZeros(int x)  
{  
    int y;  
    int n = 32;  
    y = x >> 16;  
    if (y != 0) {  
        n = n - 16;  
        x = y;  
    }  
    y = x >> 8;  
    if (y != 0) {  
        n = n - 8;  
        x = y;  
    }  
    y = x >> 4;  
    if (y != 0) {  
        n = n - 4;  
        x = y;  
    }  
    y = x >> 2;  
    if (y != 0) {  
        n = n - 2;  
        x = y;  
    }  
    y = x >> 1;  
    if (y != 0)  
        return n - 2;  
    return n - x;  
}  
  
// Main function  
    public static void main (String[] args) { 
    int x = 101;  
    System.out.println (countZeros(x));  
    } 
//This code is contributed by @Tushil.     
} 

