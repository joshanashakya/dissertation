

// Java program to implement run length encoding 
  
public class Improve { 
  
    // Check if the character is vowel or not 
    static boolean isVowel(char c) 
    { 
        String vowel = "aeiou"; 
        for (int i = 0; i < vowel.length(); ++i) 
            if (vowel.charAt(i) == c) 
                return true; 
        return false; 
    } 
  
    // Returns true if 'typed' is a typed name 
    // given str 
    static boolean printRLE(String str, String typed) 
    { 
        int n = str.length(), m = typed.length(); 
  
        // Traverse through all characters of str. 
        int j = 0; 
        for (int i = 0; i < n; i++) { 
  
            // If current characters do not match 
            if (str.charAt(i) != typed.charAt(j)) 
                return false; 
  
            // If not vowel, simply move ahead in both 
            if (isVowel(str.charAt(i)) == false) { 
                j++; 
                continue; 
            } 
  
            // Count occurrences of current vowel in str 
            int count1 = 1; 
            while (i < n - 1 && str.charAt(i) == str.charAt(i+1)) { 
                count1++; 
                i++; 
            } 
  
            // Count occurrences of current vowel in 
            // typed. 
            int count2 = 1; 
            while (j < m - 1 && typed.charAt(j) == str.charAt(i)) { 
                count2++; 
                j++; 
            } 
  
            if (count1 > count2) 
                return false; 
        } 
  
        return true; 
    } 
      
    public static void main(String args[]) 
    { 
  
           String name = "alex", typed = "aaalaeex"; 
            if (printRLE(name, typed)) 
                System.out.println("Yes"); 
            else
                System.out.println("No"); 
            
    } 
    // This code is contributed by ANKITRAI1 
} 

