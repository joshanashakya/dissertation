

// Java program to check if the first and the last 
// characters of a string are equal or not. 
class GFG { 
    public static int areCornerEqual(String s) 
    { 
        int n = s.length(); 
        if (n < 2) 
           return -1; 
        if (s.charAt(0) == s.charAt(n-1)) 
           return 1; 
        else
           return 0; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        String s = "GfG"; 
        int res = areCornerEqual(s); 
        if (res == -1) 
            System.out.println("Invalid Input"); 
        else if (res == 1) 
            System.out.println("Equal"); 
        else
            System.out.println("Not Equal"); 
    } 
} 

