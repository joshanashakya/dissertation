

// Java program to find x such that x + 
// digSum(x) is equal to n. 
class GFG 
{ 
      
    // utility function for digit sum 
    static int digSum(int n) 
    { 
        int sum = 0, rem = 0; 
          
        while (n>0) { 
            rem = n % 10; 
            sum += rem; 
            n /= 10; 
        } 
          
        return sum; 
    } 
      
    // function for finding x 
    static int findX(int n) 
    { 
          
        // iterate from 1 to n. For every no. 
        // check if its digit sum with it is 
        // equal to n. 
        for (int i = 0; i <= n; i++)  
            if (i + digSum(i) == n) 
                return i; 
          
        // if no such i found return -1 
        return -1; 
    } 
      
    // Driver code 
    public static void main (String[] args) 
    { 
        int n = 43; 
          
        System.out.println("x = "+findX(n)); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

