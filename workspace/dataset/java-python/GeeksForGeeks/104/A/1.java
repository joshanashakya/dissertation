

// Java program to find minimum number 
// of swap operations required 
class GFG { 
      
    // Function that print minimum number 
    // of swap operations required 
    static void MinimumSwapOperations(String s) 
    { 
        boolean zero_exist = false; 
        boolean multiple_of_2 = false; 
        int sum = 0; 
        int index_of_zero = 0; 
        boolean more_zero = false; 
      
        for (int i = 0; i < s.length(); i++) { 
            int val = s.charAt(i) - '0'; 
      
            // Condition if more than one 
            // zero exist 
            if (zero_exist == true) 
                more_zero = true; 
      
            // Condition if zero_exist 
            if (val == 0) { 
                zero_exist = true; 
                index_of_zero = i; 
            } 
      
            // Computing total sum of all digits 
            sum += val; 
        } 
      
        // Condition if zero does not exist or 
        // the sum is not divisible by 3 
        if (zero_exist == false || sum % 3 != 0) { 
            System.out.println("-1"); 
            return; 
        } 
      
        for (int i = 0; i < s.length(); i++) { 
            int val = s.charAt(i) - '0'; 
      
            // Condition to find a digit that is 
            // multiple of 2 other than one zero 
            if (val % 2 == 0 && i != index_of_zero) 
                multiple_of_2 = true; 
        } 
      
        // Condition if multiple of 2 
        // do not exist 
        if (multiple_of_2 == false) { 
            System.out.println("-1"); 
            return; 
        } 
      
        int last_val = s.charAt(s.length() - 1)- '0'; 
        int second_last_val = s.charAt(s.length() - 2)- '0'; 
      
        // Condition for zero swaps 
        // means the number is already 
        // is divisible by 60 
        if (last_val == 0&& second_last_val % 2 == 0) 
            System.out.println(0); 
      
        // Condition for only one swap 
        else if ((last_val == 0
                  && second_last_val % 2 != 0) 
                 || (last_val % 2 == 0
                     && second_last_val == 0)) 
            System.out.println(1); 
      
        else if (more_zero == true
                 && (last_val == 0
                     && second_last_val % 2 != 0)) 
            System.out.println(1) ; 
      
        // Otherwise 2 swaps required 
        else
            System.out.println(2) ; 
    } 
      
    // Driver Code 
    public static void main (String[] args) 
    { 
        String N = "20"; 
      
        MinimumSwapOperations(N); 
      
    } 
} 
  
// This code is contributed by AnkitRai01 

