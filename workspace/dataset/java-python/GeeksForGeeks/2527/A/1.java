

// Java implementation of the above approach 
class GFG 
{ 
    static int MAXN = 10000000; 
      
    // Function to find the minimum number of steps 
    static int minimumSteps(int n, int m, int a, int b) 
    { 
        // If n exceeds M 
        if (n > m) 
            return MAXN; 
      
        // If N reaches the target 
        if (n == m) 
            return 0; 
      
        // The minimum of both the states 
        // will be the answer 
        return Math.min(1 + minimumSteps(n * a, m, a, b), 
                1 + minimumSteps(n * b, m, a, b)); 
    } 
      
    // Driver code 
    public static void main (String[] args) 
    { 
        int n = 120, m = 51840; 
        int a = 2, b = 3; 
        System.out.println(minimumSteps(n, m, a, b)); 
    } 
} 
  
// This code is contributed by ihritik 

