

// Java program to count number of 
// substring which are even integer 
// in a string of digits. 
public class GFG { 
      
    // Return the even number substrings. 
    static int evenNumSubstring(String str) 
    { 
        int len = str.length(); 
        int count = 0; 
      
        for (int i = 0; i < len; i++) 
        { 
            int temp = str.charAt(i) - '0'; 
      
            // If current digit is even, add 
            // count of substrings ending with 
            // it. The count is (i+1) 
            if (temp % 2 == 0) 
                count += (i + 1); 
        } 
      
        return count; 
    } 
      
    public static void main(String args[]) 
    { 
          
        String str= "1234"; 
          
        System.out.println(evenNumSubstring(str)); 
    } 
} 
  
// This code is contributed by Sam007. 

