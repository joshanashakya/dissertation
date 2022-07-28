

// Java program to print a String in reverse  
// alphabetical order upto given number  
  
class GFG { 
  
// Function that prints the required String  
    static String printString(int n, String str) { 
        String str2 = ""; 
  
        // Find modulus with 26  
        int extraChar = n % 26; 
  
        // Print extra characters required  
        if (extraChar >= 1) { 
            for (int i = 26 - (extraChar + 1); i <= 25; i++) { 
                str2 += str.charAt(i); 
            } 
        } 
        int countOfStr = n / 26; 
  
        // Print the given reverse String countOfStr times  
        for (int i = 1; i <= countOfStr; i++) { 
            for (int j = 0; j < 26; j++) { 
                str2 += str.charAt(j); 
            } 
        } 
        return str2; 
    } 
  
// Driver Code  
    public static void main(String[] args) { 
        int n = 30; 
  
        // Initialize a String in reverse order  
        String str = "zyxwvutsrqponmlkjihgfedcba"; 
        System.out.println(printString(n, str)); 
    } 
} 
  
// This code is contributed by Rajput-JI  

