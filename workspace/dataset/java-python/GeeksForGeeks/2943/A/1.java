

// Java implementation of the approach 
class GFG 
{ 
    // Function to return the count of 
    // odd numbers in the array 
    static int countOdd(int [] arr, int n) 
    { 
      
        // Variable to count odd numbers 
        int odd = 0; 
      
        for (int i = 0; i < n; i++)  
        { 
      
            // Odd number 
            if (arr[i] % 2 == 1) 
                odd++; 
        } 
        return odd; 
    } 
      
    // Function to return the count of valid pairs 
    static int countValidPairs(int [] arr, int n) 
    { 
        int odd = countOdd(arr, n); 
      
        return (odd * (odd - 1)) / 2; 
    } 
      
    // Driver Code 
    public static void main(String []args) 
    { 
        int [] arr = { 1, 2, 3, 4, 5 }; 
        int n = arr.length; 
        System.out.println(countValidPairs(arr, n)); 
    } 
} 
  
// This code is contributed by ihritik             

