

// Java program to count 
// substrings with  
// recursive sum equal to 9 
import java.io.*; 
  
class GFG 
{ 
static int count9s(String number) 
{ 
    // To store result 
    int count = 0;  
    int n = number.length(); 
  
    // Consider every character  
    // as beginning of substring 
    for (int i = 0; i < n; i++) 
    { 
        // sum of digits in 
        // current substring 
        int sum = number.charAt(i) - '0';  
  
        if (number.charAt(i) == '9')  
            count++; 
  
        // One by one choose  
        // every character as  
        // an ending character 
        for (int j = i + 1; 
                 j < n; j++) 
        { 
            // Add current digit to  
            // sum, if sum becomes  
            // multiple of 5 then  
            // increment count. Let 
            // us do modular arithmetic  
            // to avoid overflow for  
            // big strings 
            sum = (sum + 
                   number.charAt(j) -  
                            '0') % 9; 
  
            if (sum == 0) 
            count++; 
        } 
    } 
    return count; 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
    System.out.println(count9s("4189")); 
    System.out.println(count9s("1809")); 
} 
} 
  
// This code is contributed  
// by anuj_67. 

