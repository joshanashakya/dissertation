

// Java implementation of the above approach 
import java.util.*; 
  
class GFG  
{ 
  
    // Function to find previous number 
    static void findPrevious(char[] number, int n)  
    { 
        int i, j; 
  
        // I) Start from the right most digit 
        // and find the first digit that is 
        // smaller than the digit next to it. 
        for (i = n - 1; i > 0; i--)  
        { 
            if (number[i] < number[i - 1])  
            { 
                break; 
            } 
        } 
  
        // If no such digit is found 
        // then all digits are in ascending order 
        // means there cannot be a smallest number 
        // with same set of digits 
        if (i == 0) 
        { 
            System.out.print("Previous number is not possible"); 
            return; 
        } 
  
        // II) Find the greatest digit on 
        // right side of (i-1)'th digit that is 
        // smaller than number[i-1] 
        int x = number[i - 1], greatest = i; 
        for (j = i; j < n; j++)  
        { 
            if (number[j] < x && number[j] > number[greatest])  
            { 
                greatest = j; 
            } 
        } 
  
        // III) Swap the above found smallest digit with number[i-1] 
        swap(number, greatest, i - 1); 
  
        // IV) Sort the digits after (i-1) in descending order 
        Arrays.sort(number, i, n); 
        reverse(number, i, n - 1); 
        System.out.print("Greatest smaller number with" +  
              "same set of digits is " + String.valueOf(number)); 
  
        return; 
    } 
  
    static String swap(char[] ch, int i, int j)  
    { 
        char temp = ch[i]; 
        ch[i] = ch[j]; 
        ch[j] = temp; 
        return String.valueOf(ch); 
    } 
  
    static void reverse(char str[], int start, int end)  
    { 
  
        // Temporary variable to store character  
        char temp; 
        while (start <= end) 
        { 
            // Swapping the first and last character  
            temp = str[start]; 
            str[start] = str[end]; 
            str[end] = temp; 
            start++; 
            end--; 
        } 
    } 
      
    // Driver code 
    public static void main(String[] args) 
    { 
        String digits = "262345"; 
        int n = digits.length(); 
  
        findPrevious(digits.toCharArray(), n); 
    } 
} 
  
// This code has been contributed by 29AjayKumar 

