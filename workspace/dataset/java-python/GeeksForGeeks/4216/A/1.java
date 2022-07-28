

// Java program to find the number of Bit Strings 
// of length N with K adjacent set bits 
  
import java.util.*; 
  
class solution 
{ 
  
// Function to find the number of Bit Strings 
// of length N with K adjacent set bits 
static int waysToKAdjacentSetBits(int n, int k, int currentIndex, 
                        int adjacentSetBits, int lastBit) 
{ 
  
    // Base Case when we form bit string of length n  
    if (currentIndex == n) { 
  
        // if f(bit string) = k, count this way 
        if (adjacentSetBits == k) 
            return 1; 
        return 0; 
    } 
  
    int noOfWays = 0; 
  
    /* Check if the last bit was set, 
    if it was set then call for  
    next index by incrementing the 
    adjacent bit count else just call 
    the next index with same value of 
    adjacent bit count and either set the 
    bit at current index or let it remain 
    unset */
  
    if (lastBit == 1) { 
        // set the bit at currentIndex 
        noOfWays += waysToKAdjacentSetBits(n, k, currentIndex + 1,  
                                            adjacentSetBits + 1, 1); 
        // unset the bit at currentIndex 
        noOfWays += waysToKAdjacentSetBits(n, k,currentIndex + 1, 
                                                adjacentSetBits, 0); 
    } 
    else if (lastBit == 0) { 
        noOfWays += waysToKAdjacentSetBits(n, k, currentIndex + 1, 
                                                adjacentSetBits, 1); 
        noOfWays += waysToKAdjacentSetBits(n, k, currentIndex + 1,  
                                                adjacentSetBits, 0); 
    } 
  
    return noOfWays; 
} 
  
// Driver Code 
public static void main(String args[]) 
{ 
    int n = 5, k = 2; 
  
    /* total ways = (ways by placing 1st bit as 1 +  
                    ways by placing 1st bit as 0) */
    int totalWays = waysToKAdjacentSetBits(n, k, 1, 0, 1) 
                    + waysToKAdjacentSetBits(n, k, 1, 0, 0); 
  
    System.out.println("Number of ways = "+totalWays); 
  
} 
} 
  
//This code is contributed by  
// Surendra _Gangwar 

