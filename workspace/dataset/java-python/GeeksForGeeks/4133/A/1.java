

// Java program to find partition point in  
// array to maximize xor sum 
class GFG 
{ 
  
    // Function to find partition point in 
    // array to maximize xor sum 
    public static int Xor_Sum(int[] arr, int n)  
    { 
        int sum = 0, index = -1; 
        int left_xor = 0, right_xor = 0; 
  
        // Traverse through the array 
        for (int i = 0; i < n; i++) 
        { 
  
            // Calculate xor of elements left of index i 
            // including ith element 
            left_xor = left_xor ^ arr[i]; 
            right_xor = 0; 
  
            for (int j = i + 1; j < n; j++) 
            { 
  
                // Calculate xor of the elements right of 
                // index i 
                right_xor = right_xor ^ arr[j]; 
            } 
  
            // Keep the maximum possible xor sum 
            if (left_xor + right_xor > sum)  
            { 
                sum = left_xor + right_xor; 
                index = i; 
            } 
        } 
  
        // Return the 1 based index of the array 
        return index + 1; 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        int[] arr = { 1, 4, 6, 3, 8,  
                      13, 34, 2, 21, 10 }; 
        int n = arr.length; 
  
        // Function call 
        System.out.println(Xor_Sum(arr, n)); 
  
    } 
} 
  
// This code is contributed by sanjeev2552 

