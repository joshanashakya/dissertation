

// An efficient Java program to find bit-wise  
// & of all numbers from x to y.  
class GFG {  
      
    // Find position of MSB in n. For example  
    // if n = 17, then position of MSB is 4.  
    // If n = 7, value of MSB is 3  
    static int msbPos(long n)  
    {  
          
        int msb_p = -1;  
        while (n > 0) {  
            n = n >> 1;  
            msb_p++;  
        }  
          
        return msb_p;  
    }  
  
    // Function to find Bit-wise & of all  
    // numbers from x to y.  
    static long andOperator(long x, long y)  
    {  
          
        long res = 0; // Initialize result  
  
        while (x > 0 && y > 0) {  
              
            // Find positions of MSB in x and y  
            int msb_p1 = msbPos(x);  
            int msb_p2 = msbPos(y);  
  
            // If positions are not same, return  
            if (msb_p1 != msb_p2)  
                break;  
  
            // Add 2^msb_p1 to result  
            long msb_val = (1 << msb_p1);  
            res = res + msb_val;  
  
            // subtract 2^msb_p1 from x and y.  
            x = x - msb_val;  
            y = y - msb_val;  
        }  
  
        return res;  
    }  
      
    // Driver code  
    public static void main(String[] args)  
    {  
          
        long x = 10, y = 15;  
          
        System.out.print(andOperator(x, y));  
    }  
}  
  
// This code is contributed by Anant Agarwal.  

