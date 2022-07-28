

// Java implementation to Find the 
// conjugate of a complex number 
  
class GFG 
{ 
    // Function to find conjugate 
    // of a complex number 
    static void solve(String s) 
    { 
        String z = s; 
        int l = s.length(); 
        int i; 
        String str; 
  
        if (s.indexOf('+') != -1) { 
       
            // store index of '+' 
            i = s.indexOf('+'); 
       
            str = s.replace('+', '-'); 
        } 
        else { 
       
            // store index of '-' 
            i = s.indexOf('-'); 
       
            str = s.replace('-', '+'); 
        } 
       
        // print the result 
        System.out.println("Conjugate of "
             + z + " = "
             + str); 
    } 
       
    // Driver code 
    public static void main(String []args) 
    { 
       
        // initialise the complex number 
        String s = "3-4i"; 
       
        solve(s); 
    } 
} 
  
// This code is contributed by chitranayal 

