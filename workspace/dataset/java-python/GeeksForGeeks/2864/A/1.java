

// Java program to find counter clockwise 
// shifts to make string palindrome. 
class GFG { 
  
    // Function to check if given string is 
    // palindrome or not. 
    static boolean isPalindrome(String str, int l, int r) 
    { 
        while (l < r) { 
            if (str.charAt(l) != str.charAt(r)) 
                return false; 
  
            l++; 
            r--; 
        } 
        return true; 
    } 
  
    // Function to find counter clockwise shifts 
    // to make string palindrome. 
    static int CyclicShifts(String str) 
    { 
  
        int n = str.length(); 
  
        // Pointer to starting of current 
        // shifted string. 
        int left = 0; 
  
        // Pointer to ending of current 
        // shifted string. 
        int right = n - 1; 
  
        // Concatenate string with itself 
        str = str + str; 
  
        // To store counterclockwise shifts 
        int cnt = 0; 
  
        // Move left and right pointers one 
        // step at a time. 
        while (right < 2 * n - 1) { 
  
            // Check if current shifted string 
            // is palindrome or not 
            if (isPalindrome(str, left, right)) 
                break; 
  
            // If string is not palindrome 
            // then increase count of number 
            // of shifts by 1. 
            cnt++; 
  
            left++; 
            right++; 
        } 
        return cnt; 
    } 
  
    // Driver code. 
    public static void main(String[] args) 
    { 
        String str = "bccbbaab"; 
  
        System.out.println(CyclicShifts(str)); 
    } 
} 
  
// This code is contributed by Rajput-Ji 

