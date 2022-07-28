

// Java program to change the sentence 
// with virtual dictionary  
  
class GFG  
{ 
    static char[] alphabets = "abcdefghijklmnopqrstuvwxyz".toCharArray(); 
  
    // function for converting the string 
    static String conversion(String charSet, char[] str1) 
    { 
        String s2 = ""; 
        for (char i : str1) 
          
            // find the index of each element of the 
            // string in the modified set of alphabets 
            // replace the element with the one having the 
            // same index in the actual set of alphabets 
            s2 += alphabets[charSet.indexOf(i)]; 
  
        return s2; 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        String charSet = "qwertyuiopasdfghjklzxcvbnm"; 
        String str1 = "egrt"; 
        System.out.print(conversion(charSet, str1.toCharArray())); 
    } 
} 
  
// This code is contributed by PrinciRaj1992 

