

// Java program to find an element  
// which divides the array in two  
// sub-arrays with equal product. 
class GFG 
{ 
      
// Function to find 
// the index 
static int findElement(int arr[],  
                       int n) 
{ 
    // Forming prefix  
    // sum array from 0 
    int prefixMul[] = new int[n]; 
    prefixMul[0] = arr[0]; 
    for (int i = 1; i < n; i++) 
        prefixMul[i] = prefixMul[i - 1] *  
                                  arr[i]; 
  
    // Forming suffix sum  
    // array from n-1 
    int suffixMul[] = new int[n]; 
    suffixMul[n - 1] = arr[n - 1]; 
    for (int i = n - 2; i >= 0; i--) 
        suffixMul[i] = suffixMul[i + 1] *  
                                  arr[i]; 
  
    // Find the point where prefix  
    // and suffix sums are same. 
    for (int i = 1; i < n - 1; i++) 
        if (prefixMul[i] == suffixMul[i]) 
            return arr[i]; 
  
    return -1; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int arr[] = {2, 3, 4,  
                 1, 4, 6}; 
                   
    int n = arr.length; 
    System.out.println(findElement(arr, n)); 
  
} 
} 
  
// This code is contributed  
// by Arnab Kundu 

