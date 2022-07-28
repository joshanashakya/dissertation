

// Assuming that integer  
// takes 4 bytes, there  
// can be maximum 10 
// digits in a integer 
class GFG 
{ 
static int MAX = 11; 
  
static boolean isMultipleof5(int n) 
{ 
    char str[] = new char[MAX]; 
    int len = str.length; 
      
    // Check the last  
    // character of string 
    if (str[len - 1] == '5' ||  
        str[len - 1] == '0' ) 
          
        return true; 
      
    return false; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int n = 19; 
    if ( isMultipleof5(n) == true ) 
        System.out.println(n +" is multiple " + 
                                       "of 5"); 
    else
        System.out.println(n +" is not a " + 
                           "multiple of 5"); 
} 
} 
  
// This code is contributed by mits 

