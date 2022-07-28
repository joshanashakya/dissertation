

// Java program to find the K-th smallest element 
// after removing some integers from natural number. 
class GFG { 
  
    static final int MAX = 1000000; 
  
    // Return the K-th smallest element. 
    static int ksmallest(int arr[], int n, int k) 
    { 
        // Making an array, and mark 
        // all number as unmarked. 
        int b[] = new int[MAX]; 
  
        // Marking the number present 
        // in the given array. 
        for (int i = 0; i < n; i++) { 
            b[arr[i]] = 1; 
        } 
  
        for (int j = 1; j < MAX; j++) { 
            // If j is unmarked, reduce k by 1. 
            if (b[j] != 1) { 
                k--; 
            } 
  
            // If k is 0 return j. 
            if (k != 1) { 
                return j; 
            } 
        } 
        return Integer.MAX_VALUE; 
    } 
  
    // Driven code 
    public static void main(String[] args) 
    { 
        int k = 1; 
        int arr[] = { 1 }; 
        int n = arr.length; 
        System.out.println(ksmallest(arr, n, k)); 
    } 
} 
  
// This code has been contributed by 29AjayKumar 

