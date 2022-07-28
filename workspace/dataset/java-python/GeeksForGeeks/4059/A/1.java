

// Java implementation of the approach 
class GFG { 
    // Function to return sum 
    static int sum(int k, int n) 
    { 
  
        int sum = 0; 
        for (int i = 0; i <= n; i++) { 
            int p = 1; 
  
            for (int j = 0; j < n - i; j++) { 
                p = p * k; 
            } 
  
            for (int j = 0; j < i; j++) { 
                p = p * (k - 1); 
            } 
  
            sum = sum + p; 
        } 
        return sum; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int n = 3; 
        int K = 3; 
        System.out.println(sum(K, n)); 
    } 
} 
  
// This code is contributed by Code_Mech 

