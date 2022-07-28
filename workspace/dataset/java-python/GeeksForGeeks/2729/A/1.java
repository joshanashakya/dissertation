

// Java Program to form new string  
// from pre/suffix of given strings 
import java.io.*; 
  
class GFG 
{ 
    // Returns a string which contains first l  
    // characters of 'a' and last l characters of 'b'. 
    public static String prefixSuffix(String a,  
                                      String b,  
                                      int l) 
    { 
        // Calculating prefix of first  
        // string of given length 
        String prefix = a.substring(0, l); 
        int lb = b.length(); 
  
        // Calculating suffix of second  
        // string of given length 
        String suffix = b.substring(lb - l); 
        return (prefix + suffix); 
    } 
      
    // Driver code 
    public static void main(String args[])  
                            throws IOException 
    { 
        String a = "remuneration" ,  
               b = "acquiesce"; 
        int l = 5; 
        System.out.println(prefixSuffix(a, b, l)); 
    } 
} 

