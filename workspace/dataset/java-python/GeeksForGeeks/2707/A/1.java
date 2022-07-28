

// Java program to remove all the  
// characters other then alphabets 
  
class GFG { 
  
// function to remove characters and  
// print new string  
    static void removeSpecialCharacter(String str) { 
        char[] s = str.toCharArray(); 
        int j = 0; 
        for (int i = 0; i < s.length; i++) { 
  
            // Store only valid characters  
            if ((s[i] >= 'A' && s[i] <= 'Z') 
                    || (s[i] >= 'a' && s[i] <= 'z')) { 
                s[j] = s[i]; 
                j++; 
            } 
        } 
        System.out.println(String.valueOf(s).substring(0, j)); 
    } 
  
// driver code  
    public static void main(String[] args) { 
        String s = "$Gee*k;s..fo, r'Ge^eks?"; 
        removeSpecialCharacter(s); 
    } 
}  
  
// This code is contributed by 29AjayKumar  

