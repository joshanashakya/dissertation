

// Java implementation of above idea 
import java.util.*; 
  
class GFG  
{ 
  
    static int N = 1000005; 
    static long MAX = (long) 1e18; 
  
    // Vector to store powers greater than 3 
    static Vector<Long> powers = new Vector<>(); 
  
    // Set to store perfect squares 
    static TreeSet<Long> squares = new TreeSet<>(); 
  
    // Set to store powers other than perfect squares 
    static TreeSet<Long> s = new TreeSet<>(); 
  
    static void powersPrecomputation() 
    { 
        for (long i = 2; i < N; i++) 
        { 
  
            // Pushing squares 
            squares.add(i * i); 
  
            // if the values is already a perfect square means 
            // present in the set 
            if (squares.contains(i)) 
                continue; 
  
            long temp = i; 
  
            // Run loop until some power of current number 
            // doesn't exceed MAX 
            while (i * i <= MAX / temp) 
            { 
                temp *= (i * i); 
  
                // Pushing only odd powers as even power of a number 
                // can always be expressed as a perfect square 
                // which is already present in set squares 
                s.add(temp); 
            } 
        } 
  
        // Inserting those sorted 
        // values of set into a vector 
        for (long x : s) 
            powers.add(x); 
    } 
  
    static long calculateAnswer(long L, long R) 
    { 
  
        // Precompute the powers 
        powersPrecomputation(); 
  
        // Calculate perfect squares in 
        // range using sqrtl function 
        long perfectSquares = (long) (Math.floor(Math.sqrt(R)) -  
                                Math.floor(Math.sqrt(L - 1))); 
  
        // Calculate upper value of R 
        // in vector using binary search 
        long high = Collections.binarySearch(powers, R); 
  
        // Calculate lower value of L 
        // in vector using binary search 
        long low = Collections.binarySearch(powers, L); 
  
        // Calculate perfect powers 
        long perfectPowers = perfectSquares + (high - low); 
  
        // Compute final answer 
        long ans = (R - L + 1) - perfectPowers; 
        return ans; 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        long L = 13, R = 20; 
        System.out.println(calculateAnswer(L, R)); 
    } 
} 
  
// This code is contributed by 
// sanjeev2552 

