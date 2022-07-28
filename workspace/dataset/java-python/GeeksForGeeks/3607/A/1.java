

// Java implementation of the above approach 
  
public class GFG{ 
  
    // Function to check if any permutation 
    // of a number is divisible by 3 
    // and is Palindromic 
    static boolean isDivisiblePalindrome(int n) 
    { 
        // Hash array to store frequency 
        // of digits of n 
        int hash[] = new int[10]; 
      
        int digitSum = 0; 
      
        // traverse the digits of integer 
        // and store their frequency 
        while (n != 0) { 
      
            // Calculate the sum of 
            // digits simultaneously 
            digitSum += n % 10; 
            hash[n % 10]++; 
            n /= 10; 
        } 
      
        // Check if number is not 
        // divisible by 3 
        if (digitSum % 3 != 0) 
            return false; 
      
        int oddCount = 0; 
        for (int i = 0; i < 10; i++) { 
            if (hash[i] % 2 != 0) 
                oddCount++; 
        } 
      
        // If more than one digits have odd frequency, 
        // palindromic permutation not possible 
        if (oddCount > 1) 
            return false; 
        else
            return true; 
    } 
  
    // Driver Code 
    public static void main(String []args){ 
              
    int n = 34734; 
  
     System.out.print(isDivisiblePalindrome(n)) ; 
    } 
    // This code is contributed by ANKITRAI1 
} 

