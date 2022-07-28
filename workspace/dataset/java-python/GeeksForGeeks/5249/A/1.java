

// Java program to print the number which  
// contain the digit d from 0 to n 
  
public class GFG { 
  
    // function to display the values 
    static void printNumbers(int n, int d) 
    { 
          
        // Converting d to character 
        String st = "" + d; 
        char ch = st.charAt(0); 
          
        // Loop to check each digit one by one. 
        for (int i = 0; i <= n; i++) { 
              
            // initialize the string 
            st = ""; 
            st = st + i; 
  
            // checking for digit 
            if (i == d || st.indexOf(ch) >= 0)                 
                System.out.print(i + " "); 
        } 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int n = 100, d = 5; 
        printNumbers(n, d); 
    } 
} 

