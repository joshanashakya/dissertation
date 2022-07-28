

// Java implementation to find the 
// missing number in shuffled array 
  
class GFG  
{ 
    // Returns the missing number 
    // Size of arr2[] is n-1 
    static int missingNumber(int arr1[],  
                             int arr2[], 
                                  int n) 
    { 
        // Missing number 'mnum' 
        int mnum = 0; 
      
        // 1st array is of size 'n' 
        for (int i = 0; i < n; i++) 
            mnum = mnum ^ arr1[i]; 
      
        // 2nd array is of size 'n - 1' 
        for (int i = 0; i < n - 1; i++) 
            mnum = mnum ^ arr2[i]; 
      
        // Required missing number 
        return mnum; 
    } 
      
    // Driver Code 
    public static void main (String[] args)  
    { 
        int arr1[] = {4, 8, 1, 3, 7}; 
        int arr2[] = {7, 4, 3, 1}; 
        int n = arr1.length; 
          
        System.out.println("Missing number = "
            + missingNumber(arr1, arr2, n)); 
    } 
} 

