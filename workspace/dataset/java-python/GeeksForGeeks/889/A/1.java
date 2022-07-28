

/* Java program to find whether a number   
    is power of 2 or not */
import java.util.*; 
  
class GFG 
{ 
      
// returns 1 when str is power of 2 
// return 0 when str is not a power of 2 
static int isPowerOf2(String s) 
{ 
    char []str = s.toCharArray(); 
    int len_str = s.length(); 
  
    // sum stores the intermediate dividend while 
    // dividing. 
    int num = 0; 
  
    // if the input is "1" then return 0 
    // because 2^k = 1 where k >= 1 and here k = 0 
    if (len_str == 1 && str[len_str - 1] == '1') 
        return 0; 
  
    // Divide the number until it gets reduced to 1 
    // if we are successfully able to reduce the number 
    // to 1 it means input string is power of two if in  
    // between an odd number appears at the end it means  
    // string is not divisible by two hence not a power 
    // of 2. 
    while (len_str != 1 || str[len_str - 1] != '1') 
    { 
  
        // if the last digit is odd then string is not 
        // divisible by 2 hence not a power of two  
        // return 0. 
        if ((str[len_str - 1] - '0') % 2 == 1) 
            return 0; 
  
        // divide the whole string by 2. i is used to 
        // track index in current number. j is used to 
        // track index for next iteration. 
        int j = 0; 
        for (int i = 0; i < len_str; i++)  
        { 
            num = num * 10 + (int)str[i] - (int)'0'; 
              
            // if num < 2 then we have to take another digit 
            // to the right of A[i] to make it bigger than  
            // A[i]. E. g. 214 / 2 --> 107 
            if (num < 2)  
            { 
  
                // if it's not the first index. E.g 214 
                // then we have to include 0. 
                if (i != 0) 
                    str[j++] = '0';      
  
                // for eg. "124" we will not write 064 
                // so if it is the first index just ignore 
                continue; 
            } 
  
            str[j++] = (char)((int)(num / 2) + (int)'0'); 
            num = (num) - (num / 2) * 2; 
        } 
  
        str[j] = '\0'; 
  
        // After every division by 2 the  
        // length of string is changed. 
        len_str = j; 
    } 
  
    // if the string reaches to 1 then the str is 
    // a power of 2. 
    return 1; 
} 
  
// Driver code. 
public static void main (String[] args)  
{ 
    String str1 = "124684622466842024680246842024662202000002"; 
    String str2 = "1"; 
    String str3 = "128"; 
  
    System.out.println(isPowerOf2(str1) +  
                "\n"+isPowerOf2(str2) +  
                "\n"+isPowerOf2(str3)); 
} 
} 
  
// This code is contributed by mits 

