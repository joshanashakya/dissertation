

// Java program to find maximum number of  
// elements without overlapping in a line 
import java.util.*; 
  
class GFG 
{ 
  
// Function to find maximum number of  
// elements without overlapping in a line 
static int Segment(int x[], int l[], int n) 
{ 
    // If n = 1, then answer is one 
    if (n == 1) 
        return 1; 
      
    // We can always make 1st element to cover  
    // left segment and nth the right segment 
    int ans = 2; 
          
    for (int i = 1; i < n - 1; i++) 
    { 
        // If left segment for ith element  
        // doesn't overlap with i - 1 th 
        // element then do left 
        if (x[i] - l[i] > x[i - 1]) 
            ans++; 
  
        // else try towards right if possible 
        else if (x[i] + l[i] < x[i + 1]) 
        { 
            // update x[i] to right endpoint of  
            // segment covered by it 
            x[i] = x[i] + l[i]; 
            ans++; 
        } 
    } 
      
    // Return the required answer 
    return ans; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int x[] = {1, 3, 4, 5, 8}, 
        l[] = {10, 1, 2, 2, 5}; 
      
    int n = x.length; 
  
    // Function call 
    System.out.println(Segment(x, l, n)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

