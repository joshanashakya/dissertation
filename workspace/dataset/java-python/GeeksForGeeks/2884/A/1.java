

// Java program to count number of ways we 
// can spell a number 
class GFG { 
      
    // Function to calculate all possible  
    // spells of a number with repeated digits 
    // num --> string which is favourite number 
    static long spellsCount(String num) 
    { 
          
        int n = num.length(); 
  
        // final count of total possible spells 
        long result = 1; 
  
        // iterate through complete number 
        for (int i = 0; i < n; i++) { 
              
            // count contiguous frequency of  
            // particular digit num[i] 
            int count = 1; 
              
            while (i < n - 1 && num.charAt(i + 1)  
                               == num.charAt(i)) { 
                                      
                count++; 
                i++; 
            } 
  
            // Compute 2^(count-1) and multiply  
            // with result 
            result = result *  
                     (long)Math.pow(2, count - 1); 
        } 
        return result; 
    } 
  
    public static void main(String[] args) 
    { 
  
        String num = "11112"; 
  
        System.out.print(spellsCount(num)); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

