

// Java program for character replacement 
// after String minimization 
  
class GFG { 
    // Function to minimize String 
  
    static String minimize(String str) 
    { 
        String mstr = " "; 
        int l, i, flagchar[] = new int[26]; 
        char ch; 
  
        l = str.length(); 
  
        // duplicate characters are removed 
        for (i = 0; i < str.length(); i++) { 
            ch = str.charAt(i); 
  
            // checks if character has previously occurred or not 
            // if not then add it to the minimized String 'mstr' 
            if (flagchar[ch - 97] == 0) { 
                mstr = mstr + ch; 
                flagchar[ch - 97] = 1; 
            } 
        } 
  
        return mstr; // minimized String 
    } 
  
    // Utility function to print the 
    // minimized, replaced String 
    static void replaceMinimizeUtil(String str) 
    { 
        String minimizedStr, finalStr = ""; 
        int i, index, l; 
        char ch; 
        l = str.length(); 
  
        minimizedStr = minimize(str); // minimized String 
  
        // Creating final String by replacing character 
        for (i = 0; i < minimizedStr.length(); i++) { 
            ch = minimizedStr.charAt(i); 
  
            // index calculation 
            index = (ch * ch) % l; 
  
            finalStr = finalStr + str.charAt(index); 
        } 
        // final String 
        System.out.println("Final String: " + finalStr); 
    } 
  
    // Driver program 
    public static void main(String[] args) 
    { 
        String str = "geeks"; 
  
        replaceMinimizeUtil(str); 
    } 
} 
// This code is contributed by Rajput-JI 

