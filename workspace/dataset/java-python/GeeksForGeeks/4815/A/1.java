

// Efficient Java code to find sum of k-th 
// group of positive odd integers. 
import java.util.Arrays; 
import java.util.Collections; 
  
class GFG 
{  
    // Return the sum of kth group of 
    // positive odd integer. 
    public static int kthgroupsum(int k) 
    { 
        return k * k * k; 
    } 
  
    // Driver program to test above methods  
    public static void main(String[] args) 
    { 
        int k = 3; 
        System.out.print( kthgroupsum(k)); 
    } 
} 
  
// This code is contributed by Chhavi 

