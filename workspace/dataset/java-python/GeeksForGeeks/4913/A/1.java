

// Java implementation of the approach  
  
public class  GFG { 
  
    // Function to print the expansion of the string  
    static void printExpansion(String str)  
    {  
        for (int i = str.length() - 1; i >= 0; i--) {  
      
            // Take sub-string from i to n-1  
            String subStr = str.substring(i);  
      
            // Print the sub-string  
            System.out.print(subStr);  
  
        }  
    }  
  
    // Driver code  
    public static void main(String args[])   
    {  
        String str = "geeks";  
        printExpansion(str);  
      
    }  
    // This code is contributed by Ryuga 
} 

