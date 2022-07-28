

// Java implementation of above approach 
  
class GFG { 
  
    // Function that returns the minimum 
    // number of operations to be performed 
    // to reduce the number to 1 
    static int count_minimum_operations(long n) 
    { 
  
        // To stores the total number of 
        // operations to be performed 
        int count = 0; 
        while (n > 1) { 
  
            // if n is divisible by 3 
            // then reduce it to n / 3 
            if (n % 3 == 0) 
                n /= 3; 
  
            // if n modulo 3 is 1 
            // decrement it by 1 
            else if (n % 3 == 1) 
                n--; 
            else { 
                if (n == 2) 
                    n--; 
  
                // if n modulo 3 is 2 
                // then increment it by 1 
                else
                    n++; 
            } 
  
            // update the counter 
            count++; 
        } 
        return count; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
  
        long n = 4; 
        long ans = count_minimum_operations(n); 
        System.out.println(ans); 
    } 
} 

