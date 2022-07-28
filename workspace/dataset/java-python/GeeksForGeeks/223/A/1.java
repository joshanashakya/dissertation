

// Java implementation of the approach  
class GFG  
{ 
  
    // Function to return the smallest number  
    // that divides minimum number of elements  
    static int findMin(int arr[], int n)  
    {  
        // m stores the maximum in the array  
        int m = 0;  
        for (int i = 0; i < n; i++)  
            m = Math.max(m, arr[i]);  
      
        // Frequency table  
        int cnt[] = new int[m + 2];  
      
        // Loop to factorize  
        for (int i = 0; i < n; i++)  
        {  
      
            // sqrt factorization of the numbers  
            for (int j = 1; j * j <= arr[i]; j++)  
            {  
                if (arr[i] % j == 0) 
                {  
                    if (j * j == arr[i])  
                        cnt[j]++;  
                    else
                    { 
                        cnt[j]++; 
                        cnt[arr[i] / j]++;  
                    } 
                }  
            }  
        }  
      
        // Finding the smallest number  
        // with zero multiples  
        for (int i = 1; i <= m + 1; i++)  
            if (cnt[i] == 0)  
            {  
                return i;  
            }  
        return -1;  
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

