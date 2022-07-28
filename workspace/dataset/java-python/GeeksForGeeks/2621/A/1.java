

// Java program to find the maximum product subString 
  
class GFG{ 
   
// Function to return the value of a character 
static int value(char x) 
{ 
    return (int)(x - 'a'); 
} 
   
// Function to find the maximum product subString 
static String maximumProduct(String str, int n) 
{ 
    // To store subStrings 
    String answer = "", curr = ""; 
    long maxProduct = 0, product = 1; 
   
    for (int i = 0; i < n; i++) { 
        product *= 1L * value(str.charAt(i)); 
   
        curr += str.charAt(i); 
   
        // Check if current product is maximum 
        // possible or not 
        if (product >= maxProduct) { 
            maxProduct = product; 
            answer = curr; 
        } 
   
        // If product is 0 
        if (product == 0) { 
            product = 1; 
            curr = ""; 
        } 
    } 
   
    // Return the subString with maximum product 
    return answer; 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    String str = "sdtfakdhdahdzz"; 
   
    int n = str.length(); 
   
    // Function call 
    System.out.print(maximumProduct(str, n) +"\n"); 
   
} 
} 
  
// This code is contributed by 29AjayKumar 

