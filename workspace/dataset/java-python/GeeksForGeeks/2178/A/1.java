

// Java program to find maximum differences between  
// two prime numbers in given ranges  
  
public class GFG { 
  
    final static int MAX = 100005; 
  
// Precompute Sieve, Prefix array, Suffix array  
    static void precompute(int prefix[], int suffix[]) { 
        boolean prime[] = new boolean[MAX]; 
        for (int i = 0; i < MAX; i++) { 
            prime[i] = true; 
        } 
  
        // Sieve of Eratosthenes  
        for (int i = 2; i * i < MAX; i++) { 
            if (prime[i]) { 
                for (int j = i + i; j < MAX; j += i) { 
                    prime[j] = false; 
                } 
            } 
        } 
  
        prefix[1] = 1; 
        suffix[MAX - 1] = (int) 1e9 + 7; 
  
        // Precomputing Prefix array.  
        for (int i = 2; i < MAX; i++) { 
            if (prime[i]) { 
                prefix[i] = i; 
            } else { 
                prefix[i] = prefix[i - 1]; 
            } 
        } 
  
        // Precompute Suffix array.  
        for (int i = MAX - 2; i > 1; i--) { 
            if (prime[i]) { 
                suffix[i] = i; 
            } else { 
                suffix[i] = suffix[i + 1]; 
            } 
        } 
    } 
  
// Function to solve each query  
    static int query(int prefix[], int suffix[], int L, 
            int R) { 
        if (prefix[R] < L || suffix[L] > R) { 
            return 0; 
        } else { 
            return prefix[R] - suffix[L]; 
        } 
    } 
  
// Driven Program  
    public static void main(String[] args) { 
        int q = 3; 
        int L[] = {2, 2, 24}; 
        int R[] = {5, 2, 28}; 
  
        int prefix[] = new int[MAX], suffix[] = new int[MAX]; 
        precompute(prefix, suffix); 
  
        for (int i = 0; i < q; i++) { 
            System.out.println(query(prefix, suffix, L[i], R[i])); 
        } 
  
    } 
} 
/*This code is contributed by Rajput-Ji*/

