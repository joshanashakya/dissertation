

// Java implementation of the approach  
class GFG  
{ 
      
    // Function to find the required numbers  
    static void findNums(int arr[], int n)  
    {  
      
        // Find the sum and xor  
        int S = 0, X = 0;  
        for (int i = 0; i < n; i++)  
        {  
            S += arr[i];  
            X ^= arr[i];  
        }  
      
        // Print the required elements  
        System.out.println(X + " " + (X + S));  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        int arr[] = { 1, 7 };  
        int n = arr.length;  
      
        findNums(arr, n);  
    }  
} 
  
// This code is contributed by AnkitRai01 

