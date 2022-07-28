

// Java implementation to  
// print the bracket number 
import java.io.*; 
import java.util.*; 
  
class GFG 
{ 
    // function to print  
    // the bracket number 
    static void printBracketNumber(String exp,  
                                   int n) 
    { 
        // used to print the  
        // bracket number for  
        // the left bracket 
        int left_bnum = 1; 
          
        // used to obtain the  
        // bracket number for 
        // the right bracket 
        Stack<Integer> right_bnum = 
                   new Stack<Integer>(); 
          
        // traverse the given 
        // expression 'exp' 
        for (int i = 0; i < n; i++)  
        { 
              
            // if current character  
            // is a left bracket 
            if (exp.charAt(i) == '(')  
            { 
                  
                // print 'left_bnum', 
                System.out.print( 
                       left_bnum + " "); 
                  
                // push 'left_bum' on to 
                // the stack 'right_bnum' 
                right_bnum.push(left_bnum); 
                  
                // increment 'left_bnum' by 1 
                left_bnum++; 
            } 
              
            // else if current character  
            // is a right bracket 
            else if(exp.charAt(i) == ')') 
            { 
      
                // print the top element  
                // of stack 'right_bnum' 
                // it will be the right  
                // bracket number 
                System.out.print( 
                       right_bnum.peek() + " "); 
                  
                // pop the top element  
                // from the stack 
                right_bnum.pop(); 
            } 
        } 
    } 
      
    // Driver Code 
    public static void main(String args[]) 
    { 
        String exp = "(a+(b*c))+(d/e)"; 
        int n = exp.length(); 
          
        printBracketNumber(exp, n); 
    } 
} 
  
// This code is contributed  
// by Manish Shaw(manishshaw1) 

