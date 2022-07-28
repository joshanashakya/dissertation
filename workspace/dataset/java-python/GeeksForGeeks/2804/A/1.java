

// Java program to remove all  
// Vowels in between two  
// consonants from the string 
import java.io.*; 
import java.util.*; 
import java.lang.*; 
  
class GFG 
{ 
      
// Function to check if the  
// character x is a vowel or not 
static boolean isVowel(char x) 
{ 
    if (x == 'a' || x == 'e' ||  
        x == 'i' || x == 'o' ||  
        x == 'u') 
        return true; 
    else
        return false; 
} 
  
// Returns the updated string  
// formed after removing all 
// the Sandwiched Vowels from 
// the given string 
static String updateSandwichedVowels(String a) 
{ 
    int n = a.length(); 
  
    // string to store the Updated  
    // String after removing the 
    // Sandwiched Vowels 
    String updatedString = ""; 
  
    // traverse the string 
    // from left to right 
    for (int i = 0; i < n; i++)  
    { 
  
        // if the current character is  
        // the first or the last character  
        // of the string then, this needs 
        // to be appended to the updatedString,  
        // since the corner alphabet irrespective  
        // of it being a vowel or a consonant,  
        // is never 'Sandwiched' 
        if (i == 0 || i == n - 1)  
        { 
            updatedString += a.charAt(i); 
            continue; 
        } 
          
        // Check if the current character  
        // of the string is a vowel and both  
        // the previous and the next characters 
        // are consonants, if so then this is  
        // a sandwiched vowel, thus is ignored  
        // and not appended to the updated string 
        if (isVowel(a.charAt(i))== true && 
            isVowel(a.charAt(i - 1))== false &&  
            isVowel(a.charAt(i + 1))== false) 
        { 
            continue; 
        } 
  
        // if this character is not  
        // a sandwiched Vowel append 
        // it to the updated String 
        updatedString += a.charAt(i); 
    } 
  
    return updatedString; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
  
    String str = "geeksforgeeks"; 
  
    // Remove all the Sandwitched Vowels 
    String updatedString = updateSandwichedVowels(str); 
  
    System.out.print(updatedString); 
  
} 
} 

