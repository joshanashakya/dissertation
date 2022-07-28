

// Java implementation of the above approach. 
class GFG  
{ 
  
    // Function that returns true if some character  
    // exists in the given string whose frequency  
    // is equal to the sum frequencies of  
    // other characters of the string  
    static boolean isFrequencyEqual(String str, int len) 
    { 
  
        // If string is of odd length  
        if (len % 2 == 1)  
        { 
            return false; 
        } 
  
        // To store the frequency of each  
        // character of the string  
        int i, freq[] = new int[26]; 
  
        // Update the frequencies of the characters  
        for (i = 0; i < len; i++)  
        { 
            freq[str.charAt(i) - 'a']++; 
        } 
  
        for (i = 0; i < 26; i++) 
        { 
            if (freq[i] == len / 2)  
            { 
                return true; 
            } 
        } 
  
        // No such character exists  
        return false; 
    } 
  
    // Driver code  
    public static void main(String[] args)  
    { 
        String str = "geeksforgeeks"; 
        int len = str.length(); 
        if (isFrequencyEqual(str, len))  
        { 
            System.out.println("Yes"); 
        }  
        else 
        { 
            System.out.println("No"); 
        } 
    } 
} 
  
// This code contributed by Rajput-Ji 

