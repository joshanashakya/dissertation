

// Java program for the above approach  
class GFG  
{ 
      
    // Function to check if  
    // Binary string can be  
    // made equal  
    static String canMake(String s)  
    {  
      
        int o = 0, z = 0;  
      
        // Counting occurence of  
        // zero and one in binary  
        // string  
        for (int i = 0; i < s.length(); i++)  
        {  
            if (s.charAt(i) - '0' == 1)  
                o++;  
            else
                z++;  
        }  
      
        // From above observation  
        if (o % 2 == 1 && z % 2 == 1)  
            return "NO";  
        else
            return "YES";  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
      
        String s = "01011";  
        System.out.println(canMake(s)) ;  
          
    }  
} 
  
// This code is contributed by AnkitRai01 

