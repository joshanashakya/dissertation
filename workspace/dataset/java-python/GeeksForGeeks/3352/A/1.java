

// Java program to validate the time in 
// 12-hour format using Regular Expression. 
  
import java.util.regex.*; 
  
class GFG { 
  
    // Function to validate the time in 12-hour format. 
    public static boolean isValidTime(String time) 
    { 
  
        // Regex to check valid time in 12-hour format. 
        String regexPattern 
            = "(1[012]|[1-9]):"
              + "[0-5][0-9](\\s)"
              + "?(?i)(am|pm)"; 
  
        // Compile the ReGex 
        Pattern compiledPattern 
            = Pattern.compile(regexPattern); 
  
        // If the time is empty 
        // return false 
        if (time == null) { 
            return false; 
        } 
  
        // Pattern class contains matcher() method 
        // to find matching between given time 
        // and regular expression. 
        Matcher m = compiledPattern.matcher(time); 
  
        // Return if the time 
        // matched the ReGex 
        return m.matches(); 
    } 
  
    // Driver Code. 
    public static void main(String args[]) 
    { 
  
        // Test Case 1: 
        String str1 = "12:15 AM"; 
        System.out.println(isValidTime(str1)); 
  
        // Test Case 2: 
        String str2 = "9:45PM"; 
        System.out.println(isValidTime(str2)); 
  
        // Test Case 3: 
        String str3 = "1:15"; 
        System.out.println(isValidTime(str3)); 
  
        // Test Case 4: 
        String str4 = "17:30"; 
        System.out.println(isValidTime(str4)); 
    } 
} 

