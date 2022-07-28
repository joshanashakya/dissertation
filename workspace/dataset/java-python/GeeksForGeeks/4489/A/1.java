

// JAVA Code to Count unset bits in a number 
class GFG { 
  
    public static int countunsetbits(int n) 
    { 
        int count = 0;  
           
        // x holds one set digit at a time 
        // starting from LSB to MSB of n. 
        for (int x = 1; x <= n; x = x<<1)  
            if ((x & n) == 0) 
                count++;      
       
        return count;  
    } 
      
    /* Driver program to test above function */
    public static void main(String[] args)  
    { 
        int n = 17; 
        System.out.println(countunsetbits(n));  
    } 
} 
// This code is contributed by Arnav Kr. Mandal. 

