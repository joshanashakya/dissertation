

// Java program to check if one number is  
// power of other  
import java.util.*; 
  
class new_file 
{ 
    static boolean isGreaterThanEqual(String s1,  
                                      String s2)  
    { 
        if (s1.length() > s2.length()) 
            return true; 
        if (s1.compareTo(s2) == 0) 
            return true; 
        return false; 
    } 
  
    static String multiply(String s1, String s2)  
    { 
        int n = s1.length(); 
        int m = s2.length(); 
  
        int[] result = new int[n + m]; 
  
        // Multiply the numbers. It multiplies 
        // each digit of second string to each 
        // digit of first and stores the result. 
        for (int i = n - 1; i >= 0; i--) 
            for (int j = m - 1; j >= 0; j--) 
                result[i + j + 1] += (s1.charAt(i) - '0') * 
                                     (s2.charAt(j) - '0'); 
  
        // If the digit exceeds 9, add the 
        // cumulative carry to previous digit. 
        int size = result.length; 
        for (int i = size - 1; i > 0; i--)  
        { 
            if (result[i] >= 10) 
            { 
                result[i - 1] += result[i] / 10; 
                result[i] = result[i] % 10; 
            } 
        } 
  
        int i = 0; 
        while (i < size && result[i] == 0) 
            i++; 
  
        // if all zeroes, return "0". 
        if (i == size) 
            return "0"; 
  
        String temp = ""; 
  
        // Remove starting zeroes. 
        while (i < size) 
        { 
            temp += Integer.toString(result[i]); 
            i++; 
        } 
        return temp; 
    } 
  
    // Removes Extra zeroes from front of a string. 
    static String removeLeadingZeores(String s)  
    { 
        int n = s.length(); 
        int i = 0; 
        while (i < n && s.charAt(i) == '0') 
            i++; 
        if (i == n) 
            return "0"; 
        String temp = ""; 
        while (i < n)  
        { 
            temp += s.charAt(i); 
            i++; 
        } 
  
        return temp; 
    } 
  
    static boolean isPower(String s1, String s2)  
    { 
  
        // Make sure there are no leading zeroes 
        // in the string. 
        s1 = removeLeadingZeores(s1); 
        s2 = removeLeadingZeores(s2); 
        if (s1 == "0" || s2 == "0") 
            return false; 
        if (s1 == "1" && s2 == "1") 
            return true; 
        if (s1 == "1" || s2 == "1") 
            return true; 
  
        // Making sure that s1 is smaller. 
        // If it is greater, we recur we 
        // reversed parameters. 
        if (s1.length() > s2.length()) 
            return isPower(s2, s1); 
  
        String temp = new String(s1); 
        while (!isGreaterThanEqual(s1, s2)) 
            s1 = multiply(s1, temp); 
  
        if (s1.compareTo(s2) == 0) 
            return true; 
        return false; 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        String s1 = "374747", s2 = "52627712618930723"; 
        if (isPower(s1, s2)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
  
        s1 = "4099"; 
        s2 = "2"; 
  
        if (isPower(s1, s2)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
} 
  
// This code is contributed by 
// sanjeev2552 

