

// Java implementation of the approach 
class GFG 
{ 
      
    // Function to return the missing element  
    static int findMissing(int arr[], int n, 
                           int k, int avg)  
    {  
      
        // Find the sum of the array elements  
        int sum = 0;  
        for (int i = 0; i < n; i++)  
        {  
            sum += arr[i];  
        }  
      
        // The numerator and the denominator  
        // of the equation  
        int num = (avg * (n + k)) - sum;  
        int den = k;  
      
        // If not divisible then X is  
        // not an integer  
        // it is a floating point number  
        if (num % den != 0)  
            return -1;  
      
        // Return X  
        return (int)(num / den);  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        int k = 3, avg = 4;  
        int arr[] = { 2, 7, 3 };  
        int n = arr.length;  
      
        System.out.println(findMissing(arr, n, k, avg));  
    } 
} 
  
// This code is contributed by AnkitRai01 

