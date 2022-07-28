

// Java implementation of the approach 
class GFG 
{ 
  
// Function that returns true 
// if character ch is a vowel 
static boolean isVowel(char ch) 
{ 
    switch (ch)  
    { 
        case 'a': 
        case 'e': 
        case 'i': 
        case 'o': 
        case 'u': 
            return true; 
    } 
    return false; 
} 
  
// Compares two integers according 
// to their digit sum 
static boolean isSatisfied(char[] str, int n) 
{ 
  
    // Check if there are two 
    // consecutive consonants 
    for (int i = 1; i < n; i++) 
    { 
        if (!isVowel(str[i]) && 
            !isVowel(str[i - 1])) 
        { 
            return false; 
        } 
    } 
  
    // Check if there is any vowel 
    // surrounded by two consonants 
    for (int i = 1; i < n - 1; i++) 
    { 
        if (isVowel(str[i]) &&  
            !isVowel(str[i - 1]) &&  
            !isVowel(str[i + 1]))  
        { 
            return false; 
        } 
    } 
    return true; 
} 
  
// Driver code 
public static void main(String []args)  
{ 
    String str = "acaba"; 
    int n = str.length(); 
  
    if (isSatisfied(str.toCharArray(), n)) 
        System.out.println("Yes"); 
    else
        System.out.println("No"); 
} 
} 
  
// This code is contributed by Rajput-Ji 

