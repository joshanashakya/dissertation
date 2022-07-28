

// Optimized Java program to check if two strings 
// are k anagram or not. 
public class GFG { 
      
    static final int MAX_CHAR = 26; 
       
    // Function to check if str1 and str2 are k-anagram 
    // or not 
    static boolean areKAnagrams(String str1, String str2,  
                                                  int k) 
    { 
        // If both strings are not of equal 
        // length then return false 
        int n = str1.length(); 
        if (str2.length() != n) 
            return false; 
       
        int[] hash_str1 = new int[MAX_CHAR]; 
       
        // Store the occurrence of all characters 
        // in a hash_array 
        for (int i = 0; i < n ; i++) 
            hash_str1[str1.charAt(i)-'a']++; 
       
        // Store the occurrence of all characters 
        // in a hash_array 
        int count = 0; 
        for (int i = 0; i < n ; i++) 
        { 
            if (hash_str1[str2.charAt(i)-'a'] > 0) 
                hash_str1[str2.charAt(i)-'a']--; 
            else
                count++; 
       
            if (count > k) 
                return false; 
        } 
       
        // Return true if count is less than or 
        // equal to k 
        return true; 
    } 
       
    // Driver code 
    public static void main(String args[]) 
    { 
        String str1 = "fodr"; 
        String str2 = "gork"; 
        int k = 2; 
        if (areKAnagrams(str1, str2, k) == true) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
} 
// This code is contributed by Sumit Ghosh 

