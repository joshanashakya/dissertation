

// Java implementation of the approach 
class GFG  
{ 
      
    static int MAX = 10; 
      
    // Function to return the maximum 
    // even number that can be formed 
    // with any number of digit swaps 
    static String getMaxEven(char[] str, int len) 
    { 
      
        // To store the frequencies of 
        // all the digits 
        int []freq = new int[MAX]; 
      
        // To store the minimum even digit 
        // and the minimum overall digit 
        int i, minEvenDigit = MAX, minDigit = MAX; 
        for (i = 0; i < len; i++) 
        { 
            int digit = str[i] - '0'; 
            freq[digit]++; 
      
            // If digit is even then update 
            // the minimum even digit 
            if (digit % 2 == 0) 
                minEvenDigit = Math.min(digit, minEvenDigit); 
      
            // Update the overall minimum digit 
            minDigit = Math.min(digit, minDigit); 
        } 
      
        // If there is no even digit then 
        // it is not possible to generate 
        // an even number with swaps 
        if (minEvenDigit == MAX) 
            return "-1"; 
      
        // Decrease the frequency of the 
        // digits that need to be swapped 
        freq[minEvenDigit]--; 
        freq[minDigit]--; 
      
        i = 0; 
          
        // Take every digit starting from the maximum 
        // in order to maximize the number 
        for (int j = MAX - 1; j >= 0; j--) 
        { 
      
            // Take current digit number of times 
            // it appeared in the original number 
            for (int k = 0; k < freq[j]; k++) 
                str[i++] = (char)(j + '0'); 
      
            // If current digit equals to the 
            // minimum even digit then one instance of it 
            // needs to be swapped with the minimum overall digit 
            // i.e. append the minimum digit here 
            if (j == minEvenDigit) 
                str[i++] = (char)(minDigit + '0'); 
        } 
      
        // Append once instance of the minimum 
        // even digit in the end to make the number even 
        str[i-1] = (char)(minEvenDigit + '0'); 
      
        return String.valueOf(str); 
    } 
      
    // Driver code 
    public static void main(String[] args)  
    { 
        char[] str = "1023422".toCharArray(); 
        int len = str.length; 
      
        System.out.println(getMaxEven(str, len)); 
    } 
} 
  
/* This code contributed by PrinciRaj1992 */

