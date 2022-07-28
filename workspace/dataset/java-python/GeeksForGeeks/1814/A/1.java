

// Java program to check if given  
// number is in given base or not. 
class Geeks { 
      
static boolean isInGivenBase(String str, int base) 
{ 
      
    // Allowed bases are till 16 (Hexadecimal) 
    if (base > 16) 
    return false; 
  
    // If base is below or equal to 10, then all 
    // digits should be from 0 to 9. 
    else if (base <= 10)  
    { 
    for (int i = 0; i < str.length(); i++) 
        if (!(str.charAt(i) >= '0' && 
              str.charAt(i) < ('0' + base))) 
            return false; 
    } 
  
    // If base is below or equal to 16, then all 
    // digits should be from 0 to 9 or from 'A'  
    else
    { 
    for (int i = 0; i < str.length(); i++) 
        if (! ((str.charAt(i) >= '0' && 
                str.charAt(i) < ('0' + base)) ||                              
                (str.charAt(i) >= 'A' &&  
                 str.charAt(i) < ('A' + base - 10)) 
            ))              
            return false; 
    } 
    return true;  
} 
  
// Driver Class 
public static void main(String args[]) 
  
{ 
    String str = "AF87"; 
    if (isInGivenBase(str, 16) == true) 
    System.out.println("Yes"); 
    else
    System.out.println("No"); 
      
} 
} 
  
// This code is contributed by ankita_saini 

