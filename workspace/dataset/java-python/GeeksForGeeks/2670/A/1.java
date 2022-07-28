

// Java program to find longest 
// possible subsequence anagram 
// of N strings. 
class GFG 
{  
final int MAX_CHAR = 26; 
  
// function to store frequency  
// of each character in each  
// string 
static void frequency(int fre[][], 
                      String s[], int n) 
{ 
    for (int i = 0; i < n; i++)  
    { 
        String str = s[i]; 
        for (int j = 0; 
                 j < str.length(); j++)  
            fre[i][str.charAt(j) - 'a']++;      
    } 
} 
  
// function to Find longest  
// possible sequence of N 
// strings which is anagram  
// to each other 
static void LongestSequence(int fre[][],  
                            int n) 
{ 
    // to get lexicographical  
    // largest sequence. 
    for (int i = 24; i >= 0; i--) 
    { 
  
        // find minimum of 
        // that character 
        int mi = fre[0][i]; 
        for (int j = 1; j < n; j++)  
            mi = Math.min(fre[j][i], mi);      
  
        // print that character 
        // minimum number of times 
        while (mi--!=0)  
            System.out.print((char)('a' + i));      
    } 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
  
    String s[] = { "loo", "lol", "olive" }; 
    int n = s.length; 
  
    // to strore frequency of each 
    // character in each string 
    int fre[][] = new int[n][26] ; 
  
    // to get frequency  
    // of each character 
    frequency(fre, s, n); 
  
    // function call 
    LongestSequence(fre, n); 
} 
} 
  
// This code is contributed 
// by Arnab Kundu 

