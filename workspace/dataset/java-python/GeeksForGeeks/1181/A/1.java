

// Java program to accept String  
// starting with Capital letter  
class GFG 
{ 
      
    // Function to check if first  
    // character is Capital  
    static int checkIfStartsWithCapital(String str)  
    {  
      
        if (str.charAt(0) >= 'A' && str.charAt(0)<= 'Z')  
            return 1;  
        else
            return 0;  
    }  
      
    // Function to check  
    static void check(String str)  
    {  
        if (checkIfStartsWithCapital(str) == 1)  
            System.out.println("Accepted");  
        else
            System.out.println("Not Accepted");  
    }  
      
    // Driver function  
    public static void main (String[] args) 
    {  
        String str = "GeeksforGeeks";  
        check(str);  
      
        str = "geeksforgeeks";  
        check(str);  
    }  
} 
  
// This code is contributed by AnkitRai01 

