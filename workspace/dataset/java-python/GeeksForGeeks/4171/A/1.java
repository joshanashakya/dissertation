

// Java implementation of the approach  
class GFG 
{ 
  
    static int MAX = 26; 
  
    // Function that returns true if the mapping is possible 
    public static boolean canBeMapped(String s1, int l1,  
                                        String s2, int l2)  
    { 
          
        // Both the strings are of un-equal lengths 
        if (l1 != l2) 
            return false; 
  
        // To store the frequencies of the 
        // characters in both the string 
        int[] freq1 = new int[MAX]; 
        int[] freq2 = new int[MAX]; 
  
        // Update frequencies of the characters 
        for (int i = 0; i < l1; i++) 
            freq1[s1.charAt(i) - 'a']++; 
        for (int i = 0; i < l2; i++) 
            freq2[s2.charAt(i) - 'a']++; 
  
        // For every character of s1 
        for (int i = 0; i < MAX; i++) { 
  
            // If current character is 
            // not present in s1 
            if (freq1[i] == 0) 
                continue; 
            boolean found = false; 
  
            // Find a character in s2 that has frequency 
            // equal to the current character's 
            // frequency in s1 
            for (int j = 0; j < MAX; j++)  
            { 
  
                // If such character is found 
                if (freq1[i] == freq2[j])  
                { 
  
                    // Set the frequnecy to -1 so that 
                    // it doesn't get picked again 
                    freq2[j] = -1; 
  
                    // Set found to true 
                    found = true; 
                    break; 
                } 
            } 
  
            // If there is no character in s2 
            // that could be mapped to the 
            // current character in s1 
            if (!found) 
                return false; 
        } 
  
        return true; 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        String s1 = "axx"; 
        String s2 = "cbc"; 
        int l1 = s1.length(); 
        int l2 = s2.length(); 
  
        if (canBeMapped(s1, l1, s2, l2)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
  
    } 
} 
  
// This code is contributed by 
// sanjeev2552 

