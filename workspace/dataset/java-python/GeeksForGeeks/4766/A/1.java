

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
  
// Function that returns true if a, b and c can 
// be made equal with the given operations 
static boolean canBeEqual(int a, int b, int c, int k) 
{ 
    int []arr = new int[3]; 
    arr[0] = a; 
    arr[1] = b; 
    arr[2] = c; 
  
    // Sort the three numbers 
    Arrays.sort(arr); 
  
    // Find the sum of difference of the 3rd and 
    // 2nd element and the 3rd and 1st element 
    int diff = 2 * arr[2] - arr[1] - arr[0]; 
  
    // Subtract the difference from k 
    k = k - diff; 
  
    // Check the required condition 
    if (k < 0 || k % 3 != 0) 
        return false; 
  
    return true; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int a1 = 6, b1 = 3, c1 = 2, k1 = 7; 
  
    if (canBeEqual(a1, b1, c1, k1)) 
        System.out.print("Yes"); 
    else
        System.out.print("No"); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

