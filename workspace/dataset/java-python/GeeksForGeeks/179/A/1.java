

// Java code to check if a HexaDecimal 
// number is Even or Odd 
class GFG{ 
   
// Check if the number is odd or even 
static String even_or_odd(String N) 
{ 
    int len = N.length(); 
   
    // check if the last digit 
    // is either '0', '2', '4', 
    // '6', '8', 'A'(=10), 
    // 'C'(=12) or 'E'(=14) 
    if (N.charAt(len - 1) == '0'
        || N.charAt(len - 1) == '2'
        || N.charAt(len - 1) == '4'
        || N.charAt(len - 1) == '6'
        || N.charAt(len - 1) == '8'
        || N.charAt(len - 1) == 'A'
        || N.charAt(len - 1) == 'C'
        || N.charAt(len - 1) == 'E') 
        return ("Even"); 
    else
        return ("Odd"); 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    String N = "AB3454D"; 
    System.out.print(even_or_odd(N)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

