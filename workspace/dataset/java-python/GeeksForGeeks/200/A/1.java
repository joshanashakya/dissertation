

// Efficient Java program to replace  
// all occurrences of "AB" with "C" 
import java.io.*; 
  
class GFG { 
      
    static void translate(char str[]) 
    { 
        int len = str.length; 
        if (len < 2) 
        return; 
      
        // Index in modified string 
        int i = 0; 
          
        // Index in original string 
        int j = 0;  
      
        // Traverse string 
        while (j < len - 1) 
        { 
            // Replace occurrence of "AB" with "C" 
            if (str[j] == 'A' && str[j + 1] == 'B') 
            { 
                // Increment j by 2 
                j = j + 2; 
                str[i++] = 'C'; 
                continue; 
            } 
            str[i++] = str[j++]; 
        } 
      
        if (j == len - 1) 
        str[i++] = str[j]; 
      
        // add a null character to terminate string 
        str[i] = ' '; 
        str[len - 1]=' '; 
    } 
      
    // Driver code 
    public static void main(String args[]) 
    { 
        String st="helloABworldABGfG"; 
        char str[] = st.toCharArray(); 
        translate(str); 
        System.out.println("The modified string is :"); 
        System.out.println(str); 
    } 
} 
  
  
// This code is contributed  
// by Nikita Tiwari. 

