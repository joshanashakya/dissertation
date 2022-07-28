

// Java implementation to check whether 
// given binary number is evenly 
// divisible by 2^k or not 
class GFG { 
      
    // function to check whether 
    // given binary number is  
    // evenly divisible by 2^k or not 
    static boolean isDivisible(String str, int k) 
    { 
        int n = str.length(); 
        int c = 0; 
      
        // count of number of 0 from last 
        for (int i = 0; i < k; i++)  
            if (str.charAt(n - i - 1) == '0')          
                c++; 
      
        // if count = k, number is evenly  
        // divisible, so returns true else  
        // false 
        return (c == k); 
    } 
  
    // Driver program to test above 
    public static void main(String args[]) 
    {  
          
        // first example 
        String str1 = "10101100"; 
        int k = 2; 
        if (isDivisible(str1, k) == true) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
  
    // Second example 
        String str2 = "111010100"; 
        k = 2; 
        if (isDivisible(str2, k) == true) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
} 
  
// This code is contributed by JaideepPyne. 

