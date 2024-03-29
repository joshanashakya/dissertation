

// Java Program to rearrange letters of string  
// to find a non-palindromic string if it exists  
class GfG  
{  
  
// Function to print the non-palindromic string  
// if it exists, otherwise prints -1  
static void findNonPalinString(char s[])  
{  
    int freq[] = new int[26]; 
    int flag = 0;  
  
    for (int i = 0; i < s.length; i++)  
    {  
  
        // If all characters are not  
        // same, set flag to 1  
        if (s[i] != s[0])  
            flag = 1;  
  
        // Update frequency of  
        // the current character  
        freq[s[i] - 'a']++;  
    }  
  
    // If all characters are same  
    if (flag == 0)  
        System.out.println("-1");  
    else 
    {  
  
        // Print characters in sorted manner  
        for (int i = 0; i < 26; i++)  
            for (int j = 0; j < freq[i]; j++)  
                System.out.print((char)('a' + i));  
    }  
}  
  
// Driver Code  
public static void main(String[] args)  
{  
    String s = "abba";  
      
    findNonPalinString(s.toCharArray());  
} 
}  
  
// This code is contributed by  
// Prerna Saini. 

