

// Java program to calculate discriminant 
public class Discriminant{ 
      
    // function to calculate discriminant 
    static int disc(int a, int b, int c){ 
        int dis = (int)Math.pow(b,2) - (4*a*c); 
        return dis; 
    } 
  
    // Driver Code 
    public static void main(String args[]){ 
        int a=20; 
        int b=30; 
        int c=10; 
        int discriminant = disc(a, b, c); 
        if (discriminant > 0){ 
            System.out.println("Discriminant is " + discriminant  
                    + " which is Positive"); 
            System.out.println("Hence Two Solutions"); 
        } 
        else if (discriminant == 0){ 
            System.out.println("Discriminant is " + discriminant 
                    + " which is Zero"); 
            System.out.println("Hence One Solution"); 
        } 
        else { 
            System.out.println("Discriminant is "+ discriminant  
                    + " which is Negative"); 
            System.out.println("Hence No Real Solutions"); 
        } 
    } 
} 

