

// Java implementation of the approach  
class GFG 
{ 
      
    // Function to find the required values  
    static void solve(int A, int B)  
    {  
        double p = B / 2.0;  
        double M = Math.ceil(4 * p);  
        int N = 1;  
        int O = - 2 * A;  
        double Q = Math.ceil(A * A + 4 * p * p);  
        System.out.println(M + " " + N +  
                               " " + O + " " + Q);  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        int a = 1;  
        int b = 1;  
        solve(a, b);  
    }  
} 
  
// This code is contributed by AnkitRai01 

