

// Java implementation to find the binary  
// representation of previous number  
class GFG  
{ 
  
    // function to find the required  
    // binary representation  
    static String previousNumber(String num)  
    { 
        int n = num.length(); 
  
        // if the number is '1'  
        if (num.compareTo("1") == 0)  
        { 
            return "0"; 
        } 
  
        // examine bits from right to left  
        int i; 
        for (i = n - 1; i >= 0; i--) 
        { 
  
            // if '1' is encountered, convert  
            // it to '0' and then break  
            if (num.charAt(i) == '1')  
            { 
                num = num.substring(0, i) + '0' +  
                            num.substring(i + 1); 
                  
                // num.charAt(i) = '0';  
                break; 
            }  
              
            // else convert '0' to '1'  
            else 
            { 
                num = num.substring(0, i) + '1' +  
                            num.substring(i + 1); 
            } 
            //num.at(i) = '1';  
        } 
  
        // if only the 1st bit in the  
        // binary representation was '1'  
        if (i == 0)  
        { 
            return num.substring(1, n - 1); 
        } 
  
        // final binary representation  
        // of the required number  
        return num; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        String num = "10110"; 
        System.out.print("Binary representation of previous number = "
                + previousNumber(num)); 
    } 
} 
  
/* This code contributed by PrinciRaj1992 */

