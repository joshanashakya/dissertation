

// Java implementation of above approach  
import java.util.ArrayList; 
import java.util.Collections; 
import java.util.List; 
  
public class GFG { 
  
// Declare the ArrayList of factors for storing the  
    static List< Integer> factors = new ArrayList<>(); 
  
// function to find out the factors of a number  
    static void findFactors(int n) { 
        // we loop until the i reaches the sqrt(n)  
        for (int i = 1; i * i <= n; i++) { 
  
            // we check if i is a factor of n  
            if (n % i == 0) { 
  
                // if both the factors are same  
                // only push one factor  
                if ((n / i) == i) { 
                    factors.add(factors.size(), i); 
                } else { 
  
                    // factor1 is pushed  
                    factors.add(factors.size(), n/i); 
  
                    // factor2 is pushed  
                    factors.add(factors.size(), i); 
                } 
            } 
        } 
    } 
  
// Function to find the maximum product  
    static int findProduct(int n) { 
// initialise the product with -1  
        int product = -1; 
        int si = factors.size(); 
  
        for (int i = 0; i < si; i++) { 
            for (int j = 0; j < si; j++) { 
                for (int k = 0; k < si; k++) { 
  
                    // we find the sum of factors  
                    // and store it in s  
                    int s = factors.get(i) + factors.get(j) + factors.get(k); 
  
                    // we check whether the fourth  
                    // factor exists or not  
                    if (Collections.binarySearch(factors, n - s) >= 0) { 
                        // product of factors  
                        int p = factors.get(i) * factors.get(j) * factors.get(k) * (n - s); 
  
                        // we check whether we have a better  
                        // p now if yes update  
                        if (p > product) { 
                            product = p; 
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
  
        // intializes the vectors with the divisors of n  
        findFactors(n); 
  
        // sorts the factors vector  
        Collections.sort(factors); 
  
        // prints out the maximised product.  
        System.out.println(findProduct(n)); 
    } 
} 

