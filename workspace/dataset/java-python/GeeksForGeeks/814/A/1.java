

// JAVA program to check if 
// a given number is 
// Non-Hypotenuse number or not. 
  
class GFG { 
    // Function to find prime factor 
    // and check if it is of the form 
    // 4k+1 or not 
  
    static boolean isNonHypotenuse(int n) 
    { 
        // 2 is a prime number but 
        // not of the form 4k+1 
        // so, keep Dividing n by 2 
        // until n is divisible by 2 
        while (n % 2 == 0) { 
            n = n / 2; 
        } 
  
        // n must be odd at this point. So we can skip 
        // one element (Note i = i +2) 
        for (int i = 3; i <= Math.sqrt(n); i = i + 2) { 
  
            // if i divides n 
            // check if i is of the form 
            // 4k+1 or not 
  
            if (n % i == 0) { 
                if ((i - 1) % 4 == 0) 
                    return false; 
  
                // while i divides n 
                // divide n by i 
                // and update n 
                while (n % i == 0) { 
                    n = n / i; 
                } 
            } 
        } 
  
        // This condition is to handle the 
        // case when n  is a prime number 
        // greater than 2 
        if (n > 2 && (n - 1) % 4 == 0) 
            return false; 
  
        else
            return true; 
    } 
  
    public static void test(int n) 
    { 
  
        System.out.println("Testing for "
                           + n + " : "); 
  
        if (isNonHypotenuse(n)) 
            System.out.println("YES"); 
  
        else
            System.out.println("NO"); 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
  
        int n = 11; 
        test(n); 
  
        n = 10; 
        test(n); 
    } 
} 

