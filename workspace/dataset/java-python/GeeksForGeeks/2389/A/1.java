

// Java program to find closest 
// tidy number smaller than the  
// given number 
import java.io.*; 
class GFG 
{ 
static String tidyNum(String str1, 
                      int len) 
{ 
    char[] str = str1.toCharArray(); 
    for (int i = len - 2; i >= 0; i--) 
    { 
        // check whether string  
        // violates tidy property 
        if (str[i] > str[i + 1]) 
        { 
            // if string violates tidy  
            // property, then decrease the 
            // value stored at that index  
            // by 1 and replace all the value  
            // stored right to that index by 9 
            str[i]--; 
            for (int j = i + 1; j < len; j++) 
                str[j] = '9'; 
        } 
    } 
    return String.valueOf(str); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    String str = "11333445538"; 
    int len = str.length(); 
      
    // num will store closest tidy number 
    System.out.println(tidyNum(str, len)); 
}  
} 
  
// This code is contributed by mits 

