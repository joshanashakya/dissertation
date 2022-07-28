

// Java implementation of the approach 
class GFG { 
  
    // Array to store how many times a button 
    // has to be pressed for typing 
    // a particular character 
    static final int arr[] = { 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 
                               2, 3, 1, 2, 3, 4, 1, 2, 3, 1, 2, 3, 4 }; 
  
    // Function to return the count of 
    // buttons pressed to type the given string 
    public static int countKeyPressed(String str, int len) 
    { 
        int count = 0; 
  
        // Count the key presses 
        for (int i = 0; i < len; i++) 
            count = count + arr[str.charAt(i) - 'a']; 
  
        // Return the required count 
        return count; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        String str = "abcdef"; 
        int len = str.length(); 
        System.out.print(countKeyPressed(str, len)); 
    } 
} 

