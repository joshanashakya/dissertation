

// Java program to find the real and 
// imaginary parts of a Complex Number  
class GFG 
{ 
    // Function to find real and imaginary 
    // parts of a complex number 
    static void findRealAndImag(String s) 
    { 
        // string length stored in variable l 
        int l = s.length(); 
       
        // variable for the index of the separator 
        int i; 
       
        // Storing the index of '+' 
        if (s.indexOf('+') != -1) { 
            i = s.indexOf('+'); 
        } 
  
        // else storing the index of '-' 
        else { 
            i = s.indexOf('-'); 
        } 
        
        // Finding the real part 
        // of the complex number 
        String real = s.substring(0, i); 
       
        // Finding the imaginary part 
        // of the complex number 
        String imaginary = s.substring(i + 1, l - 1); 
       
        System.out.println("Real part: " + real ); 
        System.out.println("Imaginary part: "+ 
              imaginary); 
    } 
       
    // Driver code 
    public static void main(String []args) 
    { 
        String s = "3+4i"; 
       
        findRealAndImag(s); 
      
    } 
} 
  
// This code is contributed by chitranayal 

