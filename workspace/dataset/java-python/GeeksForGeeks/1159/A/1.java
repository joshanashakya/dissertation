

// Java implementation of the approach  
  
public class GFG{ 
      
    // Function to check if a character is vowel  
    static boolean isVowel(char c)  
    {  
        c = Character.toLowerCase(c) ; 
        if (c == 'a' || c == 'e' || c == 'i'
            || c == 'o' || c == 'u')  
            return true;  
        return false;  
    }  
      
    // Function to return first X vowels  
    static String firstXvowels(String s, int x)  
    {  
        // String to store first X vowels  
        String result = "";  
        for (int i = 0; i < s.length(); i++) {  
      
            // If s[i] is a vowel then  
            // append it to the result  
            if (isVowel(s.charAt(i)))  
                result += s.charAt(i);  
      
            // If the desired length is reached  
            if (result.length() == x) {  
                return result;  
            }  
        }  
      
        // If total vowels are < X  
        return "-1";  
    }  
      
    // Driver code  
    public static void main(String []args) 
    {  
        String str = "GeeksForGeeks";  
        int x = 3;  
      
        System.out.println(firstXvowels(str, x)) ;  
    }  
    // This code is contributed by Ryuga 
    } 

