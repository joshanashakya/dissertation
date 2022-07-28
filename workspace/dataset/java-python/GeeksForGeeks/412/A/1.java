

// Java program to check 
// if any Subarray of size  
// K has a given Sum 
class GFG  
{ 
  
// Function to check if any 
// Subarray of size K has  
// a given Sum 
static boolean checkSubarraySum(int arr[], int n, 
                                int k, int sum) 
{ 
    // Consider all blocks  
    // starting with i. 
    for (int i = 0; i < n - k + 1; i++) 
    { 
  
        int current_sum = 0; 
  
        // Consider each  
        // subarray of size k 
        for (int j = 0; j < k; j++) 
            current_sum = current_sum +  
                          arr[i + j]; 
  
        if (current_sum == sum)  
            return true;      
    } 
    return false; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int arr[] = new int[] { 1, 4, 2, 10, 2,  
                            3, 1, 0, 20 }; 
    int k = 4; 
    int sum = 18; 
  
    int n = arr.length; 
  
    if (checkSubarraySum(arr, n, k, sum)) 
        System.out.println("YES"); 
    else
        System.out.println("NO"); 
} 
} 
  
// This code is contributed  
// by Kirti_Mangal 

