

// Java implementation of the approach  
class GFG  
{ 
      
    // Function to return the  
    // count of valid pairs  
    static int countPairs(int arr[], int n)  
    {  
      
        // To store the required count  
        int cnt = 0;  
      
        // For each index pair (i, j)  
        for (int i = 0; i < n; i++)  
        {  
            for (int j = i + 1; j < n; j++)  
            {  
      
                // If current pair is valid  
                // then increment the count  
                if (arr[i] != arr[j])  
                    cnt++;  
            }  
        }  
        return cnt;  
    }  
      
    // Driven code  
    public static void main (String[] args) 
    {  
        int arr[] = { 1, 1, 2 };  
        int n = arr.length;  
      
        System.out.println(countPairs(arr, n));  
    }  
} 
  
// This code is contributed by AnkitRai01 

