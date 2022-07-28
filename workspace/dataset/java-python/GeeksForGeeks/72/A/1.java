

// Java code to check if a number 
// can be expressed as 2^x + 2^y 
  
class GFG { 
  
    // Utility function to check if 
    // a number is power of 2 or not 
    static boolean isPowerOfTwo(int n) 
    { 
        return n != 0 && ((n & (n - 1)) == 0); 
    } 
  
    // Utility function to determine the 
    // value of previous power of 2 
    static int previousPowerOfTwo(int n) 
    { 
        while ((n & n - 1) > 1) { 
            n = n & n - 1; 
        } 
        return n; 
    } 
  
    // function to check if 
    // n can be expressed as 
    // 2^x + 2^y or not 
    static boolean checkSum(int n) 
    { 
        // if value of n is 0 or 1 
        // it can not be expressed as 
        // 2^x + 2^y 
        if (n == 0 || n == 1)  
            return false; 
  
        // if a number is power of 2 
        // it can be expressed as 
        // 2^x + 2^y 
  
        else if (isPowerOfTwo(n)) { 
            System.out.println(n / 2 + " " + n / 2); 
        } 
        else { 
  
            // if the remainder after 
            // subtracting previous power of 2 
            // is also a power of 2 then 
            // it can be expressed as 
            // 2^x + 2^y 
            int x = previousPowerOfTwo(n); 
            int y = n - x; 
            if (isPowerOfTwo(y)) { 
  
                System.out.println(x + " " + y); 
                return true; 
            } 
        } 
  
         return false; 
    } 
    // driver code 
    public static void main(String[] argc) 
    { 
    int n1 = 20; 
    if (checkSum(n1) == false) 
        System.out.println("No"); 
  
    System.out.println(); 
    int n2 = 11; 
    if (checkSum(n2) == false) 
        System.out.println("No"); 
    } 
} 

