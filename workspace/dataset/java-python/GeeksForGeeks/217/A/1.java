

// Java program to count number of trailing zeros 
// in Binary representation of a number 
// using Bitset 
import java.util.*; 
import java.lang.*;  
import java.io.*; 
  
class GFG 
{ 
       
    // Function to count number of trailing zeros in 
    // Binary representation of a number 
    // using Bitset 
    static int CountTrailingZeros(int n) 
    { 
          
        String bit = Integer.toBinaryString(n); 
        StringBuilder bit1 = new StringBuilder();  
        bit1.append(bit); 
        bit1=bit1.reverse(); 
        int zero = 0; 
       
        for (int i = 0; i < 64; i++) { 
            if (bit1.charAt(i) == '0') 
                zero++; 
            // if '1' comes then break 
            else
                break; 
        } 
       
        return zero; 
    } 
       
    // Driver Code 
    public static void main(String []args) 
    { 
        int n = 4; 
       
        int ans = CountTrailingZeros(n); 
       
        System.out.println(ans); 
    } 
} 
  
// This code is contributed by chitranayal 

