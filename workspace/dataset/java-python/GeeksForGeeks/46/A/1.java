

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
  
// Function to return the count of times p 
// appaers in the prime factors of the 
// elements from the range [l, r] 
static int getCount(int l, int r, int p) 
{ 
  
    // To store the requried count 
    int cnt = 0; 
    int val = p; 
    while (true)  
    { 
  
        // Number of values in the range [0, r] 
        // that are divisible by val 
        int a = r / val; 
  
        // Number of values in the range [0, l - 1] 
        // that are divisible by val 
        int b = (l - 1) / val; 
  
        // Increment the power of the val 
        val *= p; 
  
        // (a - b) is the count of numbers in the 
        // range [l, r] that are divisible by val 
        if ((a - b) > 0)  
        { 
            cnt += (a - b); 
        } 
  
        // No values that are divisible by val 
        // thus exiting from the loop 
        else
            break; 
    } 
    return cnt; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int l = 2, r = 8, p = 2; 
  
    System.out.println(getCount(l, r, p)); 
} 
}  
  
// This code is contributed by 29AjayKumar 

