

// Java code to find sum of k-th group 
// of positive odd integers. 
import java.util.Arrays; 
import java.util.Collections; 
  
class GFG 
{  
    // Return the sum of k-th group  
    // of positive odd integers. 
    public static int kthgroupsum(int k) 
    { 
        // Finding first element of kth group. 
        int cur = (k * (k - 1)) + 1; 
        int sum = 0; 
  
        // Finding the sum. 
        while (k-- > 0) 
        { 
            sum += cur; 
            cur += 2; 
        } 
  
        return sum; 
    } 
  
    // Driver program to test above methods  
    public static void main(String[] args) 
    { 
        int k = 3; 
        System.out.print(kthgroupsum(k)); 
    } 
} 
  
// This code is contributed by Chhavi 

