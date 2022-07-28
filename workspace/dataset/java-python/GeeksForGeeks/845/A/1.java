

// Java program to print multiplication table 
// till N rows where every Kth row 
// is the table of K up to Kth term 
  
class GFG { 
  
    // Function to print the multiplication table 
    // upto K-th term 
    public static void printMultiples(int N) 
    { 
        // For loop to iterate from 1 to N 
        // where i serves as the value of K 
        for (int i = 1; i <= N; i++) { 
  
            // Inner loop which at every 
            // iteration goes till i 
            for (int j = 1; j <= i; j++) { 
  
                // Printing the table value for i 
                System.out.print((i * j) + " "); 
            } 
  
            // New line after every row 
            System.out.println(); 
        } 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int N = 5; 
  
        printMultiples(N); 
    } 
} 

