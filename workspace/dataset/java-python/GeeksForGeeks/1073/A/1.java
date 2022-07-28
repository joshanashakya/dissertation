

// Java program to find the sum of all odd length 
// palindromic numbers within the given range 
  
class GFG { 
  
    // Function that returns true if 
    // the given number is a palindrome 
    static boolean isPalindrome(int num) 
    { 
        int reverse_num = 0, remainder, temp; 
  
        /* Here we are generating a new number (reverse_num) 
    * by reversing the digits of original input number 
         */
        temp = num; 
        while (temp != 0) { 
            remainder = temp % 10; 
            reverse_num = reverse_num * 10 + remainder; 
            temp /= 10; 
        } 
  
        /* If the original input number (num) is equal to 
    * to its reverse (reverse_num) then its palindrome 
    * else it is not. 
         */
        if (reverse_num == num) { 
            return true; 
        } 
  
        return false; 
    } 
  
    // Function that returns true if the 
    // given number is of odd length 
    static boolean isOddLength(int num) 
    { 
        int count = 0; 
        while (num > 0) { 
            num /= 10; 
            count++; 
        } 
        if (count % 2 != 0) { 
            return true; 
        } 
        return false; 
    } 
  
    // Function to return the sum of all odd length 
    // palindromic numbers within the given range 
    static long sumOfAllPalindrome(int L, int R) 
    { 
        long sum = 0; 
        if (L <= R) 
            for (int i = L; i <= R; i++) { 
  
                // if number is palindrome and of odd length 
                if (isPalindrome(i) && isOddLength(i)) { 
                    sum += i; 
                } 
            } 
        return sum; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int L = 110, R = 1130; 
        System.out.println(sumOfAllPalindrome(L, R)); 
    } 
} 

