

// Java program to find product  
// of ASCII value of characters  
// in string  
class GFG  
{ 
  
// Function to find product 
// of ASCII value of characters 
// in string 
static long productAscii(String str) 
{ 
    long prod = 1; 
  
    // Traverse string to find the product 
    for (int i = 0; i < str.length(); i++)  
    { 
        prod *= str.charAt(i); 
    } 
  
    // Return the product 
    return prod; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    String str = "GfG";  
      
    System.out.println(productAscii(str)); 
} 
} 
  
// This code is contributed by Bilal 

