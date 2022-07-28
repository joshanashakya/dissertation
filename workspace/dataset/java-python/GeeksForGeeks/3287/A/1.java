

// Java implementation of the approach  
class GFG  
{ 
      
    // Function to return the  
    // number of substrings of  
    // same characters  
    static void findNumbers(String s)  
    {  
        // Size of the string  
        int n = s.length();  
      
        // Initialize count to 1  
        int count = 1;  
        int result = 0;  
      
        // Initialize left to 0 and  
        // right to 1 to traverse the  
        // string  
        int left = 0;  
        int right = 1;  
      
        while (right < n) 
        {  
      
            // Checking if consecutive  
            // characters are same and  
            // increment the count  
            if (s.charAt(left) == s.charAt(right)) 
            {  
                count++;  
            }  
      
            // When we encounter a  
            // different characters  
            else 
            {  
      
                // Increment the result  
                result += count * (count + 1) / 2;  
      
                // To repeat the whole  
                // process set left equals  
                // right and count variable to 1  
                left = right;  
                count = 1;  
            }  
      
            right++;  
        }  
      
        // Store the final  
        // value of result  
        result += count * (count + 1) / 2;  
      
        System.out.println(result);  
    }  
  
    // Driver code  
    public static void main (String[] args) 
    {  
        String s = "bbbcbb";  
  
        findNumbers(s);  
    }  
} 
  
// This code is contributed by AnkitRai01 

