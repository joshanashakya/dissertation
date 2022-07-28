

// Java program to find the N-th term of the series:  
// 3, 12, 29, 54, 86, 128, 177, 234, .....   
  
public class GFG { 
      
    // calculate Nth term of series  
    static int nthTerm(int n)  
    {  
        return 4 * (int)Math.pow(n, 2) - 3 * n + 2 ;  
    }  
        
    // Driver code 
    public static void main(String args[]) 
    { 
        int N = 4;  
            
       System.out.println(nthTerm(N));  
      
    } 
    // This Code is contributed by ANKITRAI1 
} 

