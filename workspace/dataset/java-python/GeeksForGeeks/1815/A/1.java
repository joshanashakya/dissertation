

// Java code to check if a Octal 
// number is Even or Odd 
  
import java.io.*; 
  
class Main { 
  
    // To return value of a char. 
    static int val(char c) 
    { 
        if (c >= '0' && c <= '9') 
            return (int)c - '0'; 
        else
            return (int)c - 'A' + 10; 
    } 
  
    // Function to convert a 
    // number from N base to decimal 
    static int toDeci(String str, 
                      int base) 
    { 
        int len = str.length(); 
  
        // power of base 
        int power = 1; 
  
        int num = 0; 
        int i; 
  
        // Decimal equivalent is 
        // str[len-1]*1 + str[len-1] * 
        // base + str[len-1]*(base^2) + ... 
        for (i = len - 1; i >= 0; i--) { 
  
            // A digit in input number 
            // must be less than 
            // number's base 
            if (val(str.charAt(i)) >= base) { 
  
                System.out.println("Invalid Number"); 
                return -1; 
            } 
  
            num += val(str.charAt(i)) 
                   * power; 
            power = power * base; 
        } 
  
        return num; 
    } 
  
    // Returns true if n is even, else odd 
    public static boolean isEven( 
        String num, int N) 
    { 
  
        int deci = toDeci(num, N); 
  
        return (deci % 2 == 0); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        String num = "11A"; 
        int N = 16; 
  
        if (isEven(num, N)) { 
            System.out.println("Even"); 
        } 
        else { 
            System.out.println("Odd"); 
        } 
    } 
} 

