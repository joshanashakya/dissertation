

// Java program for implementation of efficient 
// approach to find length of last word 
public class GFG { 
    public int lengthOfLastWord(final String a) 
    { 
        boolean char_flag = false; 
        int len = 0; 
        for (int i = a.length() - 1; i >= 0; i--) { 
            if (Character.isLetter(a.charAt(i))) { 
                // Once the first character from last 
                // is encountered, set char_flag to true. 
                char_flag = true; 
                len++; 
            } 
            else { 
                // When the first space after the characters 
                // (from the last) is encountered, return the 
                // length of the last word 
                if (char_flag == true) 
                    return len; 
            } 
        } 
        return len; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        String input = "Geeks For Geeks  "; 
        GFG gfg = new GFG(); 
        System.out.println("The length of last word is " + gfg.lengthOfLastWord(input)); 
    } 
} 

