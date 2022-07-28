

// Java program to find  
// sum in the given  
// range in the sequence 
// 1 3 5 7.....N  
// 2 4 6...N-1 
  
class GFG { 
      
    // Function that returns sum 
    // in the range 1 to x in the 
    // sequence 1 3 5 7.....N 2 4 6...N-1 
    static double sumTillX(double x,  
                           double n) 
    { 
          
        // number of odd numbers 
        double odd = Math.ceil(n / 2.0); 
      
        if (x <= odd) 
            return x * x; 
      
        // number of extra even  
        // numbers required 
        double even = x - odd; 
      
        return ((odd * odd) + (even *  
                       even) + even); 
    } 
      
    static double rangeSum(double N,  
                           double L,  
                           double R) 
    { 
        return sumTillX(R, N) -  
               sumTillX(L-1, N); 
    } 
      
    // Driver Code 
    public static void main(String args[]) 
    { 
        long N = 10, L = 1, R = 6;  
        int n = 101; 
        System.out.println((int)rangeSum(N, L, R)); 
          
    } 
} 
  
// This code is contributed by Sam007 

