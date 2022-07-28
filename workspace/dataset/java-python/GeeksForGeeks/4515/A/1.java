

// JAVA Code to find Minimum flips required 
// to maximize a number with k set bits 
import java.util.*; 
  
class GFG { 
      
    // function for finding set bit 
    static int setBit(int xorValue) 
    { 
        int count = 0; 
        while (xorValue >= 1) { 
            if (xorValue % 2 == 1) 
                count++; 
       
            xorValue /= 2; 
        } 
           
        // return count of set bit 
        return count; 
    } 
       
    // function for finding min flip 
    static int minFlip(int n, int k) 
    {    
        // number of bits in n 
        int size = (int)(Math.log(n) /  
                         Math.log(2)) + 1; 
           
        // Find the largest number of 
        // same size with k set bits 
        int max = (int)Math.pow(2, k) - 1;     
        max = max << (size - k); 
       
        // Count bit differences to find 
        // required flipping. 
        int xorValue = (n ^ max); 
        return (setBit(xorValue)); 
    } 
      
    /* Driver program to test above function */
    public static void main(String[] args)  
    { 
         int n = 27, k = 3; 
         System.out.println("Min Flips = "+ 
                             minFlip(n, k)); 
    } 
} 
  
// This code is contributed by Arnav Kr. Mandal.     

