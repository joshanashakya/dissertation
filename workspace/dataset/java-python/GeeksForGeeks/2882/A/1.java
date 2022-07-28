

// Java program to count number of distinct 
// subsets in an array of distinct numbers 
  
class GFG { 
      
    // Returns 2 ^ n 
    static int subsetCount(int arr[], int n) 
    { 
        return 1 << n; 
    } 
      
    /* Driver program to test above function */
    public static void main(String[] args) 
    { 
        int A[] = { 1, 2, 3 }; 
        int n = A.length; 
      
        System.out.println(subsetCount(A, n)); 
    } 
} 
  
// This code is contributed by Prerna Saini. 

