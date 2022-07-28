

// Java program to find integer having maximum number  
// of prime factor in first N natural numbers.  
import java.util.Arrays; 
public class GFG { 
  
// Return smallest number having maximum  
// prime factors.  
    static int maxPrimefactorNum(int N) { 
        int arr[] = new int[N + 5]; 
        Arrays.fill(arr, 0); 
          
        // Sieve of eratosthenes method to count  
        // number of prime factors.  
        for (int i = 2; i * i <= N; i++) { 
            if (arr[i] == 0) { 
                for (int j = 2 * i; j <= N; j += i) { 
                    arr[j]++; 
                } 
            } 
  
            arr[i] = 1; 
        } 
  
        int maxval = 0, maxint = 1; 
  
        // Finding number having maximum number  
        // of prime factor.  
        for (int i = 1; i <= N; i++) { 
            if (arr[i] > maxval) { 
                maxval = arr[i]; 
                maxint = i; 
            } 
        } 
  
        return maxint; 
    } 
// Driver program  
  
    public static void main(String[] args) { 
        int N = 40; 
        System.out.println(maxPrimefactorNum(N)); 
    } 
} 

