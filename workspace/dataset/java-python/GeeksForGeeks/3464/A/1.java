

// Java implementation of the approach 
class GFG { 
  
    // Function to return the minimum letters 
    // required to make a total of n 
    static int minLettersNeeded(int n) 
    { 
        if (n % 26 == 0) 
            return (n / 26); 
        else
            return ((n / 26) + 1); 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int n = 52; 
        System.out.print(minLettersNeeded(n)); 
    } 
} 

