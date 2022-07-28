

// Java implementation of the approach  
class GFG 
{ 
      
    // Utility function to print the  
    // contents of an array  
    static void printArr(int arr[], int n)  
    {  
        for (int i = 0; i < n; i++)  
            System.out.print(arr[i] + " ");  
    }  
      
    // Function to generate and print  
    // the required array  
    static void findArray(int n, int k, int s)  
    {  
      
        // Initially all the positions are empty  
        int vis[] = new int[n] ;  
      
        // To store the count of positions  
        // i such that arr[i] = s  
        int cnt = 0;  
      
        // To store the final array elements  
        int arr[] = new int[n];  
      
        for (int i = 0; i < n && cnt < k; i += 2)  
        {  
      
            // Set arr[i] = s and the gap between  
            // them is exactly 2 so in for loop  
            // we use i += 2  
            arr[i] = s;  
      
            // Mark the i'th position as visited  
            // as we put arr[i] = s  
            vis[i] = 1;  
      
            // Increment the count  
            cnt++;  
        }  
        int val = s;  
      
        // Finding the next odd number after s  
        if (s % 2 == 0)  
            val++;  
        else
            val = val + 2;  
      
        for (int i = 0; i < n; i++)  
        {  
            if (vis[i] == 0) 
            {  
      
                // If the i'th position is not visited  
                // it means we did not put any value  
                // at position i so we put 1 now  
                arr[i] = val;  
            }  
        }  
      
        // Print the final array  
        printArr(arr, n);  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        int n = 8, k = 3, s = 12;  
      
        findArray(n, k, s);  
    }  
} 
  
// This code is contributed by AnkitRai01 

