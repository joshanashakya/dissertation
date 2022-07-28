

// Java program to check if a number is 
// divisible by 17 or not using bitwise 
// operator. 
class GFG{ 
      
    // function to check recursively if the 
    // number is divisible by 17 or not 
    static boolean isDivisibleby17(int n) 
    { 
          
        // if n=0 or n=17 then yes 
        if (n == 0 || n == 17) 
            return true; 
      
        // if n is less then 17, not 
        // divisible by 17 
        if (n < 17) 
            return false; 
      
        // reducing the number by  
        // floor(n/16) - n%16 
        return isDivisibleby17((int)(n >> 4) 
                            - (int)(n & 15)); 
    } 
      
    // driver function 
    public static void main(String[] args) 
    { 
        int n = 35; 
        if (isDivisibleby17(n) == true) 
            System.out.printf 
            ("%d is divisible by 17",n); 
        else
            System.out.printf 
            ("%d is not divisible by 17",n); 
    } 
} 
  
// This code is contributed by 
// Smitha Dinesh Semwal 

