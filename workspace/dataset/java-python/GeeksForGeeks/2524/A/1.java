

// Java implementation of the approach 
class GFG 
{ 
      
// Function to return the minimum number of 
// integers that need to be removed from the 
// array to form a sub-array with sum k 
static int FindMinNumber(int arr[], int n, int k) 
{ 
    int i = 0; 
    int j = 0; 
  
    // Stores the minimum number of 
    // integers that need to be removed 
    // from the array 
    int min_num = Integer.MAX_VALUE; 
  
    boolean found = false; 
  
    int sum = 0; 
  
    while (i < n)  
    { 
  
        sum = sum + arr[i]; 
  
        // If current sum is equal to 
        // k, update min_num 
        if (sum == k) 
        { 
            min_num = Math.min(min_num,  
                             ((n - (i + 1)) + j)); 
            found = true; 
        } 
  
        // If current sum is greater than k 
        else if (sum > k)  
        { 
  
            // Decrement the sum until it 
            // becomes less than or equal to k 
            while (sum > k)  
            { 
                sum = sum - arr[j]; 
                j++; 
            } 
            if (sum == k)  
            { 
                min_num = Math.min(min_num,  
                                 ((n - (i + 1)) + j)); 
                found = true; 
            } 
        } 
  
        i++; 
    } 
  
    if (found) 
        return min_num; 
  
    return -1; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 1, 3, 2, 5, 6 }; 
    int n = arr.length; 
    int k = 5; 
  
    System.out.println(FindMinNumber(arr, n, k)); 
} 
} 
  
// This code is contributed by Code_Mech 

