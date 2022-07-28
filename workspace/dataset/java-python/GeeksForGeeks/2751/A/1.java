

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
  
    static int mod = 3803; 
    static int d = 26; 
  
    static int hash_b; 
    static int[] hash_a; 
    static int[] mul; 
  
    // Function to return the modular inverse 
    // using Fermat's little theorem 
    static int mi(int x)  
    { 
        int p = mod - 2; 
        int s = 1; 
        while (p != 1) 
        { 
            if (p % 2 == 1)  
            { 
                s = (s * x) % mod; 
            } 
            x = (x * x) % mod; 
            p /= 2; 
        } 
  
        return (s * x) % mod; 
    } 
  
    // Function to generate hash 
    static void genHash(char[] a, char[] b) 
    { 
        // To store prefix-sum 
        // of rolling hash 
        hash_a = new int[a.length]; 
  
        // Multiplier for different values of i 
        mul = new int[a.length]; 
  
        // Generating hash value for string b 
        for (int i = b.length - 1; i >= 0; i--)  
        { 
            hash_b = (hash_b * d + (b[i] - 97)) % mod; 
        } 
  
        // Generating prefix-sum of hash of a 
        mul[0] = 1; 
        hash_a[0] = (a[0] - 97) % mod; 
        for (int i = 1; i < a.length; i++) 
        { 
            mul[i] = (mul[i - 1] * d) % mod; 
            hash_a[i] = (hash_a[i - 1] + mul[i] * (a[i] - 97)) % mod; 
        } 
    } 
  
    // Function that returns true if the 
    // required sub-string in a is equal to b 
    static boolean checkEqual(int i, int len_a, int len_b)  
    { 
        // To store hash of required 
        // sub-string of A 
        int x; 
  
        // If i = 0 then 
        // requires hash value 
        if (i == 0)  
        { 
            x = hash_a[len_b - 1]; 
        }  
        // Required hash if i != 0 
        else 
        { 
            x = (hash_a[i + len_b - 1] - hash_a[i - 1] + 2 * mod) % mod; 
            x = (x * mi(mul[i])) % mod; 
        } 
  
        // Comparing hash with hash of B 
        if (x == hash_b)  
        { 
            return true; 
        } 
  
        return false; 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        String a = "abababababa"; 
        String b = "aba"; 
  
        // Generating hash 
        genHash(a.toCharArray(), b.toCharArray()); 
  
        // Queries 
        int queries[] = {0, 1, 2, 3}; 
        int q = queries.length; 
  
        // Perform queries 
        for (int i = 0; i < q; i++)  
        { 
            if (checkEqual(queries[i], a.length(), b.length()))  
            { 
                System.out.println("Yes"); 
            }  
            else
            { 
                System.out.println("No"); 
            } 
        } 
    } 
} 
  
/* This code is contributed by PrinciRaj1992 */

