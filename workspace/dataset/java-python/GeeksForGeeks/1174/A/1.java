

// program to get toggle case of a string 
  
public class Test 
{ 
      
    static int x=32; 
      
    // tOGGLE cASE = swaps CAPS to lower 
    // case and lower case to CAPS 
    static String toggleCase(char[] a) 
    { 
        for (int i=0; i<a.length; i++) { 
        
            // Bitwise EXOR with 32 
            a[i]^=32; 
        } 
        return new String(a); 
    } 
      
    /* Driver program */
    public static void main(String[] args)  
    { 
        String str = "CheRrY"; 
        System.out.print("Toggle case: "); 
        str = toggleCase(str.toCharArray()); 
        System.out.println(str); 
          
        System.out.print("Original string: "); 
        str = toggleCase(str.toCharArray()); 
        System.out.println(str);     
    } 
} 

