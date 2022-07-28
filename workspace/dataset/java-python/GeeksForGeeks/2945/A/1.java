

// Java implementation of the above approach  
class GfG 
{ 
  
    // Function to reverse the middle x  
    // characters in a string  
    static void reverse(String str, int x)  
    {  
        // Find the position from where  
        // the characters have to be reversed  
        int n = (str.length() - x) / 2;  
      
        // Print the first n characters  
        for (int i = 0; i < n; i++)  
            System.out.print(str.charAt(i));  
      
        // Print the middle x characters in reverse  
        for (int i = n + x - 1; i >= n; i--)  
            System.out.print(str.charAt(i));  
      
        // Print the last n characters  
        for (int i = n + x; i < str.length(); i++)  
            System.out.print(str.charAt(i));  
    }  
  
    // Drived code 
    public static void main(String []args) 
    { 
        String str = "geeksforgeeks";  
        int x = 3;  
        reverse(str, x);  
    } 
} 
  
// This code is contributed by Rituraj Jain 

