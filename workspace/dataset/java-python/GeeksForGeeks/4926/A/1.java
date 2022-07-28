

// Java program to find number of  
// characters at same position  
// as in English alphabets 
class GFG 
{ 
  
    static int findCount(String str)  
    { 
        int result = 0; 
  
        // Traverse input string 
        for (int i = 0; i < str.length(); i++)  
          
        // Check that index of characters  
        // of string is same as of English  
        // alphabets by using ASCII values  
        // and the fact that all lower case 
        // alphabetic characters come together  
        // in same order in ASCII table. And  
        // same is true for upper case. 
        { 
            if (i == (str.charAt(i) - 'a') 
                    || i == (str.charAt(i) - 'A'))  
            { 
                result++; 
            } 
        } 
        return result; 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        String str = "AbgdeF"; 
        System.out.print(findCount(str)); 
    } 
} 
  
// This code is contributed by Rajput-JI 

