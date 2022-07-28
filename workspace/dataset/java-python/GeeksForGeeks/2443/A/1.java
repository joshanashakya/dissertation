

// Java program to check if a number has 
// same counts of 0s and 1s in every 
// block. 
import java.io.*; 
  
class GFG 
{ 
  
// function to convert decimal to binary 
static boolean isEqualBlock(int n) 
{ 
    // Count same bits in last block 
    int first_bit = n % 2; 
    int first_count = 1; 
    n = n / 2; 
    while (n % 2 == first_bit && n > 0)  
    { 
        n = n / 2; 
        first_count++; 
    } 
  
    // If n is 0 or it has all 1s, 
    // then it is not considered to 
    // have equal number of 0s and 
    // 1s in blocks. 
    if (n == 0) 
        return false; 
  
    // Count same bits in all remaining blocks. 
    while (n > 0)  
    { 
  
        first_bit = n % 2; 
        int curr_count = 1; 
        n = n / 2; 
        while (n % 2 == first_bit)  
        { 
            n = n / 2; 
            curr_count++; 
        } 
  
        if (curr_count != first_count) 
            return false; 
    } 
    return true; 
} 
  
// Driver code 
public static void main (String[] args) 
{ 
    int n = 51; 
    if (isEqualBlock(n)) 
        System.out.println( "Yes"); 
    else
        System.out.println("No"); 
} 
} 
  
// This code is contributed by inder_mca 

