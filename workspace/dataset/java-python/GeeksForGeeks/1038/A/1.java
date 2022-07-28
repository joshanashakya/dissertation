

// Java program to count distinct 
// prime factors of a number. 
import java.util.*; 
  
class GFG { 
  
    // Function to count the number 
    // of distinct prime factors of 
    // product of array 
    static int Distinct_Prime_factors(Vector<Integer> a) 
    { 
        // use set to store distinct factors 
        HashSet<Integer> m = new HashSet<Integer>(); 
  
        // iterate over every element of array 
        for (int i = 0; i < a.size(); i++) { 
            int sq = (int)Math.sqrt(a.get(i)); 
  
            // from 2 to square root of number 
            // run a loop and check the numbers 
            // which are factors. 
            for (int j = 2; j <= sq; j++) { 
                if (a.get(i) % j == 0) { 
  
                    // if j is a factor store 
                    // it in the set 
                    m.add(j); 
  
                    // divide the number with j 
                    // till it is divisible so 
                    // that only prime factors 
                    // are stored 
                    while (a.get(i) % j == 0) { 
                        a.set(i, a.get(i) / j); 
                    } 
                } 
            } 
  
            // if the number is still greater 
            // than 1 then it is a prime factor, 
            // insert in set 
            if (a.get(i) > 1) { 
                m.add(a.get(i)); 
            } 
        } 
  
        // the number of unique prime 
        // factors will the size of the set 
        return m.size(); 
    } 
  
    // Driver Code 
    public static void main(String args[]) 
    { 
        Vector<Integer> a = new Vector<Integer>(); 
        a.add(1); 
        a.add(2); 
        a.add(3); 
        a.add(4); 
        a.add(5); 
        System.out.println(Distinct_Prime_factors(a)); 
    } 
} 
  
// This code is contributed by Arnab Kundu 

