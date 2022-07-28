

// Java implementation of above approach  
  
import java.util.ArrayList; 
import java.util.List; 
  
public class GFG { 
  
// Declare the ArrayList of factors for storing the  
    static List< Integer> factors = new ArrayList<>(10); 
  
// function to find out the factors of a number  
    static void findFactors(int n) { 
        // Loop until the i reaches the sqrt(n)  
        for (int i = 1; i * i <= n; i++) { 
  
            // Check if i is a factor of n  
            if (n % i == 0) { 
                // if both the factors are same  
                // we only push one factor  
                if ((n / i) == i) { 
                    factors.add(factors.size(), i); 
                } else { 
  
                    // factor1 is pushed  
                    factors.add(factors.size(), n / i); 
  
                    // factor2 is pushed  
                    factors.add(factors.size(), i); 
                } 
            } 
        } 
    } 
  
// Function to find the maximum product  
    static int findProduct(int n) { 
        // Initialize the product with -1  
  
        int product = -1; 
        int si = factors.size(); 
        for (int i = 0; i < si; i++) { 
            for (int j = 0; j < si; j++) { 
                for (int k = 0; k < si; k++) { 
                    for (int l = 0; l < si; l++) { 
  
                        // Find the sum of factors and store it in s  
                        int s = factors.get(i) + factors.get(j) 
                                + factors.get(k) + factors.get(l); 
  
                        // Compare whether it is equal to the n  
                        if (s == n) { 
  
                            // product of factors  
                            int p = factors.get(i) * factors.get(j) * factors.get(k) *  
                                               factors.get(l); 
  
                            // Check whether we have a better  
                            // p now if yes update  
                            if (p > product) { 
                                product = p; 
                            } 
                        } 
                    } 
                } 
            } 
        } 
  
        return product; 
    } 
  
    // Driver Code  
    public static void main(String[] args) { 
        int n = 10; 
  
        // intializes the List with the divisors of n  
        findFactors(n); 
        // prints out the maximised product.  
        System.out.println(findProduct(n)); 
    } 
} 

