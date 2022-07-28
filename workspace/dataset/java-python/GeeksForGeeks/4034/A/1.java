

// Java program to implement  
// the above approach  
import java.util.*; 
class GfG {  
  
// Function to check if  
// the condition holds  
static boolean check(char s[])  
{  
  
    // Get the length of the string  
    int l = s.length;  
  
    // sort the given string  
    Arrays.sort(s);  
  
    // Iterate for every index and  
    // check for the condition  
    for (int i = 1; i < l; i++) {  
  
        // If are not consecutive  
        if (s[i] - s[i - 1] != 1)  
            return false;  
    }  
  
    return true;  
}  
  
// Driver code  
public static void main(String[] args)  
{  
  
    // 1st example  
    String str = "dcef";  
    if (check(str.toCharArray()) == true)  
        System.out.println("Yes");  
    else
        System.out.println("No");  
  
    // 2nd example  
    String str1 = "xyza";  
  
    if (check(str1.toCharArray()) == true)  
        System.out.println("Yes");  
    else
        System.out.println("No");  
  
}  
}  

