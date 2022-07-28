

// Java code to check if a Octal 
// number is Even or Odd 
class GFG{ 
   
// Check if the number is odd or even 
static String even_or_odd(String N) 
{ 
    int len = N.length(); 
   
    // Check if the last digit 
    // is either '0', '2', '4', 
    // or '6' 
    if (N.charAt(len - 1) == '0'
        || N.charAt(len - 1) == '2'
        || N.charAt(len - 1) == '4'
        || N.charAt(len - 1) == '6') 
        return ("Even"); 
    else
        return ("Odd"); 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    String N = "735"; 
   
    System.out.print(even_or_odd(N)); 
} 
} 
  
// This code is contributed by Rajput-Ji 

