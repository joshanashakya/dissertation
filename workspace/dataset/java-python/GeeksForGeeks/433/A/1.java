

// Java Code for Count pairs in an 
// array that hold i*arr[i] > j*arr[j] 
class GFG { 
      
    // Return count of pair in given array 
    // such that  i*arr[i] > j*arr[j] 
    public static int CountPair(int arr[] , int n ) 
    { 
        int result = 0; // Initialize result 
       
        for (int i = 0; i < n; i++) 
        { 
            // Generate all pair and increment 
            // counter if the hold given condition 
            for (int j = i + 1; j < n; j++) 
                if (i*arr[i] > j*arr[j] ) 
                    result ++; 
        } 
        return result; 
    } 
      
    /* Driver program to test above function */
    public static void main(String[] args)  
    { 
        int arr[] = {5 , 0, 10, 2, 4, 1, 6} ; 
        int n = arr.length; 
        System.out.println("Count of Pairs : " + 
                            CountPair(arr, n)); 
    } 
  } 
// This code is contributed by Arnav Kr. Mandal. 

