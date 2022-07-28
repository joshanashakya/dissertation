

// Java program to find maximum difference 
// between adjacent elements in a circular 
// array. 
class GFG { 
  
    static void minAdjDifference(int arr[], int n) 
    { 
        if (n < 2) 
            return; 
  
        // Checking normal adjacent elements 
        int res = Math.abs(arr[1] - arr[0]); 
        for (int i = 2; i < n; i++) 
            res = Math.min(res, Math.abs(arr[i] - arr[i - 1])); 
  
        // Checking circular link 
        res = Math.min(res, Math.abs(arr[n - 1] - arr[0])); 
  
        System.out.print("Min Difference = " + res); 
    } 
  
    // driver code 
    public static void main(String arg[]) 
    { 
  
        int a[] = { 10, 12, 13, 15, 10 }; 
        int n = a.length; 
  
        minAdjDifference(a, n); 
    } 
} 
  
// This code is contributed by Anant Agarwal 
// and improved by Anuj Sharma. 

