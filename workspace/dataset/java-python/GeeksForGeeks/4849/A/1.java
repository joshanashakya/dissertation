

// Java implementation to find n'th smart number 
import java.util.*; 
import java.lang.*; 
  
class GFG { 
  
    // Limit on result 
    static int MAX = 3000; 
  
    // Function to calculate n'th smart number 
    public static int smartNumber(int n) 
    { 
          
        // Initialize all numbers as not prime 
        Integer[] primes = new Integer[MAX]; 
        Arrays.fill(primes, new Integer(0)); 
  
        // iterate to mark all primes and smart 
        // number 
        Vector<Integer> result = new Vector<>(); 
  
        // Traverse all numbers till maximum 
        // limit 
        for (int i = 2; i < MAX; i++) 
        { 
              
            // 'i' is maked as prime number 
            // because it is not multiple of 
            // any other prime 
            if (primes[i] == 0) 
            { 
                primes[i] = 1; 
  
                // mark all multiples of 'i'  
                // as non prime 
                for (int j = i*2; j < MAX; j = j+i) 
                { 
                    primes[j] -= 1; 
      
                    // If i is the third prime 
                    // factor of j then add it 
                    // to result as it has at 
                    // least three prime factors. 
                    if ( (primes[j] + 3) == 0) 
                        result.add(j); 
                } 
            } 
        } 
  
        // Sort all smart numbers 
        Collections.sort(result); 
  
        // return n'th smart number 
        return result.get(n-1); 
  
    } 
  
    // Driver program to run the case 
    public static void main(String[] args) 
    { 
        int n = 50; 
        System.out.println(smartNumber(n)); 
  
    } 
} 
  
// This code is contributed by Prasad Kshirsagar 

