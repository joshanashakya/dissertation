

//Java implementation of above approach 
public class AQW { 
  
    //to store fibonacci numbers 
    //42 second number in fibonacci series 
    //largest possible integer 
    static int fib[] = new int[43]; 
  
    //Function to generate fibonacci series 
    static void fibonacci() 
    { 
     fib[0] = 1; 
     fib[1] = 2; 
     for (int i = 2; i < 43; i++) 
         fib[i] = fib[i - 1] + fib[i - 2]; 
    } 
  
    //Recursive function to return the  
    //number of ways  
    static int rec(int x, int y, int last) 
    { 
     // base condition 
     if (y == 0) { 
         if (x == 0) 
             return 1; 
         return 0; 
     } 
     int sum = 0; 
     // for recursive function call 
     for (int i = last; i >= 0 && fib[i] * y >= x; i--) { 
         if (fib[i] > x) 
             continue; 
         sum += rec(x - fib[i], y - 1, i); 
     } 
     return sum; 
    } 
  
    //Driver code 
    public static void main(String[] args) { 
          
        fibonacci(); 
         int n = 13, k = 3; 
         System.out.println("Possible ways are: "+ rec(n, k, 42)); 
  
    } 
  
} 

