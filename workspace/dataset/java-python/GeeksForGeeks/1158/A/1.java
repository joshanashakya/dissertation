

// Java program to check if a string  
// can be converted to other string 
// by replacing vowels and consonants  
class GfG 
{  
  
// Function to check if the character  
// is vowel or not  
static boolean isVowel(char c)  
{  
    if (c == 'a' || c == 'e' || c == 'i' || 
                    c == 'o' || c == 'u')  
        return true;  
  
    return false;  
}  
  
// Function that checks if a string can be  
// converted to another string  
static boolean checkPossibility(String s1, String s2)  
{  
    // Find length of string  
    int l1 = s1.length();  
    int l2 = s2.length();  
  
    // If length is not same  
    if (l1 != l2)  
        return false;  
  
    // Iterate for every character  
    for (int i = 0; i < l1; i++)  
    {  
        // If both vowel  
        if (isVowel(s1.charAt(i)) && 
            isVowel(s2.charAt(i)))  
            continue;  
  
        // Both are consonants  
        else if (!(isVowel(s1.charAt(i))) &&  
                    !(isVowel(s2.charAt(i))))  
            continue;  
        else
            return false;  
    }  
    return true;  
}  
  
// Driver Code  
public static void main(String[] args)  
{  
  
    String S1 = "abcgle"; 
    String S2 = "ezggli";  
    if (checkPossibility(S1, S2) == true)  
        System.out.println("Yes");  
    else
        System.out.println("No");  
} 
}  
  
// This code is contributed by Prerna saini. 

