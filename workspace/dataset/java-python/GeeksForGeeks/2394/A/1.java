

// Java program to print the largest integer  
// not greater than N with all odd digits  
  
public class GFG{ 
  
        // Function to check if all digits  
        // of a number are odd  
        static boolean allOddDigits(int n)  
        {  
            // iterate for all digits  
            while (n != 0) {  
            
                // if digit is even  
                if ((n % 10) % 2 == 0)  
                    return false;  
                n /= 10;  
            }  
            
            // all digits are odd  
            return true;  
        }  
            
        // function to return the largest number  
        // with all digits odd  
        static int largestNumber(int n)  
        {  
            if (n % 2 == 0)  
                n--;  
            
            // iterate till we find a  
            // number with all digits odd  
            for (int i = n;; i -= 2)  
                if (allOddDigits(i))  
                    return i;  
        }  
  
     public static void main(String []args){ 
           
        int N = 23;  
        System.out.println(largestNumber(N)); 
   
    } 
    // This code is contributed by ANKITRAI1 
       
} 

