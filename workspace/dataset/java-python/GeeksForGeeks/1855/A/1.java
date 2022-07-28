

// A space efficient Java program to check if 
// all characters of string are unique. 
class GFG { 
          
    // Returns true if all characters of str are 
    // unique. 
    // Assumptions : (1) str contains only characters 
    //                 from 'a' to 'z' 
    //             (2) integers are stored using 32 
    //                 bits 
    static boolean areChractersUnique(String str) 
    { 
          
        // An integer to store presence/absence 
        // of 26 characters using its 32 bits. 
        int checker = 0; 
      
        for (int i = 0; i < str.length(); ++i) 
        { 
            int val = (str.charAt(i)-'a'); 
      
            // If bit corresponding to current 
            // character is already set 
            if ((checker & (1 << val)) > 0) 
                return false; 
      
            // set bit in checker 
            checker |= (1 << val); 
        } 
      
        return true; 
    } 
      
    //driver code 
    public static void main (String[] args) 
    { 
        String s = "aaabbccdaa"; 
          
        if (areChractersUnique(s)) 
            System.out.print("Yes"); 
        else
            System.out.print("No"); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

