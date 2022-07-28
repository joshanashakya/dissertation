

// Java implementation of the approach 
class GFG  
{ 
      
    // Utility function to return  
    // the sum of the array  
    static int sumArr(int arr[], int n)  
    {  
        int sum = 0;  
        for (int i = 0; i < n; i++)  
            sum += arr[i];  
        return sum;  
    }  
      
    // Function to return the sum  
    // of the modified array  
    static int sumModArr(int arr[], int n)  
    {  
        int subSum = arr[n - 1];  
        for (int i = n - 2; i >= 0; i--) 
        {  
            int curr = arr[i];  
      
            // Subtract the subarray sum  
            arr[i] -= subSum;  
      
            // Sum of subarray arr[i...n-1]  
            subSum += curr;  
        }  
      
        // Return the sum of  
        // the modified array  
        return sumArr(arr, n);  
    }  
      
    // Driver code  
    public static void main (String[] args)  
    {  
        int []arr = { 40, 25, 12, 10 };  
        int n = arr.length;  
      
        System.out.println(sumModArr(arr, n));  
    }  
} 
  
// This code is contributed by kanugargng 

