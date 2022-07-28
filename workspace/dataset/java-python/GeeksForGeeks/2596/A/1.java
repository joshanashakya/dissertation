

// Java implementation to find the binary 
// representation of next greater integer 
  
class GFG { 
  
// function to find the required 
// binary representation 
    static String nextGreater(String num) { 
  
        int l = num.length(); 
        int i; 
        // examine bits from the right 
        for (i = l - 1; i >= 0; i--) { 
            // if '0' is encountered, convert 
            // it to '1' and then break 
            if (num.charAt(i) == '0') { 
                num = num.substring(0, i) + '1' + num.substring(i+1); 
                break; 
            } // else convert '1' to '0' 
            else { 
                num = num.substring(0, i) + '0' + num.substring(i + 1); 
            } 
            // num[i] = '0'; 
        } 
  
        // if the binary representation 
        // contains only the set bits 
        if (i < 0) { 
            num = "1" + num; 
        } 
  
        // final binary representation 
        // of the required integer 
        return num; 
    } 
  
// Driver program to test above 
    public static void main(String[] args) { 
        String num = "10011"; 
        System.out.println("Binary representation of next number = "
                + nextGreater(num)); 
    } 
} 
//this code contributed by Rajput-Ji 

