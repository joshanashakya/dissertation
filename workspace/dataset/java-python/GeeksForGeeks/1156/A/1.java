

// Recursive Java program to count the total 
// number of vowels using recursion 
public class GFG { 
         
    // Function to check the Vowel 
    static int isVowel(char ch) 
    { 
        ch = Character.toUpperCase(ch); 
       if(ch=='A' || ch=='E' || ch=='I' || 
            ch=='O' || ch=='U')  
           return 1; 
       else return 0; 
    } 
       
    // to count total number of vowel from 0 to n 
    static int countVowels(String str, int n) 
    { 
        if (n == 1) 
            return isVowel(str.charAt(n - 1)); 
       
        return countVowels(str, n-1) + isVowel(str.charAt(n - 1)); 
    } 
       
    // Main Calling Function 
    public static void main(String args[]) 
    { 
        //string object 
        String str = "abc de"; 
       
        // Total numbers of Vowel 
        System.out.println(countVowels(str,str.length())); 
    } 
} 
// This code is contributed by Sumit Ghosh 

