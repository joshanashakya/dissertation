

// Java program to find the index of 
// first '1' in a sorted array of 0's and 1's 
class GFG { 
      
  
    // function to find the index of first '1' 
    public static int indexOfFirstOne(int arr[], int n) 
    { 
        // traverse the array from left to right 
        for (int i = 0; i < n; i++) 
       
            // if true, then return i 
            if (arr[i] == 1) 
                return i; 
       
        // 1's are not present in the array 
        return -1; 
    } 
      
    /* Driver program to test above function */
    public static void main(String[] args)  
    { 
        int arr[] = { 0, 0, 0, 0, 0, 0, 1, 1, 1, 1 }; 
        int n = arr.length; 
        System.out.println(indexOfFirstOne(arr, n)); 
          
    } 
  } 
// This code is contributed by Arnav Kr. Mandal. 

