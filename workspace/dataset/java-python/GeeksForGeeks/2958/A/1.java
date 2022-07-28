

// Java implementation of the approach  
class GFG 
{ 
      
    static int INT_MAX = Integer.MAX_VALUE ; 
      
    static int min_element(int []A, int N) 
    { 
        int min = A[0]; 
        int i; 
        for( i = 1; i < N ; i++) 
        { 
            if (min > A[i]) 
            { 
                min = A[i]; 
            } 
        } 
        return min; 
    } 
      
    // Function to return the count partitions  
    // possible from the given array such that  
    // the minimum element of any partition  
    // divides all the other elements  
    // of that partition  
    static int countPartitions(int []A, int N)  
    {  
        // Initialize the count variable  
        int count = 0;  
        int i, j; 
          
        for (i = 0; i < N; i++)  
        {  
      
            // Find the minimum element  
            int min_elem = min_element(A, N);  
      
            // Break if no minimum element present  
            if (min_elem == INT_MAX)  
                break;  
      
            // Increment the count if  
            // minimum element present  
            count++;  
      
            // Replace all the element  
            // divisible by min_elem  
            for (j = 0; j < N; j++) 
            {  
                if (A[j] % min_elem == 0)  
                    A[j] = INT_MAX;  
            }  
        }  
        return count;  
    }  
      
    // Driver code  
    public static void main (String[] args)  
    {  
        int arr[] = { 7, 6, 5, 4, 3, 2, 2, 3 };  
        int N = arr.length;  
      
        System.out.println(countPartitions(arr, N));  
    }  
} 
  
// This code is contributed by AnkitRai01 

