

// Java program to find if a number has alternate 
// bit pattern 
  
class Test 
{ 
    // Returns true if n has alternate bit pattern 
    // else false 
    static boolean findPattern(int n) 
    { 
        // Store last bit 
        int prev = n % 2; 
        n = n/2; 
       
        // Traverse through remaining bits 
        while (n > 0) 
        { 
            int curr = n % 2; 
       
            // If current bit is same as previous 
            if (curr == prev) 
               return false; 
       
            prev = curr; 
            n = n / 2; 
        } 
       
        return true; 
    } 
      
    // Driver method 
    public static void main(String args[]) 
    { 
        int n = 10; 
        System.out.println(findPattern(n) ? "Yes" : "No"); 
       
    } 
} 

