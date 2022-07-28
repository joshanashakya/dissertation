

// Java program to find number of Quadruples from four 
// arrays such that their XOR equals to 'x' 
class GFG { 
      
    // Function to return the number of Quadruples with XOR 
    // equals to x such that every element of Quadruple is 
    // from different array. 
    static int findQuadruples(int a[], int b[], int c[], 
                                   int d[], int x, int n) 
    { 
        int count = 0; 
        for (int i = 0 ; i < n ; i++) 
            for (int j = 0 ; j < n ; j++) 
                for (int k = 0 ; k < n ; k++) 
                    for (int l = 0 ; l < n ; l++) 
      
                        // Check whether XOR is equal to x 
                        if ((a[i] ^ b[j] ^ c[k] ^ d[l]) == x) 
                            count++; 
      
        return count; 
    } 
      
    // Driver method 
    public static void main(String[] args) 
    { 
        int x = 3; 
        int a[] = {0, 1}; 
        int b[] = {2, 0}; 
        int c[] = {0, 1}; 
        int d[] = {0, 1}; 
      
        int n = a.length; 
      
        System.out.println(findQuadruples(a, b, c, d, x, n)); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

