

// Java code to check if a number can be expressed 
// as x^y (x raised to power y) 
class GFG { 
      
    // Returns true if n can be written as x^y 
    static boolean isPower(int n) 
    { 
        for (int x = 2; x <= Math.sqrt(n); x++) { 
            int p = x; 
  
            while (p <= n) { 
                p = p * x; 
                if (p == n) 
                    return true; 
            } 
        } 
        return false; 
    } 
  
    // Driver function 
    public static void main(String[] args) 
    { 
        for (int i = 2; i < 100; i++) 
            if (isPower(i)) 
                System.out.print(i + " "); 
    } 
} 
  
// This code is submitted by Kamal Rawal 

