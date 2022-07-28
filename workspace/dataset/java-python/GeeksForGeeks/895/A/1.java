

// Java implementation of the approach  
  
public class GFG{ 
  
    // Function to return the count of the  
    // divisors of a number  
    static int countDivisors(int n)  
    {  
        // Count the number of  
        // 2s that divide n  
        int x = 0, ans = 1;  
        while (n % 2 == 0) {  
            x++;  
            n = n / 2;  
        }  
        ans = ans * (x + 1);  
      
        // n must be odd at this point.  
        // So we can skip one element  
        for (int i = 3; i <= Math.sqrt(n); i = i + 2) {  
      
            // While i divides n  
            x = 0;  
            while (n % i == 0) {  
                x++;  
                n = n / i;  
            }  
            ans = ans * (x + 1);  
        }  
      
        // This condition is to  
        // handle the case when  
        // n is a prime number > 2  
        if (n > 2)  
            ans = ans * 2;  
      
        return ans;  
    }  
      
    static int getTotalCount(int n, int k)  
    {  
        int k_count = countDivisors(k);  
      
        // Count the total elements  
        // that have divisors exactly equal  
        // to as that of k's  
        int count = 0;  
        for (int i = 1; i < n; i++)  
            if (k_count == countDivisors(i))  
                count++;  
      
        // Exclude k from the result if it  
        // is smaller than n.  
        if (k < n)  
        count = count - 1;  
      
        return count;  
    }  
      
    // Driver code 
     public static void main(String []args) 
    {  
        int n = 500, k = 6;  
        System.out.println(getTotalCount(n, k));  
    }  
    // This code is contributed by Ryuga 
} 

