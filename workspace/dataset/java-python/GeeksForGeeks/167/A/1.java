

// Java program to find if a number is 
// divisible by 25 or not 
class IsDivisible 
{ 
    // Function to find that number divisible 
    // by 25 or not. 
    static boolean isDivisibleBy25(String str) 
    { 
        // If length of string is single digit then 
        // it's not divisible by 25 
        int n = str.length(); 
        if (n == 1) 
            return false; 
       
        return ( (str.charAt(n-1)-'0' == 0  && 
                  str.charAt(n-2)-'0' == 0) || 
        ((str.charAt(n-2)-'0')*10 + (str.charAt(n-1)-'0'))%25 == 0 ); 
    } 
      
    // main function 
    public static void main (String[] args)  
    { 
        String str = "76955"; 
        if(isDivisibleBy25(str)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
}  

