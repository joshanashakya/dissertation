

// Java implementation to find encrypted 
// array from the original  array 
  
class GFG { 
    // Finds and prints the elements 
    // of the encrypted array 
    static void findEncryptedArray(int arr[], int n) 
    { 
        // total sum of elements 
        // of original array 
        int sum = 0; 
        for (int i = 0; i < n; i++) 
            sum += arr[i]; 
  
        // calculating and displaying 
        // elements of encrypted array 
        for (int i = 0; i < n; i++) 
            System.out.print(sum - arr[i] + " "); 
    } 
  
    // Driver program 
    public static void main(String[] args) 
    { 
        int arr[] = { 5, 1, 3, 2, 4 }; 
        int N = arr.length; 
        findEncryptedArray(arr, N); 
    } 
} 

