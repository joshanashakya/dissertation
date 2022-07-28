

// Java program to convert binary to 
// decimal when input is represented 
// as binary string. 
import java.io.*; 
  
class GFG { 
  
    // Function to convert binary to decimal 
    static int binaryToDecimal(String n) 
    { 
        String num = n; 
        int dec_value = 0; 
  
        // Initializing base value to 1, 
        // i.e 2^0 
        int base = 1; 
  
        int len = num.length(); 
        for (int i = len - 1; i >= 0; i--) { 
            if (num.charAt(i) == '1') 
                dec_value += base; 
            base = base * 2; 
        } 
  
        return dec_value; 
    } 
  
    // Driver program to test above function 
    public static void main(String[] args) 
    { 
        String num = new String("10101001"); 
        System.out.println(binaryToDecimal(num)); 
    } 
} 
  
// This code is contribute by Prerna Saini 

