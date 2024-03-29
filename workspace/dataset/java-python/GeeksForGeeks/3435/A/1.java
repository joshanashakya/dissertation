

// Java program to print GP. 
class GFG { 
    static void printGP(int a, int r, int n) 
    { 
        int curr_term; 
        for (int i = 0; i < n; i++) { 
            curr_term = a * (int)Math.pow(r, i); 
            System.out.print(curr_term + " "); 
        } 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int a = 2; // starting number 
        int r = 3; // Common ratio 
        int n = 5; // N th term to be find 
        printGP(a, r, n); 
    } 
} 
// This code is contributed by Anant Agarwal. 

