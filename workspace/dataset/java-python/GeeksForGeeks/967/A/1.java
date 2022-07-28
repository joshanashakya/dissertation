

// Java implementation of the approach 
  
class GFG  
{ 
  
// Function to print the required string 
static void printString(char[] str, int n) 
{ 
    // count number of 1s 
    int ones = 0; 
    for (int i = 0; i < n; i++) 
        if (str[i] == '1') 
            ones++; 
  
    // To check if the all the 1s 
    // have been used or not 
    boolean used = false; 
  
    for (int i = 0; i < n; i++)  
    { 
        if (str[i] == '2' && !used)  
        { 
            used = true; 
  
            // Print all the 1s if any 2 is encountered 
            for (int j = 0; j < ones; j++) 
                System.out.print("1"); 
        } 
  
        // If str[i] = 0 or str[i] = 2 
        if (str[i] != '1') 
            System.out.print(str[i]); 
  
    } 
  
    // If 1s are not printed yet 
    if (!used) 
        for (int j = 0; j < ones; j++) 
            System.out.print("1"); 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    String str = "100210"; 
    int n = str.length(); 
    printString(str.toCharArray(), n); 
} 
} 
  
/* This code contributed by PrinciRaj1992 */

