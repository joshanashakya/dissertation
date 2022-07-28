

// Java program to generate well  
// ordered numbers with k digits. 
  
class Generate 
{ 
    // number --> Current value of number. 
    // x --> Current digit to be considered 
    // k --> Remaining number of digits 
    static void printWellOrdered(int number,  
                                 int x, int k) 
    { 
        if (k == 0) 
        { 
            System.out.print(number+" "); 
            return; 
        } 
      
        // Try all possible greater digits 
        for (int i = (x + 1); i < 10; i++) 
            printWellOrdered(number * 10 +  
                             i, i, k - 1); 
    } 
      
    // Generates all well ordered  
    // numbers of length k. 
    static void generateWellOrdered(int k) 
    { 
        printWellOrdered(0, 0, k); 
    } 
      
    // Driver Code  
    public static void main (String[] args)  
    { 
        int k = 3; 
        generateWellOrdered(k); 
    } 
} 

