

// Java program to find the N-th term of the series:  
// 0, 9, 22, 39, 60, 85, 114, 147.....  
  
public class GFG { 
      
    // calculate Nth term of series  
    static int nthTerm(int n)  
    {  
        return 2 * (int)Math.pow(n, 2) + 3 * n - 5;  
    }  
        
    // Driver code 
    public static void main(String args[]) 
    { 
        int N = 4;  
            
       System.out.println(nthTerm(N));  
      
    } 
    // This Code is contributed by ANKITRAI1 
} 

