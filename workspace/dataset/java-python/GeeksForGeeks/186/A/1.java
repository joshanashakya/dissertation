

// Java program to find if a number is 
// divisible by 36 or not 
class IsDivisible 
{ 
    // Function to check whether a number 
    // is divisible by 36 or not 
    static boolean divisibleBy36(String num) 
    { 
        int l = num.length(); 
       
        // null number cannot 
        // be divisible by 36 
        if (l == 0) 
            return false; 
       
        // single digit number other than 
        // 0 is not divisible by 36 
        if (l == 1 && num.charAt(0) != '0') 
            return false; 
       
        // number formed by the last 2 digits 
        int two_digit_num = (num.charAt(l-2) - '0')*10 + 
                            (num.charAt(l-1) - '0') ; 
       
        // if number is not divisible by 4 
        if (two_digit_num%4 != 0) 
            return false; 
       
        // number is divisible by 4 calculate 
        // sum of digits 
        int sum = 0; 
        for (int i=0; i<l; i++) 
            sum += (num.charAt(i) - '0'); 
       
        // sum of digits is not divisible by 9 
        if (sum%9 != 0) 
            return false; 
       
        // number is divisible by 4 and 9 
        // hence, number is divisible by 36 
        return true; 
    } 
  
    // main function 
    public static void main (String[] args)  
    { 
        String num = "92567812197966231384"; 
        if(divisibleBy36(num)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
}  

