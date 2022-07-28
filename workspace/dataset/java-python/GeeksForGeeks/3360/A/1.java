

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
  
// Function to check alphanumeric 
// equality of both strings 
static boolean CompareAlphanumeric(char[] str1,  
                                   char[] str2)  
{ 
    // variable declaration 
    int i, j; 
    i = 0; 
    j = 0; 
  
    // Length of first string 
    int len1 = str1.length; 
  
    // Length of second string 
    int len2 = str2.length; 
  
    // To check each and every characters 
    // of both string 
    while (i <= len1 && j <= len2)  
    { 
  
        // If the current character of the first string is not an 
        // alphanumeric character, increase the pointer i 
        while (i < len1 && (!((str1[i] >= 'a' && str1[i] <= 'z') ||  
                              (str1[i] >= 'A' && str1[i] <= 'Z') ||  
                              (str1[i] >= '0' && str1[i] <= '9')))) 
        { 
            i++; 
        } 
  
        // If the current character of the second string is not an 
        // alphanumeric character, increase the pointer j 
        while (j < len2 && (!((str2[j] >= 'a' && str2[j] <= 'z') ||  
                              (str2[j] >= 'A' && str2[j] <= 'Z') ||  
                              (str2[j] >= '0' && str2[j] <= '9')))) 
        { 
            j++; 
        } 
  
        // if all alphanumeric characters of  
        // both strings are same then return true 
        if (i == len1 && j == len2) 
        { 
            return true; 
        }  
          
        // if any alphanumeric characters of  
        // both strings are not same then return false 
        else if (str1[i] != str2[j])  
        { 
            return false; 
        }  
          
        // If current character matched, 
        // increase both pointers to  
        // check the next character 
        else 
        { 
            i++; 
            j++; 
        } 
    } 
  
    // If not same, then return false 
    return false; 
} 
  
// Function to print Equal or Unequal 
// if strins are same or not 
static void CompareAlphanumericUtil(String str1,  
                                    String str2) 
{ 
    boolean res; 
  
    // check alphanumeric equality of both strings 
    res = CompareAlphanumeric(str1.toCharArray(),  
                              str2.toCharArray()); 
  
    // if both are alphanumeric equal,  
    // print Equal 
    if (res == true)  
    { 
        System.out.println("Equal"); 
    }  
      
    // otherwise print Unequal 
    else
    { 
        System.out.println("Unequal"); 
    } 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    String str1, str2; 
  
    str1 = "Ram, Shyam"; 
    str2 = " Ram - Shyam."; 
    CompareAlphanumericUtil(str1, str2); 
  
    str1 = "abc123"; 
    str2 = "123abc"; 
    CompareAlphanumericUtil(str1, str2); 
} 
}  
  
// This code is contributed by Rajput-Ji 

