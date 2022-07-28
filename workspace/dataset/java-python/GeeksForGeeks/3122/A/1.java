

// Java implementation of the approach 
class GFG { 
  
    // Function that returns true if num can be formed 
    // with the digits in digits[] array 
    static boolean canBePicked(int digits[], int num) 
    { 
        // Copy of the digits array 
        int copyDigits[] = digits.clone(); 
        while (num > 0) { 
  
            // Get last digit 
            int digit = num % 10; 
  
            // If digit array doesn't contain current digit 
            if (copyDigits[digit] == 0) 
                return false; 
  
            // One occurrence is used 
            else
                copyDigits[digit]--; 
  
            // Remove the last digit 
            num /= 10; 
        } 
  
        return true; 
    } 
  
    // Function to return the count of required alphabets 
    static int countAlphabets(int n) 
    { 
        int i, count = 0; 
  
        // To store the occurrences of digits (0 - 9) 
        int digits[] = new int[10]; 
        while (n > 0) { 
  
            // Get last digit 
            int digit = n % 10; 
  
            // Update the occurrence of the digit 
            digits[digit]++; 
  
            // Remove the last digit 
            n /= 10; 
        } 
  
        // If any lowercase character can be picked  
        // from the current digits 
        for (i = 'a'; i <= 'z'; i++) 
            if (canBePicked(digits, i)) 
                count++; 
  
        // If any uppercase character can be picked  
        // from the current digits 
        for (i = 'A'; i <= 'Z'; i++) 
            if (canBePicked(digits, i)) 
                count++; 
  
        // Return the required count of alphabets 
        return count; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int n = 1623455078; 
        System.out.println(countAlphabets(n)); 
    } 
} 

