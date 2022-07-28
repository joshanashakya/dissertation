

// Java Program to find triplet with minimum sum 
class GFG 
{ 
  
// Function to find triplet with minimum sum 
static int getMinimumSum(int arr[] , int n) 
{ 
    int ans = Integer.MAX_VALUE; 
      
    // Generate all possible triplets 
    for (int i = 0; i < n - 2; i++)  
    { 
        for (int j = i + 1; j < n - 1; j++)  
        { 
            for (int k = j + 1; k < n; k++) 
            { 
                // Calculate sum of each triplet 
                // and update minimum 
                ans = Math.min(ans, arr[i] +  
                                arr[j] + arr[k]); 
            } 
        } 
    } 
      
    return ans; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int arr[] = { 1, 2, 3, 4, 5, -1, 5, -2 }; 
    int n = arr.length; 
  
    System.out.print(getMinimumSum(arr, n) + "\n"); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

