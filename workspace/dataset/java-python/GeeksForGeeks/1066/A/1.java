

// Java implementation of the approach 
class GFG 
{ 
      
    // Function that returns true if the number represented 
    // by the given array is divisible by y 
    static boolean isDivisible(int [] arr, int n, int y) 
    { 
        int d = 0, i = 0; 
      
        // While there are digits left 
        while (i < n)  
        { 
      
            // Select the next part of the number 
            // i.e. the maximum number which is <= y 
            while (d < y && i < n) 
                d = d * 10 + arr[i++]; 
      
            // Get the current remainder 
            d = d % y; 
        } 
      
        // If the final remainder is 0 
        if (d == 0) 
            return true; 
        return false; 
    } 
      
    // Driver code 
    public static void main (String[] args)  
    { 
          
        int [] arr = { 1, 2, 1, 5, 6 }; 
        int x = arr.length; 
        int y = 4; 
      
        System.out.println(isDivisible(arr, x, y) ? "Yes" : "No"); 
    } 
} 
  
// This code is contributed by ihritik  

