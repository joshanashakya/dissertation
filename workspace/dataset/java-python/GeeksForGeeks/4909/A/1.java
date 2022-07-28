

// Java program to find occurrence 
// of character in substring l to r 
import java.util.*; 
  
class GFG 
{ 
  
static int MAX_LEN = 1005; 
static int MAX_CHAR = 26; 
  
// To store count of all character 
static int [][]cnt = new int[MAX_LEN][MAX_CHAR]; 
  
// To pre-procees string from 
// 0 to size of string 
static void preProcess(String s) 
{ 
    int n = s.length(); 
  
    // Store occurrence of 
    // character i 
    for (int i = 0; i < n; i++) 
        cnt[i][s.charAt(i) - 'a']++; 
  
    // Store occurrence o 
    // all character upto i 
    for (int i = 1; i < n; i++) 
    { 
        for (int j = 0; j < 26; j++) 
            cnt[i][j] += cnt[i - 1][j]; 
    } 
} 
  
// To return occurrence of 
// character in range l to r 
static int findCharFreq(int l, int r, char c) 
{ 
    // Return occurrence of character 
    // from 0 to r minus its 
    // occurrence from 0 to l 
    return (cnt[r][(c) - 97] - cnt[l][(c) - 97]); 
} 
  
// Driver Code 
public static void main(String[] args)  
{ 
    String s = "geeksforgeeks"; 
    int Q = 4; 
    preProcess(s); 
  
    System.out.println(findCharFreq(0, 5, 'e')); 
    System.out.println(findCharFreq(2, 6, 'f')); 
    System.out.println(findCharFreq(4, 7, 'm')); 
    System.out.println(findCharFreq(0, 12, 'e')); 
} 
}  
  
// This code is contributed by PrinciRaj1992 

