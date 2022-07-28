

// Java implementation of above approach 
import java.io.*; 
  
class GFG { 
      
  
// to store power of 2 
static int power[] = new int[31]; 
  
// to store presum of the power of 2's 
static int pre[] = new int[31]; 
  
// function to find power of 2 
static void PowerOfTwo() 
{ 
    // to store power of 2 
    int x = 1; 
    for (int i = 0; i < 31; i++) { 
        power[i] = x; 
        x *= 2; 
    } 
  
    // to store pre sum 
    pre[0] = 1; 
    for (int i = 1; i < 31; i++) 
        pre[i] = pre[i - 1] + power[i]; 
} 
  
// Function to find the sum 
static int Sum(int n) 
{ 
    // first store sum of 
    // first n natural numbers. 
    int ans = n * (n + 1) / 2; 
  
    // find the first greater number than given 
    // number then minus double of this 
    // from answer 
    for (int i = 0; i < 31; i++) { 
        if (power[i] > n) { 
            ans -= 2 * pre[i - 1]; 
            break; 
        } 
    } 
  
    return ans; 
} 
  
// Driver code 
    public static void main (String[] args) { 
          
    // function call 
    PowerOfTwo(); 
  
    int n = 4; 
  
    // function call 
    System.out.println( Sum(n)); 
    } 
} 
 // This code is contributed by ajit 
  

