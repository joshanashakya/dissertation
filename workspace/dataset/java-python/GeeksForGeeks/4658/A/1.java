

// Java implementation of the above approach  
class GFG  
{ 
      
// Function to reverse the given word except  
// the first and the last character  
static String reverseWord(String str)  
{  
    int len = str.length();  
      
    // Pointer to the second character  
    // of the string  
    int i = 1;  
  
    // Pointer to the second last  
    // character of the string  
    int j = str.length() - 2;  
      
    char[] strchar = str.toCharArray(); 
  
    while (i < j) 
    {  
  
        // Swap str[i] and str[j]  
        char temp = strchar[i];  
        strchar[i] = strchar[j];  
        strchar[j] = temp;  
        i++;  
        j--;  
    }  
      
    str = new String(strchar); 
    return str;  
}  
  
// Function to reverse every word of the  
// sentence except the first and the  
// last character of the words  
static void reverseWords(String str)  
{  
    String[] tok = str.split("\\s");  
  
    // While there are words left  
    for(String w:tok)  
    {  
  
        // Print the reversed word  
        System.out.print(reverseWord(w) + " ");  
    }  
}  
  
// Driver code  
public static void main (String[] args)  
{  
    String str = "geeks for geeks";  
    reverseWords(str);  
}  
} 
      
// This code is contributed by AnkitRai01 

