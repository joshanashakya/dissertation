

// Java implementation of the approach 
class GFG 
{ 
static final int N = 2; 
  
// Function that returns true 
// if ch is a vowel 
static Boolean isVowel(char ch) 
{ 
  
    return (ch == 'a' || ch == 'e' ||  
            ch == 'i' || ch == 'o' || 
            ch == 'u'); 
} 
  
static void performQueries(String str, int len, 
                      int queries[][], int q) 
{ 
  
    // pre[i] will store the count of 
    // vowels in the subString str[0...i] 
    int []pre = new int[len]; 
  
    if (isVowel(str.charAt(0))) 
        pre[0] = 1; 
    else
        pre[0] = 0; 
  
    // Fill the pre[] array 
    for (int i = 1; i < len; i++)  
    { 
  
        // If current character is a vowel 
        if (isVowel(str.charAt(i))) 
            pre[i] = 1 + pre[i - 1]; 
  
        // If its a consonant 
        else
            pre[i] = pre[i - 1]; 
    } 
  
    // For every query 
    for (int i = 0; i < q; i++)  
    { 
  
        // Find the count of vowels 
        // for the current query 
        if (queries[i][0] == 0)  
        { 
            System.out.println(pre[queries[i][1]]); 
        } 
        else 
        { 
            System.out.println((pre[queries[i][1]] -  
                                pre[queries[i][0] - 1])); 
        } 
    } 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    String str = "geeksforgeeks"; 
    int len = str.length(); 
    int queries[][] = { { 1, 3 },  
                        { 2, 4 }, { 1, 9 } }; 
    int q = queries.length; 
  
    performQueries(str, len, queries, q); 
} 
} 
  
// This code is contributed by Rajput-Ji 

