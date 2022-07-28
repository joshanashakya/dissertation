

// JAVA implementation of the above approach  
class GFG { 
// below function checks whether  
// product of digits at even places  
// is divisible by K  
  
    static boolean productDivisible(int n, int k) { 
        int product = 1, position = 1; 
        while (n > 0) { 
  
            // if position is even  
            if (position % 2 == 0) { 
                product *= n % 10; 
            } 
            n = n / 10; 
            position++; 
        } 
  
        if (product % k == 0) { 
            return true; 
        } 
        return false; 
    } 
  
// Driver code  
    public static void main(String[] args) { 
        int n = 321922; 
        int k = 3; 
  
        if (productDivisible(n, k)) { 
            System.out.println("YES"); 
        } else { 
            System.out.println("NO"); 
        } 
    } 
} 

