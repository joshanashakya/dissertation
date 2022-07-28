

// Java code 
class GfG { 
  
    public static void main(String[] args) 
    { 
        int a = 10, b = 5; 
        if (b > 0) { 
            while (b > 0) { 
                a++; 
                b--; 
            } 
        } 
        if (b < 0) { // when 'b' is negative 
            while (b < 0) { 
                a--; 
                b++; 
            } 
        } 
        System.out.println("Sum is: " + a); 
    } 
} 
  
// This code is contributed by Abhijeet Soni 

