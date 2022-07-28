

// Java implementation of the approach  
import java.util.*; 
class GFG  
{ 
      
    // Function to find the required subsequence  
    static void findSubSeq(int arr[], int n)  
    {  
      
        // Sort the array  
        Arrays.sort(arr);  
      
        // Keep a count of the length of the  
        // subsequence and the previous element  
        int count[] = new int[n];  
        int prev[] = new int[n];  
      
        int i, j; 
          
        // Set the initial values  
        for(i = 0 ; i < n; i++) 
        count[i] = 1; 
          
        for(j = 0; j < n; j++) 
            prev[j] = -1; 
      
        // Maximum length of the subsequence and  
        // the last element  
        int max = 0;  
        int maxprev = -1;  
      
        // Run a loop for every element  
        for ( i = 0; i < n; i++) 
        {  
      
            // Check for all the divisors  
            for ( j = i - 1; j >= 0; j--)  
            {  
      
                // If the element is a divisor and  
                // the length of subsequnce will  
                // increase by adding j as  
                // previous element of i  
                if (arr[i] % arr[j] == 0 &&  
                    count[j] + 1 > count[i]) 
                {  
      
                    // Increase the count  
                    count[i] = count[j] + 1;  
                    prev[i] = j;  
                }  
            }  
      
            // Update the max count  
            if (max < count[i])  
            {  
                max = count[i];  
                maxprev = i;  
            }  
        }  
      
        // Get the last index of the subsequence  
        i = maxprev;  
        while (i >= 0)  
        {  
      
            // Print the element  
            if (arr[i] != -1)  
                System.out.print(arr[i] + " ");  
      
            // Move the index to the previous element  
            i = prev[i];  
        }  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        int arr[] = { 1, 2, 3, 4, 5 };  
        int n = arr.length;  
      
        findSubSeq(arr, n);  
    }  
} 
  
// This code is contributed by AnkitRai01 

