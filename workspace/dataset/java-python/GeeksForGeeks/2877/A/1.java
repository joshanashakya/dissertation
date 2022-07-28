

// Java implementation of the approach 
  
class GFG  
{ 
  
    static int MAXN = 256; 
  
    // Function that returns true if the frequency 
    // of any character is more than half the 
    // length of the string 
    static boolean checkHalfFrequency(String str) 
    { 
  
        // Length of the string 
        int L = str.length(); 
  
        // Initialize a frequency array 
        int fre[] = new int[MAXN]; 
  
        // Iterate the string and update the 
        // frequency of each of the character 
        for (int i = 0; i < L; i++) 
        { 
            fre[str.charAt(i)]++; 
        } 
  
        // Iterate the frequency array 
        for (int i = 0; i < MAXN; i++) // If condition is satisfied 
        { 
            if (fre[i] > L / 2)  
            { 
                return true; 
            } 
        } 
  
        return false; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        String str = "GeeksforGeeks"; 
  
        if (checkHalfFrequency(str)) 
        { 
            System.out.println("Yes"); 
        }  
        else
        { 
            System.out.println("No"); 
        } 
    } 
} 
  
/* This code contributed by PrinciRaj1992 */

