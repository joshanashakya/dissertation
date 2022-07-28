

// Java program for counting number of 
// cell equals to given x 
class GFG 
{ 
    // function to count factors as  
    // number of cell 
    static int count (int n, int x) 
    { 
        int count = 0; 
      
        // traverse and find the factors 
        for (int i = 1; i <= n && i <= x ; 
                                    i++) 
        { 
            // x%i == 0 means i is factor 
            // of x. x/i <= n means i and 
            // j are <= n (for i*j=x) 
            if ( x / i <= n && x % i == 0) 
                count++; 
        } 
          
        // return count  
        return count; 
    } 
  
    // driver program 
    public static void main(String args[]) 
    { 
        int n = 8; 
          
        // we can manually assume matrix  
        // of order 8*8 where  
        // mat[i][j] = i*j , 0<i,j<=n 
        int x = 24; 
        System.out.println(count(n, x)); 
    } 
} 
  
/*This code is contributed by Danish kaleem*/

