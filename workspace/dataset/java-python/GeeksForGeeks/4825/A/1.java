

// Java Program to find the sum of sum of  
// squares of first n natural number 
class GFG { 
  
    // Function to find sum of sum of  
    // square of first n natural number 
    static int findSum(int n) 
    { 
        return (n * (n + 1) * 
        (n + 1) * (n + 2)) / 12; 
    } 
      
    // Driver Program 
    public static void main(String[] args) 
    { 
        int n = 3; 
          
        System.out.println(findSum(n) ); 
    } 
} 
  
// This code is contributed by Arnab Kundu 

