

// Java implementation of the approach 
import java.io.*; 
  
class GFG { 
  
    // Function to return the count of 
    // rectangles when n is odd 
    static int countOdd(int n) 
    { 
        int coun = 0, m, j, i; 
        for (i = n - 2; i >= 1; i--) { 
            if (i >= 1) { 
  
                // Calculating number of dots 
                // in vertical level 
                m = (n - i) / 2; 
  
                // Calculating number of ways 
                // to select two points in the 
                // horizontal level i 
                j = (i * (i + 1)) / 2; 
  
                // Multiply both to obtain the number of 
                // rectangles formed at that level 
                coun += j * m; 
            } 
            else { 
  
                // Calculating number of dots 
                // in vertical level 
                m = ((n - 1) - i) / 2; 
  
                // Calculating number of ways 
                // to select two points in the 
                // horizontal level i 
                j = (i * (i + 1)) / 2; 
  
                // Multiply both to obtain the number of 
                // rectangles formed at that level 
                coun += j * m; 
            } 
        } 
        return coun; 
    } 
  
    // Function to return the count of 
    // rectangles when n is even 
    static int countEven(int n) 
    { 
        int coun = 0, m, j, i; 
        for (i = n - 2; i >= 1; i--) { 
            if (i >= 1) { 
                m = ((n - 1) - i) / 2; 
                j = (i * (i + 1)) / 2; 
                coun += j * m; 
            } 
            else { 
                m = (n - i) / 2; 
                j = (i * (i + 1)) / 2; 
                coun += j * m; 
            } 
        } 
        return coun; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
  
        int n = 5; 
  
        // If n is odd 
        if (n >= 1) 
            System.out.println(countOdd(n)); 
        else
            System.out.println(countEven(n)); 
    } 
} 
  
// This code is contributed by Tushil.. 

