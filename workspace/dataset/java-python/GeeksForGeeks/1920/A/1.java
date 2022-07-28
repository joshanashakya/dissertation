

// JAVA implementation to find remainder 
// when a large number is divided by 11 
import java.io.*; 
  
class GFG{ 
      
    // Function to return remainder 
    static int remainder(String str) 
    { 
        // len is variable to store the 
        // length of number string. 
        int len = str.length(); 
       
        int num, rem = 0; 
       
        // loop that find remainder 
        for (int i = 0; i < len; i++) { 
            num = rem * 10 + (str.charAt(i) - '0'); 
            rem = num % 11; 
        } 
       
        return rem; 
    } 
       
    // Driver code 
    public static void main(String args[]) 
    { 
        String str = "3435346456547566345436457867978"; 
        System.out.println(remainder(str)); 
    } 
} 
  
/*This code is contributed by Nikita Tiwari.*/

