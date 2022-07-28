

// A Java program to find sum of difference  
// between last and first element of each  
// subset 
class GFG { 
      
    // Returns the sum of first elements  
    // of all subsets 
    static int SumF(int S[], int n) 
    { 
        int sum = 0; 
  
        // Compute the SumF as given in  
        // the above explanation 
        for (int i = 0; i < n; i++) 
            sum = sum + (int)(S[i] *  
                Math.pow(2, n - i - 1)); 
        return sum; 
    } 
  
    // Returns the sum of last elements  
    // of all subsets 
    static int SumL(int S[], int n) 
    { 
        int sum = 0; 
  
        // Compute the SumL as given in  
        // the above explanation 
        for (int i = 0; i < n; i++) 
            sum = sum + (int)(S[i] * 
                         Math.pow(2, i)); 
                           
        return sum; 
    } 
  
    // Returns the difference between sum  
    // of last elements of each subset and  
    // the sum of first elements of each  
    // subset 
    static int sumSetDiff(int S[], int n) 
    { 
        return SumL(S, n) - SumF(S, n); 
    } 
  
    // Driver program 
    public static void main(String arg[]) 
    { 
        int n = 4; 
        int S[] = { 5, 2, 9, 6 }; 
          
        System.out.println(sumSetDiff(S, n)); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

