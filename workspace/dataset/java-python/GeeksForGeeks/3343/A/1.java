

// Java implementation of above approach 
  
class GFG{ 
// Function to return minimum 
// number of insertions required 
static int minInsertions(int[] H, int n, int K) 
{ 
    // Initialize insertions to 0 
    int inser = 0; 
  
    for (int i = 1; i < n; ++i) { 
        float diff = Math.abs(H[i] - H[i - 1]); 
  
        if (diff <= K) 
            continue; 
        else
            inser += Math.ceil(diff / K) - 1; 
    } 
  
    // return total insertions 
    return inser; 
} 
  
// Driver program 
public static void main(String[] args) 
{ 
    int[] H = new int[]{ 2, 4, 8, 16 }; 
    int K = 3; 
    int n = H.length; 
    System.out.println(minInsertions(H, n, K)); 
} 
} 
// This code is contributed by mits 

