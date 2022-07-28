

// Java program to find  
// whether a number 
// is power of 2 or not  
class GfG 
{ 
  
// Function to check whether a 
// number is power of 2 or not 
static long ispowerof2 ( long num ) 
{ 
    if ((num & (num - 1)) == 0) 
        return 1; 
    return 0;  
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    long num = 549755813888L; 
    System.out.println(ispowerof2(num)); 
} 
} 
  
// This code has been contributed by 29AjayKumar 

