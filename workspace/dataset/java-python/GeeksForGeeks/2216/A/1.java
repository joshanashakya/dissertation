

// Java implementation of the approach  
class GfG 
{ 
  
    // Function to print the two parts  
    static void twoParts(String str)  
    {  
        int flag = 0;  
        String a = ""; 
        char[] gfg = str.toCharArray(); 
      
        // Find the position of 4  
        for (int i = 0; i < str.length(); i++)  
        {  
            if (gfg[i] == '4')  
            {  
                gfg[i] = '3';  
                a += '1';  
                flag = 1;  
            }  
      
            // If current character is not '4'  
            // but appears after the first  
            // occurrence of '4'  
            else if (flag != 0)  
                a += '0';  
        } 
          
        str = new String(gfg); 
      
        // Print both the parts  
        System.out.print(str + " " + a);  
    }  
  
    // Driver code 
    public static void main(String []args) 
    { 
        String str = "9441";  
        twoParts(str);  
    } 
} 
  
// This code is contributed by Rituraj Jain 

