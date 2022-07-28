

// Java implementation of the approach 
class GFG { 
  
    // Function to return the resultant digit 
    // after performing the given operations 
    static int RSF(int n) 
    { 
        while (n >= 10) { 
  
            // Creating an extra copy of n 
            int x = n; 
            int l = 0; 
  
            // Counting the number of digits in n 
            while (n > 0) { 
                n = n / 10; 
                l++; 
            } 
  
            // Now n is 0 
            // Creating an array of length l 
            int a[] = new int[l]; 
  
            // Initializing i with the last index of array 
            int i = l - 1; 
  
            while (x > 0) { 
  
                // Filling array from right to left 
                a[i] = x % 10; 
                x = x / 10; 
                i--; 
            } 
  
            // Calculating the absolute consecutive difference 
            for (int j = 0; j < l - 1; j++) { 
  
                // Updating the value of n in every loop 
                n = n * 10 + Math.abs(a[j] - a[j + 1]); 
            } 
        } 
  
        // While loop ends here and we have found 
        // the RSF value of N 
        return n; 
    } 
  
    // Driver code 
    public static void main(String[] arg) 
    { 
        int n = 6972; 
  
        // Passing n to RSF function and getting answer 
        int ans = RSF(n); 
  
        // Printing the value stored in ans 
        System.out.println(ans); 
    } 
} 

