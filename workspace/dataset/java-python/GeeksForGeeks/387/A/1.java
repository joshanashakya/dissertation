

// Java implementation of the approach 
  
class GFG 
{ 
      
// Function that compares a and b 
static int cmp(int a, int b) 
{ 
    if(a > b) 
        return 1; 
    else if(a == b) 
        return 0; 
    else
        return -1; 
} 
  
// Function to return length of longest subarray  
// that satisfies one of the given conditions 
static int maxSubarraySize(int []arr, int n) 
{ 
    int ans = 1; 
    int anchor = 0; 
  
    for (int i = 1; i < n; i++) 
    { 
        int c = cmp(arr[i - 1], arr[i]); 
        if (c == 0) 
            anchor = i; 
        else if (i == n - 1 || 
                c * cmp(arr[i], arr[i + 1]) != -1) 
        { 
            ans = Math.max(ans, i - anchor + 1); 
            anchor = i;  
        } 
    } 
          
    return ans; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int []arr = {9, 4, 2, 10, 7, 8, 8, 1, 9}; 
    int n = arr.length; 
  
    // Print the required answer 
    System.out.println(maxSubarraySize(arr, n)); 
} 
} 
  
// This code has been contributed by 29AjayKumar 

