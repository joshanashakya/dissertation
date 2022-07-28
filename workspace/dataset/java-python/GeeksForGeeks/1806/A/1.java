

// Java program to check whether the  
// given number is in binary format 
  
class GFG { 
  
    // Function that returns true if  
    // given number is in binary format 
    // i.e. number contains only 0's and/or 1's 
    static boolean isBinary(int number) 
    { 
        while (number > 0) { 
            int digit = number % 10; 
  
            // If digit is other than 0 and 1 
            if (digit > 1) 
                return false; 
            number /= 10; 
        } 
        return true; 
    } 
  
    // Driver code 
    public static void main(String a[]) 
    { 
        int n = 1000111; 
        System.out.println(isBinary(n)); 
    } 
} 

