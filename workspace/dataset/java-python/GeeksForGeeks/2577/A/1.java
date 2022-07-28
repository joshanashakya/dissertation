

// Java program to find log(a) on any base b  
class GFG  
{ 
      
    static int log_a_to_base_b(int a, int b)  
    {  
        return (int)(Math.log(a) / Math.log(b));  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        int a = 3;  
        int b = 2;  
        System.out.println(log_a_to_base_b(a, b));  
      
        a = 256;  
        b = 4;  
        System.out.println(log_a_to_base_b(a, b));  
    }  
} 
  
// This code is contributed by AnkitRai01 

