

class Funny { 
    static boolean checkFunny(String word) 
    { 
        int i = 1; 
        int j = word.length() - 2; 
        word = word.toLowerCase(); 
        while (i <= j) { 
            if ((Math.abs(word.charAt(i) - word.charAt(i - 1))) !=  
                   Math.abs((word.charAt(j) - word.charAt(j + 1)))) 
                return false; 
            i++; 
            j--; 
        } 
        return true; 
    } 
  
    static void printFunnyWords(String str) 
    { 
        // to extract last word of sentence 
        str = str + " "; 
  
        // to word stores each word of sentence 
        String word = ""; 
  
        for (int i = 0; i < str.length(); i++) { 
            char ch = str.charAt(i); 
  
            // extracting each word 
            if (ch != ' ') 
                word = word + ch; 
            else { 
                if (Funny.checkFunny(word)) 
                    System.out.println(word); 
                word = ""; 
            } 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        Funny.printFunnyWords("Miss Arora teaches us malayalam bdwy "); 
    } 
} 

