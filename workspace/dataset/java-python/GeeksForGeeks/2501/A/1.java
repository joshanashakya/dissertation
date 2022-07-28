

// Java program to print all the numbers 
// divisible by 3 and 5 for a given number 
  
class GFG{ 
      
    // Result function with N 
    static void result(int N) 
    {      
        // iterate from 0 to N 
        for (int num = 0; num < N; num++) 
        {      
            // Short-circuit operator is used  
            if (num % 3 == 0 && num % 5 == 0) 
                System.out.print(num + " "); 
        } 
    } 
       
    // Driver code 
    public static void main(String []args) 
    { 
        // input goes here 
        int N = 100; 
           
        // Calling function 
        result(N); 
    } 
} 

