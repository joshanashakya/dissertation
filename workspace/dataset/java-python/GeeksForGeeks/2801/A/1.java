

// Java Program for removing characters 
// from reversed string where vowels are 
// present in original string 
class GFG { 
  
// Function for replacing the string 
    static void replaceOriginal(String s, int n) { 
        // initialize a string of length n 
        char r[] = new char[n]; 
  
        // Traverse through all characters of string 
        for (int i = 0; i < n; i++) { 
  
            // assign the value to string r 
            // from last index of string s 
            r[i] = s.charAt(n - 1 - i); 
  
            // if s[i] is a consonant then 
            // print r[i] 
            if (s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i'
                    && s.charAt(i) != 'o' && s.charAt(i) != 'u') { 
                System.out.print(r[i]); 
            } 
        } 
        System.out.println(""); 
    } 
  
// Driver function 
    public static void main(String[] args) { 
        String s = "geeksforgeeks"; 
        int n = s.length(); 
        replaceOriginal(s, n); 
    } 
}  
  
// This code is contributed by princiRaj1992 

