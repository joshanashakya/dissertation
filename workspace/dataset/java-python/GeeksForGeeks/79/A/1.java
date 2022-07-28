

// Java program to check if number n is expressed 
// as sum of two abundant numbers 
import java.util.*; 
class GFG { 
  
    static final int N = 100005; 
  
// Function to return all abundant numbers 
// This function will be helpful for 
// multiple queries 
    static Set<Integer> ABUNDANT() { 
        // To store abundant numbers 
        Set<Integer> v = new HashSet<>(); 
  
        for (int i = 1; i < N; i++) { 
  
            // to store sum of the divisors 
            // include 1 in the sum 
            int sum = 1; 
            for (int j = 2; j * j <= i; j++) { 
  
                // if j is proper divisor 
                if (i % j == 0) { 
                    sum += j; 
  
                    // if i is not a perfect square 
                    if (i / j != j) { 
                        sum += i / j; 
                    } 
                } 
            } 
  
            // if sum is greater than i then i is 
            // a abundant number 
            if (sum > i) { 
                v.add(i); 
            } 
        } 
  
        return v; 
    } 
  
// Check if number n is expressed 
// as sum of two abundant numbers 
    static void SumOfAbundant(int n) { 
        Set<Integer> v = ABUNDANT(); 
  
        for (int i = 1; i <= n; i++) { 
  
            // if both i and n-i are 
            // abundant numbers 
            if (v.contains(i) & v.contains(n - i)) { 
                System.out.print(i + " " + (n - i)); 
                return; 
            } 
        } 
  
        // can not be expressed 
        System.out.print(-1); 
    } 
  
// Driver code 
    public static void main(String[] args) { 
        int n = 24; 
        SumOfAbundant(n); 
    } 
} 
// This code is contributed by 29AjayKumar 

