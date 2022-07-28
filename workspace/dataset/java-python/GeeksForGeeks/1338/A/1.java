

// Java program to find integer having maximum number  
// of prime factor in first N natural numbers  
import java.util.Vector; 
  
public class GFG { 
  
// Return smallest number having maximum prime factors. 
    static int maxPrimefactorNum(int N) { 
        //default value of boolean is false 
        boolean arr[] = new boolean[N + 5]; 
  
        // Sieve of eratosthenes  
        for (int i = 3; i * i <= N; i += 2) { 
            if (!arr[i]) { 
                for (int j = i * i; j <= N; j += i) { 
                    arr[j] = true; 
                } 
            } 
        } 
  
        // Storing prime numbers.  
        Vector<Integer> prime = new Vector<>();  
        prime.add(prime.size(), 2); 
        for (int i = 3; i <= N; i += 2) { 
            if (!arr[i]) { 
                prime.add(prime.size(), i); 
            } 
        } 
  
        // Generating number having maximum prime factors.  
        int i = 0, ans = 1; 
        while (ans * prime.get(i) <= N && i < prime.size()) { 
            ans *= prime.get(i); 
            i++; 
        } 
  
        return ans; 
    } 
// Driver program  
  
    public static void main(String[] args) { 
        int N = 40; 
        System.out.println(maxPrimefactorNum(N)); 
    } 
} 

