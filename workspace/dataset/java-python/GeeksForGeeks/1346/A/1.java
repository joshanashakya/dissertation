

// Java program to count divisors of n that  
// have at least one digit common with n 
class GFG { 
      
    // function to return true if any digit 
    // of m is present in hash[]. 
    static boolean isDigitPresent(int m,  
                            boolean hash[]) 
    { 
          
        // check till last digit 
        while (m > 0) { 
      
            // if number is also present  
            // in original number then  
            // return true 
            if (hash[m % 10]) 
                return true; 
            m = m / 10; 
        } 
      
        // if no number matches then  
        // return 1 
        return false; 
    } 
      
    // Count the no of divisors that  
    // have at least 1 digits same 
    static int countDivisibles(int n) 
    { 
          
        // Store digits present in n  
        // in a hash[] 
        boolean hash[] = new boolean[10]; 
        int m = n;  
        while (m > 0) { 
      
            // marks that the number  
            // is present 
            hash[m % 10] = true;  
      
            // last digit removed  
            m = m / 10;  
        } 
      
        // loop to traverse from 1 to 
        // sqrt(n) to count divisors 
        int ans = 0; 
        for (int i = 1; i <= Math.sqrt(n); 
                                    i++) 
        { 
      
            // if i is the factor 
            if (n % i == 0) { 
      
                // call the function to  
                // check if any digits  
                // match or not 
                if (isDigitPresent(i, hash)) 
                    ans++; 
      
                if (n / i != i) { 
      
                    // if n/i != i then a  
                    // different number,  
                    // then check it also 
                    if (isDigitPresent(n/i, hash)) 
                        ans++; 
                } 
            } 
        } 
      
        // return the answer 
        return ans; 
    } 
      
    //driver code 
    public static void main (String[] args) 
    { 
        int n = 15; 
          
        System.out.print(countDivisibles(n)); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

