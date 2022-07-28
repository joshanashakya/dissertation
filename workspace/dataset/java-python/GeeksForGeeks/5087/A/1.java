

// Java program to find maximum and  
// minimum using Absolute function  
class GFG 
{ 
      
    // Function to return maximum  
    // among the two numbers  
    static int maximum(int x, int y)  
    {  
            return ((x + y + Math.abs(x - y)) / 2);  
    }  
      
    // Function to return minimum  
    // among the two numbers  
    static int minimum(int x, int y)  
    {  
            return ((x + y - Math.abs(x - y)) / 2);  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        int x = 99, y = 18;  
      
        // Displaying the maximum value  
        System.out.println("Maximum: " + maximum(x, y));  
      
        // Displaying the minimum value  
        System.out.println("Minimum: " + minimum(x, y));  
    }  
} 
  
// This code is contributed by AnkitRai01 

