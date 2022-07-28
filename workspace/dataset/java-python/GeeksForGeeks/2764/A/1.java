

// Java program to check if the average character 
// is present in the string or not 
  
import java.math.*; 
  
class GFG { 
  
    // Checks if the character is present 
    static boolean check_char(String st, char ch) 
    { 
  
        // Get the length of string 
        int l = st.length(); 
  
        // Iterate from i=0 to 
        // the length of the string 
        // to check if the character 
        // is present in the string 
        for (int i = 0; i < l; i++) { 
            if (st.charAt(i) == ch) 
                return true; 
        } 
        return false; 
    } 
  
    // Finds the average character of the string 
    static char find_avg(String st) 
    { 
        int i, sm = 0; 
        int l = st.length(); 
        char ch; 
  
        for (i = 0; i < l; i++) { 
            ch = st.charAt(i); 
  
            // Calculate the sum of ASCII 
            // values of each character 
            sm = sm + (int)(ch); 
        } 
  
        // Calculate the average of ASCII values 
        int avg = (int)(Math.floor(sm / l)); 
  
        // Convert the ASCII value to character 
        // and return it 
        return ((char)(avg)); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        String st = "ag23sdfa"; 
  
        // Get the average character 
        char ch = find_avg(st); 
        System.out.println(ch); 
  
        // Check if the average character 
        // is present in string or not 
        if (check_char(st, ch) == true) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
              
    } 
} 

