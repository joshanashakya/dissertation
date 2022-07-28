

// Java program to find next greater Number 
// than N with the same quantity of 
// digits A and B 
  
public class GFG { 
      
    // Recursive function to find the required number 
    static long findNumUtil(long res, int a, int aCount, int b, int bCount, int n) 
    { 
        if (res > 1e11) 
            return (long) 1e11; 
  
        // If the resulting number is >= n and 
        // count of a = count of b, return the number 
        if (aCount == bCount && res >= n) 
            return res; 
  
        // select minimum of two and call the function again 
        return Math.min(findNumUtil(res * 10 + a, a, aCount + 1, b, bCount, n), 
                   findNumUtil(res * 10 + b, a, aCount, b, bCount + 1, n)); 
    } 
  
    // Function to find the number next greater Number 
    // than N with the same quantity of 
    // digits A and B 
    static int findNum(int n, int a, int b) 
    { 
        int result = 0; 
        int aCount = 0; 
        int bCount = 0; 
  
        return (int) findNumUtil(result, a, aCount, b, bCount, n); 
    } 
  
      
    // Driver code 
    public static void main(String args[]) 
    { 
           int N = 4500; 
            int A = 4; 
            int B = 7; 
  
            System.out.println(findNum(N, A, B)); 
  
  
    } 
    // This Code is contributed by ANKITRAI1 
} 

