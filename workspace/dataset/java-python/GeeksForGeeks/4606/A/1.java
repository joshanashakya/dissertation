

// Pell Number Series using Recursion in JAVA 
class PellNumber { 
  
    // calculate n-th Pell number 
    public static int pell(int n) 
    { 
        if (n <= 2) 
            return n; 
        return 2 * pell(n - 1) + pell(n - 2); 
    } 
  
    // driver function 
    public static void main(String args[]) 
    { 
        int n = 4; 
        System.out.println(pell(n)); 
    } 
} 

