

// Java program to find the sum of prime 
// factors of all numbers in range [L-R] 
public class gfg { 
  
    static int N = 10000; 
    static long arr[] = new long[N]; 
  
    // function to compute the seive 
    static void seive() 
    { 
        for (int i = 2; i * i < N; i++) { 
  
            // i is prime 
            if (arr[i] == 0) { 
  
                // add i to all the multiples of i till N 
                for (int j = 2; i * j < N; j++) { 
                    arr[i * j] += i; 
                } 
            } 
        } 
    } 
  
    // function that returns the sum 
    static long sum(int l, int r) 
    { 
  
        // Function call to compute seive 
        seive(); 
  
        // prefix array to keep the sum of all arr[i] till i 
        long[] pref_arr = new long[r + 1]; 
        pref_arr[0] = arr[0]; 
  
        // calculate the prefix sum of prime divisors 
        for (int i = 1; i <= r; i++) { 
            pref_arr[i] = pref_arr[i - 1] + arr[i]; 
        } 
  
        // lower is the beginning of array 
        if (l == 1) 
            return (pref_arr[r]); 
  
        // lower is not the beginning of the array 
        else
            return (pref_arr[r] - pref_arr[l - 1]); 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        int l = 5, r = 10; 
        System.out.println(sum(l, r)); 
    } 
} 

