

// Iterative Pell Number Series in Java 
class PellNumber { 
  
    // calculate nth pell number 
    public static int pell(int n) 
    { 
        if (n <= 2) 
            return n; 
        int a = 1; 
        int b = 2; 
        int c; 
        for (int i = 3; i <= n; i++) { 
            c = 2 * b + a; 
            a = b; 
            b = c; 
        } 
        return b; 
    } 
      
    // driver function 
    public static void main(String args[]) 
    { 
        int n = 4; 
        System.out.println(pell(n)); 
    } 
} 

