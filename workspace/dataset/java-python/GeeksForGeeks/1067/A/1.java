

// Java implementation of the above approach  
public class GfG{ 
  
    // Check if it is possible to display the number  
    public static String LedRequired(String s, int led)  
    {  
        // Pre-computed values of segment used by digit 0 to 9.  
        int seg[] = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 };  
  
        int count = 0;  
        // Finding sum of the segments used by  
        // each digit of the number  
        for (int i = 0; i < s.length(); ++i) {  
            count += seg[(int)(s.charAt(i)) - 48];  
        }  
        
        if (count <= led)  
            return "YES";  
        else
            return "NO";  
    }  
  
    public static void main(String []args){ 
          
        String S = "123456789";  
        int led = 20;  
        
        // Function call to print required answer  
        System.out.println(LedRequired(S, led)); 
    } 
} 
  
// This code is contributed by Rituraj Jain 

