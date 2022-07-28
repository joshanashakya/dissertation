

// Java program to check if a  
// given number can be represented  
// in given number of digits in any base 
class GFG 
{ 
    // Returns true if 'num' can be  
    // represented usind 'dig' digits in 'base' 
    static boolean checkUtil(int num, int dig, int base) 
    { 
        // Base case 
        if (dig==1 && num < base) 
        return true; 
      
        // If there are more than 1 digits 
        // left and number is more than base, 
        // then remove last digit by doing num/base, 
        //  reduce the number of digits and recur 
        if (dig > 1 && num >= base) 
        return checkUtil(num / base, --dig, base); 
      
        return false; 
    } 
      
    // return true of num can be  
    // represented in 'dig' digits  
    // in any base from 2 to 32 
    static boolean check(int num, int dig) 
    { 
        // Check for all bases one by one 
        for (int base = 2; base <= 32; base++) 
        if (checkUtil(num, dig, base)) 
                return true; 
        return false; 
    }  
      
    // Driver code 
    public static void main (String[] args) 
    { 
        int num = 8; 
        int dig = 3; 
        if(check(num, dig)) 
            System.out.print("Yes"); 
        else
            System.out.print("No"); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

