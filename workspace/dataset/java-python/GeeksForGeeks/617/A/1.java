

// Efficient Java program to compute sum of 
// subarray elements 
class GFG { 
      
    //function compute sum all sub-array 
    public static long SubArraySum( int arr[] , int n ) 
    { 
        long result = 0; 
       
        // computing sum of subarray using formula 
        for (int i=0; i<n; i++) 
            result += (arr[i] * (i+1) * (n-i)); 
       
        // return all subarray sum 
        return result ; 
    } 
      
    /* Driver program to test above function */
    public static void main(String[] args)  
    { 
        int arr[] = {1, 2, 3} ; 
        int n = arr.length; 
        System.out.println("Sum of SubArray " +  
                           SubArraySum(arr, n)); 
    } 
} 
// This code is contributed by Arnav Kr. Mandal. 

