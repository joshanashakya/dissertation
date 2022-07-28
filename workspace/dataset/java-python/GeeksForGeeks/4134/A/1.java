

// Java program to find partition point in  
// array to maximize xor sum 
import java.util.*; 
  
class GFG  
{ 
  
// Function to calculate Prefix Xor array 
static void ComputePrefixXor(int arr[],  
                             int PrefixXor[], 
                             int n) 
{ 
    PrefixXor[0] = arr[0]; 
      
    // Calculating prefix xor 
    for (int i = 1; i < n; i++) 
        PrefixXor[i] = PrefixXor[i - 1] ^ arr[i]; 
} 
  
// Function to find partition point in  
// array to maximize xor sum 
static int Xor_Sum(int arr[], int n) 
{ 
    // To store prefix xor 
    int []PrefixXor = new int[n]; 
      
    // Compute the prfix xor 
    ComputePrefixXor(arr, PrefixXor, n); 
  
    // To store sum and index 
    int sum = 0, index = 0; 
  
    // Calculate the maximum sum that can be obtained 
    // splitting the array at some index i 
    for (int i = 0; i < n; i++)  
    { 
        // PrefixXor[i] = Xor of all arr  
        // elements till i'th index PrefixXor[n-1] 
        // ^ PrefixXor[i] = Xor of all elements  
        // from i+1' th index to n-1'th index 
        if (PrefixXor[i] + (PrefixXor[n - 1] ^  
                PrefixXor[i]) > sum)  
        { 
            sum = PrefixXor[i] +  
                (PrefixXor[n - 1] ^ PrefixXor[i]); 
            index = i; 
        } 
    } 
      
    // Return the index 
    return index+1; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int arr[] = { 1, 4, 6, 3, 8,  
                 13, 34, 2, 21, 10 }; 
    int n = arr.length; 
      
    // Function call 
    System.out.println(Xor_Sum(arr, n)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

