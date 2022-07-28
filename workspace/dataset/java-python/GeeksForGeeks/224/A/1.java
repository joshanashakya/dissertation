

// Java implementation of the approach  
class GFG 
{ 
      
    // Function to return the smallest number  
    // that divides minimum number of elements  
    // in the given array  
    static int findMin(int arr[], int n)  
    {  
        // m stores the maximum in the array  
        int m = 0;  
        for (int i = 0; i < n; i++)  
            m = Math.max(m, arr[i]);  
      
        // Frequency array  
        int freq [] = new int[m + 2];  
        for (int i = 0; i < n; i++)  
            freq[arr[i]]++;  
      
        // Sieve  
        for (int i = 1; i <= m + 1; i++) 
        {  
            int j = i;  
            int cnt = 0;  
              
            // Incrementing j  
            while (j <= m)  
            {  
                cnt += freq[j];  
                j += i;  
            }  
      
            // If no multiples of j are  
            // in the array  
            if (cnt == 0)  
                return i;  
        }  
        return m + 1;  
    }  
      
    // Driver code  
    public static void main (String[] args)  
    {  
        int arr[] = { 2, 12, 6 };  
        int n = arr.length;  
      
        System.out.println(findMin(arr, n));  
    }  
} 
  
// This code is contributed by AnkitRai01 

