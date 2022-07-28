

// Java Program to find the nth square 
// free number 
import java.io.*; 
  
class GFG { 
      
    // Function to find nth square free 
    // number 
    public static int squareFree(int n)  
    { 
          
        // To maintain count of square  
        // free number 
        int cnt = 0; 
      
        // Loop for square free numbers 
        for (int i = 1; ; i++) { 
              
            boolean isSqFree = true; 
              
            for (int j = 2; j * j <= i; j++)  
            { 
                  
                // Checking whether square  
                // of a number is divisible 
                // by any number which is 
                // a perfect square 
                if (i % (j * j) == 0) { 
                    isSqFree = false; 
                    break; 
                } 
            } 
          
            // If number is square free 
            if (isSqFree == true) { 
                cnt++; 
          
                // If the cnt becomes n, 
                // return the number 
                if (cnt == n) 
                    return i; 
            } 
        } 
    } 
      
    // driven code 
    public static void main(String[] args) { 
          
        int n = 10; 
          
        System.out.println("" + squareFree(n)); 
    } 
} 
  
// This code is contributed by sunnysingh 

