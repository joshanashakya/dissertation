

// Java program to find the N-th term of the series:  
// 1, 6, 17, 34, 56, 86, 121, 162, .....  
  
public class GFG { 
      
    // calculate Nth term of series  
    static int nthTerm(int n)  
    {  
        return 3 * (int) Math.pow(n, 2) - 4 * n + 2;  
    }  
        
    // Driver code 
    public static void main(String args[]) 
    { 
        int N = 4;  
            
       System.out.println(nthTerm(N));  
      
    } 
    // This Code is contributed by ANKITRAI1 
} 
  

