

// Java program to compute sum of  
// all element after doing XOR 
// with itself ( element_time) 
class GFG { 
      
// function return sum of all 
// XOR element of array 
static int XorSum(int arr[], int n) { 
      
    int result = 0; 
    for (int i = 0; i < n; i++) { 
  
    // if number is odd then add it to the 
    // result else not 
    if (arr[i] % 2 != 0) 
        result += arr[i]; 
    } 
  
    return result; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = {1, 2, 6, 3, 4, 5}; 
    int n = arr.length; 
    System.out.println(XorSum(arr, n)); 
} 
} 
  
// This code is contributed by Anant Agarwal. 

