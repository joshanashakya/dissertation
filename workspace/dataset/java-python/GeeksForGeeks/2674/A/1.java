

// Java implementation of the approach 
class GFG  
{ 
  
// Function to return the required position  
static int lenDoubleString(String s)  
{  
  
    int l = s.length();  
    String first_half = s.substring(0, l / 2);  
    String second_half = "";  
  
    if (l % 2 == 0)  
        second_half = s.substring(l / 2);  
    else
        second_half = s.substring(l / 2 + 1);  
  
    second_half = reverse(second_half);  
  
    // Print the double String  
    System.out.println(first_half + second_half);  
  
    // Print the length of the double String  
    if (l % 2 == 0)  
        System.out.println(l);  
    else
        System.out.println(l - 1);  
        return Integer.MIN_VALUE; 
}  
static String reverse(String input)  
{ 
    char[] temparray = input.toCharArray(); 
    int left, right = 0; 
    right = temparray.length - 1; 
  
    for (left = 0; left < right; left++, right--)  
    { 
        // Swap values of left and right  
        char temp = temparray[left]; 
        temparray[left] = temparray[right]; 
        temparray[right] = temp; 
    } 
    return String.valueOf(temparray); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    String n = "abba";  
    lenDoubleString(n);  
  
    n = "abcdedcba";  
    lenDoubleString(n);  
} 
} 
  
// This code contributed by Rajput-Ji 

