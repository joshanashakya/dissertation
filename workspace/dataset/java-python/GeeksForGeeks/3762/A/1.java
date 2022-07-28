

// Java implementation of the above approach  
class GFG  
{ 
  
    // Utility function to print the given binary string 
    static void printBinStr(int[] str, int len)  
    { 
        for (int i = 0; i < len; i++) 
        { 
            System.out.print(str[i]); 
        } 
        System.out.println(); 
    } 
  
    // This function will be called recursively 
    // to generate the next bit for given 
    // binary string according to its current state 
    static void generateBinStr(int[] str, int len, int currlen, 
                                    int occur, int nextbit)  
    { 
  
        // Base-case: if the generated binary string 
        // meets the required length and the pattern "01" 
        // appears twice 
        if (currlen == len)  
        { 
  
            // nextbit needs to be 0 because each time 
            // we call the function recursively, 
            // we call 2 times for 2 cases: 
            // next bit is 0 or 1 
            // The is to assure that the binary 
            // string is printed one time only 
            if (occur == 2 && nextbit == 0) 
            { 
                printBinStr(str, len); 
            } 
            return; 
        } 
  
        // Generate the next bit for str 
        // and call recursive 
        if (currlen == 0)  
        { 
  
            // Assign first bit 
            str[0] = nextbit; 
  
            // The next generated bit will wither be 0 or 1 
            generateBinStr(str, len, currlen + 1, occur, 0); 
            generateBinStr(str, len, currlen + 1, occur, 1); 
        } else // If pattern "01" occurrence is < 2 
        if (occur < 2)  
        { 
  
            // Set next bit 
            str[currlen] = nextbit; 
  
            // If pattern "01" appears then 
            // increase the occurrence of pattern 
            if (str[currlen - 1] == 0 && nextbit == 1)  
            { 
                occur += 1; 
            } 
            generateBinStr(str, len, currlen + 1, occur, 0); 
            generateBinStr(str, len, currlen + 1, occur, 1); 
  
            // Else pattern "01" occurrence equals 2 
        } else // If previous bit is 0 then next bit cannot be 1 
        if (str[currlen - 1] == 0 && nextbit == 1)  
        { 
            return; 
  
            // Otherwise 
        }  
        else 
        { 
            str[currlen] = nextbit; 
            generateBinStr(str, len, currlen + 1, occur, 0); 
            generateBinStr(str, len, currlen + 1, occur, 1); 
        } 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        int n = 5; 
  
        // Length of the resulting strings 
        // must be at least 4 
        if (n < 4)  
        { 
            System.out.print(-1); 
        }  
        else
        { 
            int[] str = new int[n]; 
  
            // Generate all binary strings of length n 
            // with sub-string "01" appearing twice 
            generateBinStr(str, n, 0, 0, 0); 
            generateBinStr(str, n, 0, 0, 1); 
        } 
    } 
} 
  
// This code has been contributed by 29AjayKumar 

