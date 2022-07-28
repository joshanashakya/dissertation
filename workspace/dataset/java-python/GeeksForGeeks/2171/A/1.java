

// Java program to find the count of numbers in a range 
// whose smallest factor is K 
  
public class GFG { 
      
    // Function to check if k is a prime number or not 
    static boolean isPrime(int k) 
    { 
        // Corner case 
        if (k <= 1) 
            return false; 
  
        // Check from 2 to n-1 
        for (int i = 2; i < k; i++) 
            if (k % i == 0) 
                return false; 
  
        return true; 
    } 
  
    // Function to check if a number is not divisible 
    // by any number between 2 and K-1 
    static int check(int num, int k) 
    { 
        int flag = 1; 
  
        // to check if the num is divisible by 
        // any numbers between 2 and k - 1 
        for (int i = 2; i < k; i++) { 
            if (num % i == 0) 
                flag = 0; 
        } 
  
        if (flag == 1) { 
            // if not divisible by any number between 
            // 2 and k - 1 
            // but divisible by k 
            if (num % k == 0) 
                return 1; 
            else
                return 0; 
        } 
        else
            return 0; 
    } 
  
    // Function to find count of numbers in range [a, b] 
    // with smallest factor as K 
    static int findCount(int a, int b, int k) 
    { 
        int count = 0; 
  
        // a number can be divisible only by k and 
        // not by any number less than k only 
        // if k is a prime 
        if (!isPrime(k)) 
            return 0; 
        else { 
            int ans; 
            for (int i = a; i <= b; i++) { 
  
                // to check if a number has 
                // smallest factor as K 
                ans = check(i, k); 
                if (ans == 1) 
                    count++; 
                else
                    continue; 
            } 
        } 
  
        return count; 
    } 
  
  
// Driver code 
public static void main(String args[]) 
    { 
         int a = 2020, b = 6300, k = 29; 
  
            System.out.println(findCount(a, b, k)); 
    
    } 
    // This Code is contributed by ANKITRAI1 
} 

