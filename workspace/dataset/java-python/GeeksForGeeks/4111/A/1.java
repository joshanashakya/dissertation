

// Java implementation of the approach 
class GFG 
{ 
static int N = 2; 
  
// Function that returns true 
// if ch is a vowel 
static boolean isVowel(char ch) 
{ 
  
    return (ch == 'a' || ch == 'e' ||  
            ch == 'i' || ch == 'o' ||  
            ch == 'u'); 
} 
  
// Function to return the count of vowels 
// in the substring str[l...r] 
static int countVowels(String str,  
                       int l, int r) 
{ 
  
    // To store the count of vowels 
    int cnt = 0; 
  
    // For every character in 
    // the index range [l, r] 
    for (int i = l; i <= r; i++) 
    { 
  
        // If the current character 
        // is a vowel 
        if (isVowel(str.charAt(i))) 
            cnt++; 
    } 
    return cnt; 
} 
  
static void performQueries(String str,  
                           int queries[][],  
                           int q) 
{ 
  
    // For every query 
    for (int i = 0; i < q; i++)  
    { 
  
        // Find the count of vowels 
        // for the current query 
        System.out.println(countVowels(str, queries[i][0], 
                                            queries[i][1])); 
    } 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    String str = "geeksforgeeks"; 
    int queries[][] = { { 1, 3 }, { 2, 4 },  
                                  { 1, 9 } }; 
    int q = queries.length; 
  
    performQueries(str, queries, q); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

