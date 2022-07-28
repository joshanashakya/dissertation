

// Java program to check if a number can 
// be expressed as sum of consecutive numbers 
  
class Test 
{ 
    // This function returns true if n can be 
    // expressed sum of consecutive. 
    static boolean canBeSumofConsec(int n) 
    { 
        // We basically return true if n is a 
        // power of two 
        return (((n&(n-1))!=0) && n!=0); 
    } 
      
    // Driver method 
    public static void main(String[] args)  
    { 
        int n = 15; 
        System.out.println(canBeSumofConsec(n) ? "true" : "false"); 
    } 
} 

