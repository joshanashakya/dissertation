

// Java program to find Sum of digits of a 
// number formed by repeating a number X number of 
// times until sum become single digit. 
  
class GFG { 
      
    // return single digit sum of a number. 
    static int digSum(int n) 
    { 
        if (n == 0) 
            return 0; 
        return (n % 9 == 0) ? 9 : (n % 9); 
    } 
      
    // Returns recursive sum of digits of a number  
    // formed by repeating a number X number of 
    // times until sum become single digit. 
    static int repeatedNumberSum(int n, int x) 
    { 
        int sum = x * digSum(n); 
        return digSum(sum); 
    } 
          
    // Driver program  
    public static void main (String[] args)  
    { 
        int n = 24, x = 3; 
        System.out.println(repeatedNumberSum(n, x)); 
    } 
} 
  
// This code is contributed by Ajit. 

