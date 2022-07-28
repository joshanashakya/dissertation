

// Java implementation to check whether  
// bitwise OR of n numbers is even or odd  
class GFG  
{ 
  
// Function to check if bitwise OR  
// of n numbers is even or odd  
static boolean check(int arr[], int n)  
{ 
    for (int i = 0; i < n; i++)  
    { 
        // if at least one odd number is  
        // found, then the bitwise OR of  
        // all numbers will be odd  
        if (arr[i] % 2 == 1) 
        { 
            return true; 
        } 
    } 
  
    // Bitwise OR is an odd number  
    return false; 
} 
  
// Driver Code  
public static void main(String args[]) 
{ 
    int arr[] = {3, 9, 12, 13, 15}; 
    int n = arr.length; 
  
    if (check(arr, n)) 
    { 
        System.out.println("Odd Bit-wise OR"); 
    }  
    else 
    { 
        System.out.println("Even Bit-wise OR"); 
    } 
} 
} 
  
// This code is contributed 
// by 29AjayKumar 

