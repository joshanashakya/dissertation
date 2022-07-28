

// Java program which counts  
// different palindromic  
// characteristics of a string.          
import java.io.*; 
  
class GFG 
{ 
    static int MAX_STR_LEN = 1000; 
      
    static boolean P[][] =  
           new boolean[MAX_STR_LEN][MAX_STR_LEN]; 
    static int []Kpal =  
           new int[MAX_STR_LEN]; 
      
    // function which checks  
    // whether a substring  
    // str[i..j] of a given  
    // string is a palindrome or not. 
    static void checkSubStrPal(String str,  
                               int n) 
    { 
      
        // P[i,j] = true if substring  
        // str [i..j] is palindrome,  
        // else false 
        for (int i = 0; i < MAX_STR_LEN; i++)  
        { 
            for (int j = 0; j < MAX_STR_LEN; j++) 
                P[i][j] = false; 
            Kpal[i] = 0; 
        } 
          
        // palindrome of  
        // single length 
        for (int i = 0; i < n; i++) 
            P[i][i] = true; 
      
        // palindrome of  
        // length 2 
        for (int i = 0; i < n - 1; i++) 
            if (str.charAt(i) == str.charAt(i + 1)) 
                P[i][i + 1] = true; 
      
        // Palindromes of length  
        // more then 2. This loop  
        // is similar to Matrix  
        // Chain Multiplication.  
        // We start with a gap of  
        // length 2 and fill P table  
        // in a way that gap between  
        // starting and ending indexes 
        // increases one by one by  
        // outer loop. 
        for (int gap = 2; gap < n; gap++) 
        { 
      
            // Pick starting point 
            // for current gap 
            for (int i = 0; i < n - gap; i++) 
            { 
      
                // Set ending point 
                int j = gap + i; 
      
                // If current string 
                // is palindrome 
                if (str.charAt(i) == str.charAt(j) &&  
                                     P[i + 1][j - 1]) 
                    P[i][j] = true; 
            } 
        } 
    } 
      
    // A function which recursively 
    // counts if a string str [i..j] is 
    // a k-palindromic string or not. 
    static void countKPalindromes(int i, int j,  
                                  int k) 
    { 
        // terminating condition  
        // for a string which is 
        // a k-palindrome. 
        if (i == j) 
        { 
            Kpal[k]++; 
            return; 
        } 
      
        // terminating condition for  
        // a string which is not a  
        // k-palindrome. 
        if (P[i][j] == false) 
            return; 
      
        // increases the counter  
        // for the string if it  
        // is a k-palindrome. 
        Kpal[k]++; 
      
        // mid is middle pointer of 
        // the string str [i...j]. 
        int mid = (i + j) / 2; 
      
        // if length of string which  
        // is (j - i + 1) is odd than 
        // we have to subtract one  
        // from mid else if even then  
        // no change. 
        if ((j - i + 1) % 2 == 1) 
            mid--; 
      
        // if the string is k-palindrome 
        // then we check if it is a 
        // (k+1) - palindrome or not  
        // by just sending any of one  
        // half of the string to the  
        // Count_k_Palindrome function. 
        countKPalindromes(i, mid, k + 1); 
    } 
      
    static void printKPalindromes(String s) 
    { 
        // Finding all palindromic 
        // substrings of given string 
        int n = s.length(); 
        checkSubStrPal(s, n); 
      
        // counting k-palindromes for  
        // each and every substring  
        // of given string. . 
        for (int i = 0; i < n; i++) 
            for (int j = 0; j < n - i; j++) 
                countKPalindromes(j, j + i, 1); 
      
        // Output the number of  
        // K-palindromic substrings 
        // of a given string. 
        for (int i = 1; i <= n; i++) 
            System.out.print(Kpal[i] + " "); 
        System.out.println(); 
    } 
      
    // Driver code 
    public static void main(String args[]) 
    { 
        String s = "abacaba"; 
        printKPalindromes(s); 
    } 
} 
  
// This code is contributd by 
// Manish Shaw(manishshaw1) 

