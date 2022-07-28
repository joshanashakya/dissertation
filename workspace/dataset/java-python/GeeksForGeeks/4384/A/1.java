

// Java program to find the sum of elements 
// of an AP in the given range 
class GFG{ 
   
// Function to find sum in the given range 
static int findSum(int []arr, int n, 
            int left, int right) 
{ 
    // Find the value of k 
    int k = right - left; 
   
    // Find the common difference 
    int d = arr[1] - arr[0]; 
   
    // Find the sum 
    int ans = arr[left - 1] * (k + 1); 
    ans = ans + (d * (k * (k + 1))) / 2; 
   
    return ans; 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 2, 4, 6, 8, 10, 12, 14, 16 }; 
    int queries = 3; 
    int q[][] = { { 2, 4 }, 
                          { 2, 6 }, 
                          { 5, 6 } }; 
    int n = arr.length; 
   
    for (int i = 0; i < queries; i++) 
        System.out.print(findSum(arr, n, q[i][0], q[i][1]) 
             +"\n"); 
} 
} 
  
// This code is contributed by Princi Singh 

