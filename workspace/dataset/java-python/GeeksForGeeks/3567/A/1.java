

// Java implementation of above approach 
import java.util.Vector; 
  
class GFG  
{ 
  
    // Function to find powers of 2, 3 and 7 in x  
    static Vector<Integer> Divisors(int x) 
    { 
        // To keep count of each divisor  
        int c = 0; 
  
        // To store the result  
        Vector<Integer> v = new Vector<Integer>(); 
  
        // Count powers of 2 in x  
        while (x % 2 == 0)  
        { 
            c++; 
            x /= 2; 
        } 
        v.add(c); 
  
        c = 0; 
  
        // Count powers of 3 in x  
        while (x % 3 == 0)  
        { 
            c++; 
            x /= 3; 
        } 
        v.add(c); 
  
        c = 0; 
  
        // Count powers of 7 in x  
        while (x % 7 == 0) 
        { 
            c++; 
            x /= 7; 
        } 
        v.add(c); 
  
        // Reamining number which is not  
        // divisible by 2, 3 or 7  
        v.add(x); 
  
        return v; 
    } 
  
    // Function to return the minimum number of  
    // given operations required to make a and b equal  
    static int MinOperations(int a, int b) 
    { 
        // a = x * 2^a1 * 3^a2 * 7^a3  
        // va[0] = a1  
        // va[1] = a2  
        // va[2] = a3  
        // va[3] = x  
        Vector<Integer> va = Divisors(a); 
  
        // Similarly for b  
        Vector<Integer> vb = Divisors(b); 
  
        // If a and b cannot be made equal  
        // with the given operation. Note  
        // that va[3] and vb[3] contain  
        // remaining numbers after repeated  
        // divisions with 2, 3 and 7.  
        // If remaining numbers are not same  
        // then we cannot make them equal.  
        if (va.get(3) != vb.get(3))  
        { 
            return -1; 
        } 
  
        // Minimum number of operations required  
        int minOperations = Math.abs(va.get(0) - vb.get(0)) 
                + Math.abs(va.get(1) - vb.get(1)) 
                + Math.abs(va.get(2) - vb.get(2)); 
  
        return minOperations; 
    } 
  
    // Driver code  
    public static void main(String[] args)  
    { 
        int a = 14, b = 28; 
        System.out.println(MinOperations(a, b)); 
    } 
}  
  
// This code is contributed by Rajput-JI 

