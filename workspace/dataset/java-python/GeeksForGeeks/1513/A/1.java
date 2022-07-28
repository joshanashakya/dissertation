

// Java program to find maximum value (a[i]+i)* 
// (a[j]+j) in an array of integers 
// maxval() returns maximum value of (a[i]+i)*(a[j]+j) 
// where i is not equal to j 
  
class GFG { 
  
    static int maxval(int[] a, int n) { 
  
        // there must be at-least two elements in 
        // the array 
        if (n < 2) { 
            System.out.print("Invalid Input"); 
            return -9999; 
        } 
        // max1 will store the maximum value of 
        //      (a[i]+i) 
        // max2 will store the second maximum value  
        //      of (a[i]+i) 
        int max1 = 0, max2 = 0; 
        for (int i = 0; i < n; i++) { 
            int x = a[i] + i; 
  
            // If current element x is greater than  
            // first then update first and second 
            if (x > max1) { 
                max2 = max1; 
                max1 = x; 
            } // if x is in between max1 and  
            // max2 then update max2 
            else if (x > max2 & x != max1) { 
                max2 = x; 
            } 
        } 
        return (max1 * max2); 
  
// test the function 
    } 
  
    public static void main(String[] args) { 
        int arr[] = {4, 5, 3, 1, 10}; 
        int len = arr.length; 
        System.out.println(maxval(arr, len)); 
    } 
} 
// This code is contributed by Rajput-Ji  

