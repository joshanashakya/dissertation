

// Java program to replace minimal number of  
// characters to make all characters  
// pair wise distinct   
  
class GFG { 
  
// Function to replace minimal number of  
// characters to make all characters  
// pair wise distinct  
    static void minReplacement(String str) { 
        // If length of String is greater than 26,  
        // it is impossible to make characters  
        // pair wise distinct  
        if (str.length() > 26) { 
            System.out.println("IMPOSSIBLE"); 
        } else { 
            // Array to store frequency of each  
            // character  
            int hash[] = new int[26]; 
  
            // Store frequency of each character  
            for (int i = 0; i < str.length(); i++) { 
                hash[str.charAt(i) - 'a']++; 
            } 
  
            int count = 0; 
  
            // Start traversing the String  
            for (int i = 0; i < str.length(); i++) { 
  
                // Check if frequency of current character  
                // is greater than 1  
                if (hash[str.charAt(i) - 'a'] > 1) { 
  
                    // Traverse the hash  
                    for (int j = 0; j < 26; j++) { 
  
                        // Find the first character starting from 'a'  
                        // which have not appeared in the String yet  
                        if (hash[j] == 0) { 
  
                            // Reduce the frequency of current  
                            // character in the String  
                            hash[str.charAt(i) - 'a']--; 
  
                            // Replace the current character in String  
                            // by current character in hash  
                            str = str.substring(0, i) + (char) (j + 'a') + str.substring(i + 1); 
                            //str[i] = (char)(j + 'a');  
  
                            // Increment the frequency of  
                            // this char in hash  
                            hash[j]++; 
  
                            break; 
                        } 
                    } 
                } 
            } 
  
            // Print the modified String  
            System.out.println(str); 
        } 
    } 
// Driver code  
  
    public static void main(String[] args) { 
        String str = "xxxxyyyy"; 
  
        minReplacement(str); 
    } 
} 
  
/* This Java code is contributed by Rajput-Ji*/

