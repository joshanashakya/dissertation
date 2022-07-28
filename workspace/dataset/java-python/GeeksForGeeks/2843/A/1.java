

// Java implementation of the approach 
class GFG { 
  
    // Function to return the index of the character 
    // that has 0 occurrence starting from index i 
    static int nextZero(int i, int occurrences[]) 
    { 
        while (i < occurrences.length) { 
  
            // If current character has 0 occurrence 
            if (occurrences[i] == 0) 
                return i; 
            i++; 
        } 
  
        // If no character has 0 occurrence 
        return -1; 
    } 
  
    // Function to return the modified string 
    // which consists of distinct characters 
    static String getModifiedString(String str) 
    { 
  
        int n = str.length(); 
  
        // String cannot consist of all distinct characters 
        if (n > 26) 
            return "-1"; 
  
        char ch[] = str.toCharArray(); 
  
        int i, occurrences[] = new int[26]; 
  
        // Count the occurrences for each of the character 
        for (i = 0; i < n; i++) 
            occurrences[ch[i] - 'a']++; 
  
        // Index for the first character 
        // that hasn't appeared in the string 
        int index = nextZero(0, occurrences); 
        for (i = 0; i < n; i++) { 
  
            // If current character appeared more than once then 
            // it has to be replaced with some character 
            // that hasn't occurred yet 
            if (occurrences[ch[i] - 'a'] > 1) { 
  
                // Decrement current character's occurrence by 1 
                occurrences[ch[i] - 'a']--; 
  
                // Replace the character 
                ch[i] = (char)('a' + index); 
  
                // Update the new character's occurrence 
                // This step can also be skipped as we'll never encounter 
                // this character in the string because 
                // it has been added just now 
                occurrences[index] = 1; 
  
                // Find the next character that hasn't occurred yet 
                index = nextZero(index + 1, occurrences); 
            } 
        } 
  
        // Return the modified string 
        return String.valueOf(ch); 
    } 
  
    // Driver code 
    public static void main(String arr[]) 
    { 
        String str = "geeksforgeeks"; 
        System.out.print(getModifiedString(str)); 
    } 
} 

