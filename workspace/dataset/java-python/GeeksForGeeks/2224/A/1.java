

// JAVA Code for Number of digits  
// in the product of two numbers 
class GFG { 
      
    // function to count number of digits  
    // in the product of two numbers 
    public static int countDigits(int a, int b) 
    { 
        // if either of the number is 0, then 
        // product will be 0 
        if (a == 0 || b == 0) 
            return 1; 
               
        // required count of digits             
        return (int)Math.floor(Math.log10(Math.abs(a)) +  
                            Math.log10(Math.abs(b))) + 1;     
    } 
      
    /* Driver program to test above function */
    public static void main(String[] args)  
    { 
        int a = 33; 
        int b = -24; 
        System.out.print(countDigits(a,b)); 
    } 
} 
// This code is contributed by Arnav Kr. Mandal. 

