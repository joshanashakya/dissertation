

// Java implementation of the approach 
  
import java.io.*; 
  
class GFG { 
  
// Function to return the required number 
static String getNumber(String s) 
{ 
    int number_of_digits = s.length(); 
  
    int freq[] = new int[10]; 
  
    // Count the frequency of each digit 
    for (int i = 0; i < number_of_digits; i++) { 
        if (s.charAt(i) == '1'
            || s.charAt(i) == '2'
            || s.charAt(i) == '3'
            || s.charAt(i) == '5'
            || s.charAt(i) == '7') { 
            freq[s.charAt(i) - 48] += 1; 
        } 
  
        // 4! can be expressed as 2! * 2! * 3! 
        if (s.charAt(i) == '4') { 
            freq[2] += 2; 
            freq[3]++; 
        } 
  
        // 6! can be expressed as 5! * 3! 
        if (s.charAt(i) == '6') { 
            freq[5]++; 
            freq[3]++; 
        } 
  
        // 8! can be expressed as 7! * 2! * 2! * 2! 
  
        if (s.charAt(i) == '8') { 
            freq[7]++; 
            freq[2] += 3; 
        } 
  
        // 9! can be expressed as 7! * 3! * 3! * 2! 
  
        if (s.charAt(i) == '9') { 
            freq[7]++; 
            freq[3] += 2; 
            freq[2]++; 
        } 
    } 
  
    // To store the required number 
    String t = ""; 
  
    // If number has only either 1 and 0 as its digits 
    if (freq[1] == number_of_digits 
        || freq[0] == number_of_digits 
        || (freq[0] + freq[1]) == number_of_digits) { 
        return s; 
    } 
    else { 
  
        // Generate the greatest number possible 
        for (int i = 9; i >= 2; i--) { 
            int ctr = freq[i]; 
            while ((ctr--)>0) { 
                t += (char)(i + 48); 
            } 
        } 
  
        return t; 
    } 
} 
  
    // Driver code 
  
    public static void main (String[] args) { 
            String s = "1280"; 
    System.out.println(getNumber(s)); 
    } 
} 
  
// This code is contributed by anuj_67.. 

