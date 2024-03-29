

// Java implementation to check that 
// a String contains all vowels 
  
class GFG 
{ 
  
// Function to to check that 
// a String contains all vowels 
static int checkIfAllVowels(String str) 
{ 
  
    // Hash Array of size 5 
    // such that the index 0, 1, 2, 3 and 4 
    // represent the vowels a, e, i, o and u 
    int []hash = new int[5]; 
  
    // Loop the String to mark the vowels 
    // which are present 
    for (int i = 0; i < str.length(); i++) 
    { 
  
        if (str.charAt(i) == 'A' || str.charAt(i) == 'a') 
            hash[0] = 1; 
  
        else if (str.charAt(i) == 'E' || str.charAt(i) == 'e') 
            hash[1] = 1; 
  
        else if (str.charAt(i) == 'I' || str.charAt(i) == 'i') 
            hash[2] = 1; 
  
        else if (str.charAt(i) == 'O' || str.charAt(i) == 'o') 
            hash[3] = 1; 
  
        else if (str.charAt(i) == 'U' || str.charAt(i) == 'u') 
            hash[4] = 1; 
    } 
  
    // Loop to check if there is any vowel 
    // which is not present in the String 
    for (int i = 0; i < 5; i++) 
    { 
        if (hash[i] == 0) 
        { 
            return 1; 
        } 
    } 
return 0; 
} 
  
// Function to to check that 
// a String contains all vowels 
static void checkIfAllVowelsArePresent(String str) 
{ 
  
    if (checkIfAllVowels(str) == 1) 
        System.out.print("Not Accepted\n"); 
    else
        System.out.print("Accepted\n"); 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    String str = "aeioubc"; 
    checkIfAllVowelsArePresent(str); 
} 
} 
  
// This code is contributed by 29AjayKumar 

