

// Java implementation to efficiently check 
// whether n is a multiple of 4 or not 
  
class GFG { 
    // method to check whether 'n' is 
    // a multiple of 4 or not 
    static boolean isAMultipleOf4(int n) 
    { 
        // if true, then 'n' is a multiple of 4 
        if ((n & 3) == 0) 
            return true; 
  
        // else 'n' is not a multiple of 4 
        return false; 
    } 
  
    // Driver method 
    public static void main(String[] args) 
    { 
        int n = 16; 
        System.out.println(isAMultipleOf4(n) ? "Yes" : "No"); 
    } 
} 

