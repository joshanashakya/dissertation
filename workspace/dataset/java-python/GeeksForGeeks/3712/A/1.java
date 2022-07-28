

// Java program to find an extra  
// element present in arr1[] 
class GFG  
{ 
  
    // Returns index of extra element  
    // in arr1[]. n is size of arr2[].  
    // Size of arr1[] is n-1. 
    static int findExtra(int arr1[],  
                         int arr2[], int n) 
    { 
    for (int i = 0; i < n; i++) 
        if (arr1[i] != arr2[i]) 
            return i; 
      
    return n; 
    } 
      
    // Driver Code 
    public static void main (String[] args) 
    { 
        int arr1[] = {2, 4, 6, 8,  
                      10, 12, 13}; 
        int arr2[] = {2, 4, 6,  
                      8, 10, 12}; 
        int n = arr2.length; 
      
        // Solve is passed both arrays 
        System.out.println(findExtra(arr1,  
                                     arr2, n)); 
    } 
} 
  
// This code is contributed by Harsh Agarwal 

