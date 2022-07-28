

// Java program to find m-th summation. 
class GFG { 
      
    // Function to return mth summation 
    static int SUM(int n, int m) { 
          
        // base case 
        if (m == 1) 
            return (n * (n + 1) / 2); 
      
        int sum = SUM(n, m - 1); 
          
        return (sum * (sum + 1) / 2); 
    } 
      
    // Driver code 
    public static void main(String[] args) { 
          
        int n = 5; 
        int m = 3; 
          
        System.out.println("SUM(" + n + ", "
                        + m + "): "    + SUM(n, m)); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

