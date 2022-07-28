

// Java program to split the given string into odds  
class GFG { 
  
    // Function to check whether a string  
    // is an odd number or not  
    static int checkOdd(String number)  
    {  
        int n = number.length();  
      
        int num = number.charAt(n - 1) - '0';  
      
        return (num & 1);  
    }  
  
    // A function to find the minimum  
    // number of segments the given string  
    // can be divided such that every  
    // segment is a odd number  
    static int splitIntoOdds(String number)  
    {  
        int numLen = number.length();  
      
        // Declare a splitdp[] array  
        // and initialize to -1  
        int splitDP[] = new int[numLen + 1];  
          
        for(int i= 0; i < numLen + 1; i++) 
            splitDP[i] = -1; 
              
        // Build the DP table in  
        // a bottom-up manner  
        for (int i = 1; i <= numLen; i++) {  
      
            // Initially Check if the entire prefix is odd  
            if (i <= 9 && (checkOdd(number.substring(0, i)) == 1))  
                splitDP[i] = 1;  
      
            // If the Given Prefix can be split into Odds  
            // then for the remaining string from i to j  
            // Check if Odd. If yes calculate  
            // the minimum split till j  
            if (splitDP[i] != -1) {  
                for (int j = 1; j <= 9 
                                && i + j <= numLen;  
                    j++) {  
      
                    // To check if the substring from i to j  
                    // is a odd number or not  
                    if (checkOdd(number.substring(i, i + j)) == 1) {  
      
                        // If it is an odd number,  
                        // then update the dp array  
                        if (splitDP[i + j] == -1)  
                            splitDP[i + j] = 1 + splitDP[i];  
      
                        else
                            splitDP[i + j] = Math.min(splitDP[i + j],  
                                                1 + splitDP[i]);  
                    }  
                }  
            }  
        }  
      
        // Return the minimum number of splits  
        // for the entire string  
        return splitDP[numLen];  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        System.out.println(splitIntoOdds("123456789123456789123"));  
    }  
} 
  
// This code is contributed by AnkitRai01 

