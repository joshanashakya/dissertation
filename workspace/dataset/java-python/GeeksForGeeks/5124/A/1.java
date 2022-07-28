

// Java implementation of the approach 
class GFG  
{ 
  
// Function to return the required sum 
static int smallestIndexsum(int arr[], int n) 
{ 
  
    // Starting from the last index 
    int i = n - 1; 
  
    // Skip all odd elements and find the 
    // index of the righmost even element 
    while (i >= 0 && arr[i] % 2 == 1) 
        i--; 
  
    // To store the requried sum 
    int sum = 0; 
    for (int j = 0; j <= i; j++) 
        sum += arr[j]; 
  
    return sum; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int arr[] = { 2, 3, 5, 6, 3, 3 }; 
    int n = arr.length; 
  
    System.out.println(smallestIndexsum(arr, n)); 
} 
}  
  
// This code is contributed by 29AjayKumar 

