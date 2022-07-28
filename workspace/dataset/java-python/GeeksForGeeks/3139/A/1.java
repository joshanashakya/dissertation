

// Java program to check  
// if an array is bitonic 
class GFG 
{ 
// Function to check if the  
// given array is bitonic 
static int checkBitonic(int arr[], int n)  
{ 
    int i, j; 
  
    // Check for increasing sequence 
    for (i = 1; i < n; i++) 
    { 
        if (arr[i] > arr[i - 1]) 
            continue; 
  
        if (arr[i] <= arr[i - 1]) 
            break; 
    } 
  
    if (i == n - 1) 
        return 1; 
  
    // Check for decreasing sequence 
    for (j = i + 1; j < n; j++)  
    { 
        if (arr[j] < arr[j - 1]) 
            continue; 
  
        if (arr[j] >= arr[j - 1]) 
            break; 
    } 
  
    i = j; 
  
    if (i != n) 
        return 0; 
  
    return 1; 
} 
  
// Driver Code 
public static void main(String args[])  
{ 
    int arr[] = { -3, 9, 7, 20, 17, 5, 1 }; 
  
    int n = arr.length; 
  
    System.out.println((checkBitonic(arr, n) == 1) ?  
                                             "YES" : "NO"); 
} 
} 
  
// This code is contributed by Bilal 

