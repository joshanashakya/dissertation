

// Java implementation of the approach 
class GFG 
{ 
  
    // Function to find and print the 
    // required count of pairs 
    static void countPairs(int arr[], int n) 
    { 
  
        // Find the count of even and 
        // odd elements in the array 
        int even = 0, odd = 0; 
        for (int i = 0; i < n; i++) 
        { 
            if (arr[i] % 2 == 0) 
                even++; 
            else
                odd++; 
        } 
  
        // Print the required count of pairs 
        System.out.println((even) * (n - 1)); 
        System.out.println((odd) * (n - 1)); 
    } 
  
    // Driver code 
    public static void main(String args[])  
    { 
        int arr[] = { 2, 3, 4, 5 }; 
        int n = arr.length;  
  
        countPairs(arr, n); 
    } 
} 
  
// This code is contributd by ANKITUMAR34 

