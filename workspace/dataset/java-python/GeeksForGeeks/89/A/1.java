

// Java implementation to find the 
// subsequence with alternating sign 
// having maximum size and maximum sum. 
class GFG{ 
   
// Function to find the subsequence 
// with alternating sign having 
// maximum size and maximum sum. 
static void findSubsequence(int arr[], int n) 
{ 
    int sign[] = new int[n]; 
   
    // Find whether each element 
    // is positive or negative 
    for (int i = 0; i < n; i++) { 
        if (arr[i] > 0) 
            sign[i] = 1; 
        else
            sign[i] = -1; 
    } 
   
    int k = 0; 
    int result[] = new int[n]; 
   
    // Find the required subsequence 
    for (int i = 0; i < n; i++) { 
   
        int cur = arr[i]; 
        int j = i; 
   
        while (j < n && sign[i] == sign[j]) { 
   
            // Find the maximum element 
            // in the specified range 
            cur = Math.max(cur, arr[j]); 
            ++j; 
        } 
   
        result[k++] = cur; 
   
        i = j - 1; 
    } 
   
    // print the result 
    for (int i = 0; i < k; i++) 
        System.out.print(result[i]+ " "); 
    System.out.print("\n"); 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    // array declaration 
    int arr[] = { -4, 9, 4, 11, -5, -17, 9, -3, -5, 2 }; 
   
    // size of array 
    int n = arr.length; 
   
    findSubsequence(arr, n); 
} 
} 
  
// This code is contributed by Princi Singh 

