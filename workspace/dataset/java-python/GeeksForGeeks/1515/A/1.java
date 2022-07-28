

// Java implementation of the approach 
class GFG  
{ 
  
// Function to return the minimum 
// deletions to get minimum OR 
static int findMinDel(int []arr, int n) 
{ 
  
    // To store the minimum element 
    int min_num = Integer.MAX_VALUE; 
  
    // Find the minimum element 
    // from the array 
    for (int i = 0; i < n; i++) 
        min_num = Math.min(arr[i], min_num); 
  
    // To store the frequency of 
    // the minimum element 
    int cnt = 0; 
  
    // Find the frequency of the 
    // minimum element 
    for (int i = 0; i < n; i++) 
        if (arr[i] == min_num) 
            cnt++; 
  
    // Return the final answer 
    return n - cnt; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 3, 3, 2 }; 
    int n = arr.length; 
  
    System.out.print(findMinDel(arr, n)); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

