

// Java implementation of the approach  
  
class GFG 
{ 
      
    // Function to find permutation(p) of first N  
    // natural numbers such that there are exactly K  
    // elements of permutation such that GCD(p[i], i)>1  
    static void Permutation(int n, int k)  
    {  
        int[] p = new int[n + 1];  
  
        // First place all the numbers  
        // in their respective places  
        for (int i = 1; i <= n; i++)  
            p[i] = i;  
  
        // Modify for first n-k integers  
        for (int i = 1; i < n - k; i++)  
            p[i + 1] = i;  
  
        // In first index place n-k  
        p[1] = n - k;  
  
        // Print the permutation  
        for (int i = 1; i <= n; i++)  
            System.out.print(p[i] + " ");  
    }  
  
    // Driver code  
    public static void main(String[] args) 
    {  
        int n = 5, k = 2;  
        Permutation(n, k); 
    }  
} 
  
// This code is contributed by Naman_Garg 

