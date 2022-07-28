

// Java implementation of the above approach 
import java.util.*; 
  
class GFG  
{ 
      
    // Function to return the minimum sum  
    static void findMin(int arr[], int n)  
    {  
        int sum = 0;  
        for (int i = 0; i < n; i++)  
            sum += arr[i];  
      
        // sort the array to find the  
        // minimum element  
        Arrays.sort(arr);  
      
        int min = arr[0];  
        int max = 0;  
      
        for (int i = n - 1; i >= 1; i--)  
        {  
            int num = arr[i];  
            int total = num + min;  
            int j;  
      
            // finding the number to  
            // divide  
            for (j = 2; j <= num; j++)  
            {  
                if (num % j == 0)  
                {  
                    int d = j;  
                    int now = (num / d) +  
                              (min * d);  
      
                    // Checking to what  
                    // instance the sum  
                    // has decreased  
                    int reduce = total - now;  
      
                    // getting the max  
                    // difference  
                    if (reduce > max)  
                        max = reduce;  
                }  
            }  
        }  
        System.out.println(sum - max);  
    }  
      
    // Driver Code  
    public static void main (String[] args)  
    {  
        int arr[] = { 1, 2, 3, 4, 5 };  
        int n = arr.length;  
        findMin(arr, n);  
    } 
} 
  
// This code is contributed by AnkitRai01 

