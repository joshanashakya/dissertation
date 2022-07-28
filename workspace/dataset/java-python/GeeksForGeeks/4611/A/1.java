

// Java implementation to demonstrate working 
// of Cassini’s Identity  
  
class Gfg 
{ 
    // Returns (-1)^n 
    static int cassini(int n) 
    { 
       return (n & 1) != 0 ? -1 : 1; 
    }  
  
    // Driver method 
    public static void main(String args[]) 
    { 
         int n = 5; 
         System.out.println(cassini(n)); 
    } 
} 

