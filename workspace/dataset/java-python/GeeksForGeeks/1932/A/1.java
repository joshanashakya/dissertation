

// Java program to find the sums for which an array  
// can be divided into subarrays of equal sum.  
import java.util.HashMap; 
import java.util.HashSet; 
  
class GFG { 
  
    // Function to find the sums for which an array 
    // can be divided into subarrays of equal sum 
    public static void getSum(int[] a, int n)  
    { 
        int[] P = new int[n]; 
  
        // Creating prefix sum array 
        P[0] = a[0]; 
        for (int i = 1; i < n; i++) 
            P[i] = a[i] + P[i - 1]; 
  
        // Total Sum 
        int S = P[n - 1]; 
  
        HashMap<Integer, Integer> hash = new HashMap<>(); 
  
        // Setting all the present sum as 1 
        for (int i = 0; i < n; i++) 
            hash.put(P[i], 1); 
  
        // Set to store the subarray sum 
        HashSet<Integer> res = new HashSet<>(); 
  
        // Check the divisors of S 
        for (int i = 1; i * i <= S; i++)  
        { 
            if (S % i == 0) 
            { 
                boolean pres = true; 
  
                int div1 = i, div2 = S / i; 
  
                // Check if all multiples of div1 present or not 
                for (int j = div1; j <= S; j += div1) 
                { 
                    if (hash.get(j) == null || hash.get(j) != 1) 
                    { 
                        pres = false; 
                        break; 
                    } 
                } 
  
                // If all multiples are present 
                if (pres && div1 != S) 
                    res.add(div1); 
  
                pres = true; 
  
                // Check if all multiples of div2 present or not 
                for (int j = S / i; j <= S; j += S / i)  
                { 
                    if (hash.get(j) == null || hash.get(j) != 1) 
                    { 
                        pres = false; 
                        break; 
                    } 
                } 
  
                // If all multiples are present 
                if (pres && div2 != S) 
                    res.add(div2); 
            } 
        } 
  
        // If array cannot be divided into 
        // sub-arrays of equal sum 
        if (res.size() == 0) 
        { 
            System.out.println("-1"); 
            return; 
        } 
  
        // Printing the results 
        for (int i : res) 
            System.out.print(i + " "); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int[] a = { 1, 2, 1, 1, 1, 2, 1, 3 }; 
        int n = a.length; 
        getSum(a, n); 
    } 
} 
  
// This code is contributed by 
// sanjeev2552 

