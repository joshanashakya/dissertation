

// Java implementation of the approach 
class GFG { 
  
    // Function that returns true if str is a palindrome 
    static boolean isPalindrome(String str) 
    { 
        int len = str.length(); 
        for (int i = 0; i < len / 2; i++) { 
            if (str.charAt(i) != str.charAt(len - 1 - i)) 
                return false; 
        } 
  
        return true; 
    } 
  
    // Function that returns true if the  
    // generated string is a palindrome 
    static boolean createStringAndCheckPalindrome(int N) 
    { 
  
        // sub contains N as a string 
        String sub = "" + N, res_str = ""; 
  
        int sum = 0; 
  
        // Calculate the sum of the digits 
        while (N > 0) { 
            int digit = N % 10; 
            sum += digit; 
            N = N / 10; 
        } 
  
        // Repeat the substring until the length 
        // of the resultant string < sum 
        while (res_str.length() < sum) 
            res_str += sub; 
  
        // If length of the resultant string exceeded sum 
        // then take substring from 0 to sum - 1 
        if (res_str.length() > sum) 
            res_str = res_str.substring(0, sum); 
  
        // If the generated string is a palindrome 
        if (isPalindrome(res_str)) 
            return true; 
  
        return false; 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int N = 10101; 
        if (createStringAndCheckPalindrome(N)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
} 

