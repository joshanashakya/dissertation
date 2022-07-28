

// Java program to find all the palindromic 
// divisors of a number 
import java.util.*; 
  
class GFG 
{ 
  
// Function to check is num is palindromic 
// or not 
static boolean isPalindrome(int n) 
{ 
    // Convert n to String str 
    String str = String.valueOf(n); 
  
    // Starting and ending index of 
    // String str 
    int s = 0, e = str.length() - 1; 
    while (s < e) { 
  
        // If char at s and e are 
        // not equals then return 
        // false 
        if (str.charAt(s) != str.charAt(e)) { 
            return false; 
        } 
        s++; 
        e--; 
    } 
    return true; 
} 
  
// Function to find palindromic divisors 
static void palindromicDivisors(int n) 
{ 
    // To sore the palindromic divisors of 
    // number n 
    Vector<Integer> PalindromDivisors = new Vector<Integer>(); 
  
    for (int i = 1; i <= Math.sqrt(n); i++) { 
  
        // If n is divisible by i 
        if (n % i == 0) { 
  
            // Check if number is a perfect square 
            if (n / i == i) { 
  
                // Check divisor is palindromic, 
                // then store it 
                if (isPalindrome(i)) { 
                    PalindromDivisors.add(i); 
                } 
            } 
            else { 
  
                // Check if divisors are palindrome 
                if (isPalindrome(i)) { 
                    PalindromDivisors.add(i); 
                } 
  
                // Check if n / divisors is palindromic 
                // or not 
                if (isPalindrome(n / i)) { 
                    PalindromDivisors.add(n / i); 
                } 
            } 
        } 
    } 
  
    // Print all palindromic divisors in sorted order 
    Collections.sort(PalindromDivisors); 
  
    for (int i = 0; i < PalindromDivisors.size(); 
        i++) { 
        System.out.print(PalindromDivisors.get(i)+ " "); 
    } 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int n = 66; 
  
    // Function call to find all palindromic 
    // divisors 
    palindromicDivisors(n); 
} 
} 
  
// This code is contributed by 29AjayKumar 

