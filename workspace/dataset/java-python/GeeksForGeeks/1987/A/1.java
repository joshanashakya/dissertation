

// Java  program to find count of integers needed  
// to express all numbers from 1 to N 
  
import java.io.*; 
  
class GFG { 
      
// function to count length of binary expression of n  
static int countBits(int n)  
{  
    int count = 0;  
    while (n>0) {  
        count++;  
        n >>= 1;  
    }  
    return count;  
}  
  
// Driver code  
    public static void main (String[] args) { 
        int n = 32;  
        System.out.println("Minimum value of K is = "+ 
             countBits(n)); 
          
    } 
} 

