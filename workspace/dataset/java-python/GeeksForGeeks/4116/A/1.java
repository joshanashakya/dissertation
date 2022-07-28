

// Java implementation of the above approach  
class GFG  
{ 
    static int MAX = 26;  
      
    // Function that returns true if both  
    // the strings can be made equal  
    // with the given operation  
    static boolean canBeMadeEqual(String str1, 
                                  String str2)  
    {  
        int len1 = str1.length();  
        int len2 = str2.length();  
      
        // Lengths of both the strings  
        // have to be equal  
        if (len1 == len2)  
        {  
      
            // To store the frequency of the  
            // characters of str1  
            int freq[] = new int[MAX];  
              
            for (int i = 0; i < len1; i++)  
            {  
                freq[str1.charAt(i) - 'a']++;  
            }  
      
            // For every character of str2  
            for (int i = 0; i < len2; i++) 
            {  
      
                // If current character of str2  
                // also appears in str1  
                if (freq[str2.charAt(i) - 'a'] > 0)  
                    return true;  
            }  
        }  
        return false;  
    }  
      
    // Driver code  
    public static void main (String[] args)  
    {  
        String str1 = "abc", str2 = "defa";  
      
        if (canBeMadeEqual(str1, str2))  
            System.out.println("Yes");  
        else
            System.out.println("No");  
    }  
} 
  
// This code is contributed by AnkitRai01 

