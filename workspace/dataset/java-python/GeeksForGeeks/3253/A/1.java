

// JAVA Code for Sum of array elements 
// that is first continuously increasing  
// then decreasing 
class GFG { 
      
    public static int arraySum(int arr[], int n) 
    { 
        int x = (n + 1) / 2; 
        return (arr[0] - 1) * n + x * x; 
    } 
      
    /* Driver program to test above function */
    public static void main(String[] args)  
    { 
        int arr[] = {10, 11, 12, 13, 12, 11, 10}; 
        int n = arr.length; 
        System.out.print(arraySum(arr, n));    
    } 
} 
// This code is contributed by Arnav Kr. Mandal. 

