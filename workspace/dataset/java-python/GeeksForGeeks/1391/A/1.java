

// Java program to check if number starts with 
// one in base b representation 
  
class GFG { 
      
    // Returns true if n starts with 1 in 
    // base b represenation 
    static boolean CheckIfstartsWithOne(int n, int b) 
    { 
          
        // highest m can be log2(n) 
        int m = (int)(Math.log10(n) / Math.log10(2)); 
        for (int i = 1; i <= m; i++) { 
              
            // if b^m <= N <= 2*b^m - 1, 
            // return true 
            if (n >= (int)Math.pow(b, i) && 
                n <= 2 * (int)Math.pow(b, i) - 1) 
                return true; 
        } 
          
        return false; 
    } 
  
    // Driver method 
    public static void main(String args[]) 
    { 
        System.out.println( 
           CheckIfstartsWithOne(6, 4) ? "Yes" : "No"); 
             
        System.out.println( 
           CheckIfstartsWithOne(24, 2) ? "Yes" : "No"); 
             
        System.out.println( 
           CheckIfstartsWithOne(24, 7) ? "Yes" : "No"); 
             
        System.out.println( 
           CheckIfstartsWithOne(24, 15) ? "Yes" : "No"); 
    } 
} 

