

// Java program to count 
// number of Dyck Paths 
class GFG 
{ 
    // Returns count Dyck  
    // paths in n x n grid 
    public static int countDyckPaths(int n) 
    { 
        // Compute value of 2nCn 
        int res = 1; 
        for (int i = 0; i < n; ++i) 
        { 
            res *= (2 * n - i); 
            res /= (i + 1); 
        } 
  
        // return 2nCn/(n+1) 
        return res / (n + 1); 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int n = 4; 
        System.out.println("Number of Dyck Paths is " + 
                                    countDyckPaths(n)); 
    } 
} 

