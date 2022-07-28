

// A simple Java program to check if 
// n-th Fibonacci number is multiple 
// of 10. 
class Fibonacci 
{ 
    // Returns true if n-th Fibonacci number  
    // is multiple of 10. 
    static boolean isMultipleOf10(int n) 
    { 
        if(n%15 == 0) 
            return  true; 
          
        return false;     
    } 
      
    // main function 
    public static void main (String[] args)  
    { 
        int n = 30; 
        if (isMultipleOf10(n)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
}  

