

// Java implementation of the approach 
  
class GFG 
{ 
    // Iterative function to calculate 
    // (x ^ y) % p in O(log y) 
    static int power(int x, int y, int p) 
    { 
      
        // Initialize result 
        int res = 1; 
      
        // Update x if it is >= p 
        x = x % p; 
      
        while (y > 0)  
        { 
      
            // If y is odd, multiply x with result 
            if (y % 2 == 1) 
                res = (res * x) % p; 
      
            // y must be even now 
            // y = y / 2 
            y = y >> 1; 
            x = (x * x) % p; 
        } 
        return res; 
    } 
      
    // Function to return XXX.....(N times) % M 
    static int findModuloByM(int X, int N, int M) 
    { 
      
        // Return the mod by M of smaller numbers 
        if (N < 6) 
        { 
      
            // Creating a string of N X's 
            String temp=""; 
            for(int i = 0; i< N ; i++) 
                temp = temp + (char)(X + 48); 
      
            // Converting the string to int 
            // and calculating the modulo 
            int res = Integer.parseInt(temp) % M; 
      
            return res; 
        } 
      
        // Checking the parity of N 
        if (N % 2 == 0)  
        { 
      
            // Dividing the number into equal half 
            int half = findModuloByM(X, N / 2, M) % M; 
      
            // Utilizing the formula for even N 
            int res = (half * power(10, N / 2, M) 
                    + half) 
                    % M; 
      
            return res; 
        } 
        else 
        { 
            // Dividing the number into equal half 
            int half = findModuloByM(X, N / 2, M) % M; 
      
            // Utilizing the formula for odd N 
            int res = (half * power(10, N / 2 + 1, M) 
                    + half * 10 + X) 
                    % M; 
      
            return res; 
        } 
    } 
      
    // Driver code 
    public static void main (String[] args) 
    { 
        int X = 6, N = 14, M = 9; 
      
        // Print XXX...(N times) % M 
        System.out.println(findModuloByM(X, N, M)); 
    } 
}      
  
// This code is contributed by ihritik 

