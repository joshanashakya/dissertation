

// Java program to find highest power 
// of 2 that divides n. 
   
class GFG 
{ 
       
static int highestPowerOf2(int n) 
{ 
    return (n & (~(n - 1))); 
} 
   
public static void main(String []args) 
{  
    int n = 48; 
    System.out.println(highestPowerOf2(n)); 
} 
} 
  

