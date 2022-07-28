

// Java program to check 
// validity of any triangle 
class GFG { 
  
    // Function to check if sum of the 
    // three angles is 180 or not 
    public static int Valid(int a, int b, int c) 
    { 
        // check condition 
        if (a + b + c == 180 && a != 0 && b != 0 && c != 0) 
            return 1; 
        else
            return 0; 
    } 
  
    // Driver Code 
    public static void main(String args[]) 
    { 
  
        int a = 60, b = 40, c = 80; 
  
        // function calling and print output 
        if ((Valid(a, b, c)) == 1) 
            System.out.print("Valid"); 
        else
            System.out.print("Invalid"); 
    } 
} 
  
// This code is contributed 
// by Apurva Sharma 

