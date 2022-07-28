

// Java implementation of the approach  
  
class GFG  
{  
      
    // Function that returns true  
    // if the product of even positioned  
    // digits is equal to the product of  
    // odd positioned digits in n  
    static boolean productEqual(int n)  
    {  
      
        // If n is a single digit number  
        if (n < 10)  
            return false;  
        int prodOdd = 1, prodEven = 1;  
      
        while (n > 0)  
        {  
      
            // Take two consecutive digits  
            // at a time  
            // First digit  
            int digit = n % 10;  
            prodOdd *= digit;  
            n /= 10;  
      
            // If n becomes 0 then  
            // there's no more digit  
            if (n == 0)  
                break;  
      
            // Second digit  
            digit = n % 10;  
            prodEven *= digit;  
            n /= 10;  
        }  
      
        // If the products are equal  
        if (prodEven == prodOdd)  
            return true;  
      
        // If products are not equal  
        return false;  
    }  
      
    // Driver code  
    public static void main(String args[])  
    {  
        int n = 4324;  
      
        if (productEqual(n))  
            System.out.println("Yes");  
        else
            System.out.println("No");  
    }  
    // This code is contributed by Ryuga 
}  

