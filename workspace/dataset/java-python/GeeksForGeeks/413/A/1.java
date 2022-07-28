

// Java program to check if any Subarray of size  
// K has a given Sum 
  
class GFG{ 
// Function to check if any Subarray of size K 
// has a given Sum 
static boolean checkSubarraySum(int[] arr, int n, 
                    int k, int sum) 
{ 
    // Check for first window 
    int curr_sum = 0; 
    for (int i=0; i<k; i++) 
    curr_sum += arr[i];  
    if (curr_sum == sum) 
        return true; 
  
    // Consider remaining blocks ending with j 
    for (int j = k; j < n; j++) { 
        curr_sum = curr_sum + arr[j] - arr[j-k]; 
        if (curr_sum == sum)  
            return true;      
    } 
    return false; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int[] arr=new int[]{ 1, 4, 2, 10, 2, 3, 1, 0, 20 }; 
    int k = 4; 
    int sum = 18; 
  
    int n = arr.length; 
  
    if (checkSubarraySum(arr, n, k, sum)) 
        System.out.println("YES"); 
    else
        System.out.println("NO"); 
  
} 
} 
// This code is contributed by mits 

