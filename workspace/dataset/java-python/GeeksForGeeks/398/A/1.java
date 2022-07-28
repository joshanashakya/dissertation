

// Java implementation of the approach  
class GFG  
{ 
      
    // Function to find the required subsequence  
    static void findSubSeq(int arr[], int n, int sum)  
    {  
        for (int i = n - 1; i >= 0; i--) 
        {  
      
            // Current element cannot be a part  
            // of the required subsequence  
            if (sum < arr[i])  
                arr[i] = -1;  
      
            // Include current element in  
            // the requried subsequence  
            // So update the sum  
            else
                sum -= arr[i];  
        }  
      
        // Print the elements of the  
        // required subsequence  
        for (int i = 0; i < n; i++)  
        {  
      
            // If the current element was  
            // included in the subsequence  
            if (arr[i] != -1)  
                System.out.print(arr[i] + " ");  
        }  
    }  
      
    // Driver code  
    public static void main (String[] args)  
    {  
        int arr[] = { 17, 25, 46, 94, 201, 400 };  
        int n = arr.length;  
        int sum = 272;  
      
        findSubSeq(arr, n, sum);  
    }  
} 
  
// This code is contributed by AnkitRai01 

