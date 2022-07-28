

// Java program to check which string 
// makes palindrome first. 
public class First_Palin { 
  
    static final int MAX_CHAR = 26; 
  
    // returns winner of two strings 
    static char stringPalindrome(String A, String B) 
    { 
        // Count frequencies of characters in 
        // both given strings 
        int[] countA = new int[MAX_CHAR]; 
        int[] countB = new int[MAX_CHAR]; 
  
        int l1 = A.length(); 
        int l2 = B.length(); 
          
        for (int i = 0; i < l1; i++) 
            countA[A.charAt(i) - 'a']++; 
          
        for (int i = 0; i < l2; i++) 
            countB[B.charAt(i) - 'a']++; 
  
        // Check if there is a character that 
        // appears more than once in A and does 
        // not appear in B 
        for (int i = 0; i < 26; i++) 
            if ((countA[i] > 1 && countB[i] == 0)) 
                return 'A'; 
  
        return 'B'; 
    } 
  
    // Driver Code 
public static void main(String args[]) 
    { 
        String a = "abcdea"; 
        String b = "bcdesg"; 
        System.out.println(stringPalindrome(a, b)); 
    } 
} 
// This code is contributed by Sumit Ghosh 

