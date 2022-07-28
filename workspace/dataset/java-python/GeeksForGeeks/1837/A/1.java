

// Java implementation of above approach 
import java.lang.Math; 
import java.util.*; 
  
class GFG 
{ 
    // Function to find an integer X such that 
    // the sum of all the array elements after 
    // getting XORed with X is minimum 
    public static void findX(int[] a, int n) 
    { 
          
        // Finding Maximum element of array 
        Collections.sort(Arrays.asList(a), null); 
        int itr = a[n-1]; 
          
        // Find Maximum number of bits required 
        // in the binary representation 
        // of maximum number 
        // so log2 is calculated 
        int p = (int)(Math.log(itr)/Math.log(2)) + 1; 
  
        // Running loop from p times which is 
        // the number of bits required to represent 
        // all the elements of the array 
        int x = 0; 
        for (int i = 0; i < p; i++) 
        { 
            int count = 0; 
            for (int j = 0; j < n; j++) 
            { 
                  
                // If the bits in same position are set 
                // then count 
                if ((a[j] & (1 << i)) != 0) 
                    count++; 
            } 
  
            // If count becomes greater than half of 
            // size of array then we need to make 
            // that bit '0' by setting X bit to '1' 
            if (count > (n / 2)) 
            { 
                  
                // Again using shift operation to calculate 
                // the required number 
                x += 1 << i; 
            } 
        } 
  
        // Calculate minimized sum 
        long sum = 0; 
        for (int i = 0; i < n; i++) 
            sum += (x ^ a[i]); 
          
        // Print solution 
        System.out.println("X = " + x + ", Sum = " + sum); 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        int[] a = {2, 3, 4, 5, 6}; 
        int n = a.length; 
  
        findX(a, n); 
    } 
  
} 
  
// This code is contributed by 
// sanjeev2552 

