

//Java program to find the string 
// in lexicographic order which is 
// in between given two strings  
  
class GFG { 
  
// Function to find the lexicographically   
// next string 
    static String lexNext(String str, int n) { 
        char[] s = str.toCharArray(); 
        // Iterate from last character 
        for (int i = n - 1; i >= 0; i--) { 
            // If not 'z', increase by one 
            if (s[i] != 'z') { 
                s[i]++; 
                return String.valueOf(s); 
            } 
  
            // if 'z', change it to 'a' 
            s[i] = 'a'; 
        } 
        return null; 
    } 
  
// Driver Code 
    static public void main(String[] args) { 
        String S = "abcdeg", T = "abcfgh"; 
        int n = S.length(); 
        String res = lexNext(S, n); 
  
        // If not equal, print the  
        // resultant string 
        if (res != T) { 
            System.out.println(res); 
        } else { 
            System.out.println("-1"); 
        } 
    } 
} 
  
// This code is contributed by 29AjayKumar 

