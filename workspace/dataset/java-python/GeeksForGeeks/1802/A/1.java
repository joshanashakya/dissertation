

// JAVA implementation of the above approach 
  
class GFG { 
  
    // below function checks whether 
    // product of digits at even places 
    // is divisible by sum of digits at odd places 
    static boolean productSumDivisible(int n, int size) 
    { 
        int sum = 0, product = 1; 
        while (n > 0) { 
  
            // if size is even 
            if (size % 2 == 0) { 
                product *= n % 10; 
            }  
  
            // if size is odd 
            else { 
                sum += n % 10; 
            } 
            n = n / 10; 
            size--; 
        } 
  
        if (product % sum == 0) { 
            return true; 
        } 
        return false; 
    } 
    // Driver code 
  
    public static void main(String[] args) 
    { 
        int n = 1234; 
        int len = 4; 
  
        if (productSumDivisible(n, len)) { 
            System.out.println("TRUE"); 
        } 
        else { 
            System.out.println("FALSE"); 
        } 
    } 
} 

