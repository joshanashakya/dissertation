

// Java implementation of the above approach  
  
class GFG  
{ 
      
    // Recursive function to print the desired numbers  
    static void printNumbers(int N)  
    { 
          
        // flag variable to track whether each digit of  
        // the number fulfills the given condition  
        int flag = 1; 
  
        // Creating a copy of the number  
        int x = N; 
  
        // Checking if the number has a positive value  
        if (N > 0)  
        { 
              
            // Loop to iterate through digits  
            // of the number until every digit  
            // fulfills the given condition  
            while (x > 0 && flag == 1)  
            { 
                // Get last digit  
                int digit = x % 10; 
  
                // Updating value of flag to be 0 if  
                // the digit is neither 1 nor 3  
                if (digit != 1 && digit != 3)  
                { 
                    flag = 0; 
                } 
  
                // Eliminate last digit  
                x = x / 10; 
            } 
  
            // If N consists of digits 1 or 3 only  
            if (flag == 1) { 
                System.out.print(N + " "); 
            } 
  
            // Recursive call for the next number  
            printNumbers(N - 1); 
        } 
    } 
  
    // Driver code  
    public static void main(String[] args)  
    { 
        int N = 20; 
        printNumbers(N); 
    } 
}  
  
// This code is contributed by PrinciRaj1992 

