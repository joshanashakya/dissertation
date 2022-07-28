

// Java program to find extra 
// character in one string 
  
public class Test { 
  
    private static char findExtraCharacter(String s1, String s2) {         
        String smallStr; 
        String largeStr; 
  
        // Determine String with extra character. 
        if(s1.length() > s2.length()) { 
            smallStr = s2; 
            largeStr = s1; 
        } else { 
            smallStr = s1; 
            largeStr = s2; 
        } 
  
        int smallStrCodeTotal = 0; 
        int largeStrCodeTotal = 0; 
        int i = 0; 
  
        // Add character codes of both the strings 
        for(; i < smallStr.length(); i++) { 
            smallStrCodeTotal += smallStr.charAt(i); 
            largeStrCodeTotal += largeStr.charAt(i); 
        } 
  
        // Add last character code of large String. 
        largeStrCodeTotal += largeStr.charAt(i); 
  
        // Minus the character code of smaller string from  
        // the character code of large string.  
        // The result will be the extra character code. 
        int intChar = largeStrCodeTotal - smallStrCodeTotal;         
        return (char)intChar; 
    } 
      
    public static void main(String[] args) { 
        String s1 = "abcd"; 
        String s2 = "cbdae"; 
          
        char extraChar = findExtraCharacter(s1, s2); 
        System.out.println("Extra character: " + extraChar); 
          
    } 
} 
  
  
/*This code is contributed by Amol Bhosale.*/

