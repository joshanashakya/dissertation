

// Java implementation of the approach  
import java.util.Arrays; 
  
class GfG 
{ 
  
    // Function that returns true if  
    // sub-string starting at i and  
    // ending at j in str is a palindrome  
    static boolean isPalindrome(String str, int i, int j)  
    {  
        while (i < j)  
        {  
            if (str.charAt(i) != str.charAt(j))  
                return false;  
            i++;  
            j--;  
        }  
      
        return true;  
    }  
      
    // Function to count all palindromic substring  
    // whose lwngth is a prime number  
    static int countPrimePalindrome(String str, int len)  
    {  
      
        boolean[] prime = new boolean[len + 1];  
        Arrays.fill(prime, true);  
      
        // 0 and 1 are non-primes  
        prime[0] = prime[1] = false;  
        for (int p = 2; p * p <= len; p++)  
        {  
      
            // If prime[p] is not changed, 
            // then it is a prime  
            if (prime[p]) 
            {  
      
                // Update all multiples of p greater than or  
                // equal to the square of it  
                // numbers which are multiple of p and are  
                // less than p^2 are already been marked.  
                for (int i = p * p; i <= len; i += p)  
                    prime[i] = false;  
            }  
        }  
      
        // To store the required number of sub-strings  
        int count = 0;  
      
        // Starting from the smallest prime till  
        // the largest length of the sub-string possible  
        for (int j = 2; j <= len; j++)  
        {  
      
            // If j is prime  
            if (prime[j])  
            {  
      
                // Check all the sub-strings of length j  
                for (int i = 0; i + j - 1 < len; i++)  
                {  
      
                    // If current sub-string is a palindrome  
                    if (isPalindrome(str, i, i + j - 1))  
                        count++;  
                }  
            }  
        }  
        return count;  
    }  
      
    // Driver code 
    public static void main(String []args) 
    { 
        String s = "geeksforgeeks";  
        int len = s.length();  
  
        System.out.println(countPrimePalindrome(s, len)); 
    } 
} 
  
// This code is contributed by Rituraj Jain 

