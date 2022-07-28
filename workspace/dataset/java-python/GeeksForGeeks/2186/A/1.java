

// Java program to Count  
// numbers in range L-R 
// that are divisible by 
// all of its non-zero  
// digits 
import java.io.*; 
  
class GFG { 
  
    // check if the number 
    // is divisible by the 
    // digits. 
    static boolean check(int n) 
    { 
        int m = n; 
      
        while (n != 0) 
        { 
            int r = n % 10; 
          
            if (r > 0)  
                if ((m % r) != 0) 
                    return false;      
          
            n /= 10; 
        } 
      
        return true; 
    } 
      
    // function to calculate 
    // the number of numbers 
    static int count(int l, int r) 
    { 
        int ans = 0; 
          
        for (int i = l; i <= r; i++)  
            if (check(i)) 
                ans += 1;  
        return ans; 
    } 
      
    // Driver function 
    public static void main(String args[]) 
    { 
        int l = 10, r = 20; 
          
        System.out.println(count(10, 20)); 
    } 
} 
  
// This code is contributed by Nikita Tiwari. 

