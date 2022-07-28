

/* Function to get no of bits in binary 
representation of positive integer */
class GFG { 
  
    static int countBits(int n) 
    { 
        int count = 0; 
        while (n != 0) 
        { 
            count++; 
            n >>= 1; 
        } 
          
        return count; 
    } 
      
    /* Driver program*/
    public static void main(String[] arg) 
    { 
        int i = 65; 
        System.out.print(countBits(i)); 
    } 
} 
  
// This code is contributed by Smitha. 

