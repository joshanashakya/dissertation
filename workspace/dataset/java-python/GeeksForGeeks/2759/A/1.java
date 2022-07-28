

// Java implmentation to find the longest 
// palindromic String formed using 
// concatenation of given Strings in any order 
class GFG 
{ 
  
// Function to find the longest palindromic 
// from given array of Strings 
static void longestPalindrome(String a[], 
                            int n) 
{ 
    String []pair1 = new String[n]; 
    String []pair2 = new String[n]; 
    int r = 0; 
  
    // Loop to find the pair of Strings 
    // which are reverse of each other 
    for (int i = 0; i < n; i++) 
    { 
        String s = a[i]; 
        s = reverse(s); 
        for (int j = i + 1; j < n; j++)  
        { 
            if (a[i] != "" && a[j] != "") 
            { 
                if (s.equals(a[j]))  
                { 
                    pair1[r] = a[i]; 
                    pair2[r++] = a[j]; 
                    a[i] = ""; 
                    a[j] = ""; 
                    break; 
                } 
            } 
        } 
    } 
    String s1 = ""; 
  
    // Loop to find if any palindromic 
    // String is still left in the array 
    for (int i = 0; i < n; i++)  
    { 
        String s = a[i]; 
        a[i] = reverse(a[i]); 
        if (a[i] != "")  
        { 
            if (a[i].equals(s)) 
            { 
                s1 = a[i]; 
                break; 
            } 
        } 
    } 
    String ans = ""; 
  
    // Update the answer with 
    // all Strings of pair1 
    for (int i = 0; i < r; i++) 
    { 
        ans = ans + pair1[i]; 
    } 
      
    // Update the answer with 
    // palindromic String s1 
    if (s1 != "") 
    { 
        ans = ans + s1; 
    } 
    // Update the answer with 
    // all Strings of pair2 
    for (int j = r - 1; j >= 0; j--)  
    { 
        ans = ans + pair2[j]; 
    } 
    System.out.print(ans +"\n"); 
} 
static String reverse(String input)  
{ 
    char[] a = input.toCharArray(); 
    int l, r = a.length - 1; 
    for (l = 0; l < r; l++, r--) 
    { 
        char temp = a[l]; 
        a[l] = a[r]; 
        a[r] = temp; 
    } 
    return String.valueOf(a); 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    String []a1 = { "aba", "aba" }; 
    int n1 = a1.length; 
    longestPalindrome(a1, n1); 
  
    String []a2 = { "abc", "dba", "kop", 
                    "abd", "cba" }; 
    int n2 = a2.length; 
    longestPalindrome(a2, n2); 
} 
} 
  
// This code is contributed by Rajput-Ji 

