

// Java implementation of the above approach 
class GFG { 
      
    // stick[] stores the count 
    // of matchsticks required to 
    // represent the alphabets 
    static int sticks[] = { 6, 7, 4, 6, 5, 4, 6, 
                     5, 2, 4, 4, 3, 6, 6, 
                     6, 5, 7, 6, 5, 3, 5, 
                     4, 6, 4, 3, 4 }; 
      
    // number[] stores the count 
    // of matchsticks required to 
    // represent the numerals 
    static int number[] = { 6, 2, 5, 5, 4, 5, 6, 
                     3, 7, 6 }; 
      
    // Function that return the count of 
    // sticks required to represent 
    // the given string 
    static int countSticks(String str) 
    { 
        int cnt = 0; 
      
        // For every char of the given 
        // string 
        for (int i = 0; i < str.length(); i++) { 
      
            char ch = str.charAt(i); 
      
            // Add the count of sticks 
            // required to represent the 
            // current character 
            if (ch >= 'A' && ch <= 'Z') { 
                cnt += sticks[ch - 'A']; 
            } 
            else { 
                cnt += number[ch - '0']; 
            } 
        } 
        return cnt; 
    } 
      
    // Driver code 
    public static void main (String[] args)  
    { 
        String str = "GEEKSFORGEEKS"; 
      
        // Function call to find the 
        // count of matchsticks 
        System.out.println(countSticks(str)); 
      
    } 
} 
  
// This code is contributed by AnkitRai01 

