

// Java program to find the Nth term 
import java.io.*; 
  
// calculate Nth term of this series 
// 1, 1, 2, 6, 24... 
class Nth { 
    public int nthTerm(int N) 
    { 
        // By using above formula 
        if (N <= 1) 
            return 1; 
  
        int i, fact = 1; 
        for (i = 1; i < N; i++) 
            fact = fact * i; 
  
        return fact; 
    } 
} 
// Main class for main method 
class GFG { 
  
    public static void main(String[] args) 
    { 
  
        int N = 3; 
  
        // create object of Class Nth 
        Nth a = new Nth(); 
  
        // call and print Nth term 
        System.out.println(a.nthTerm(N)); 
    } 
} 

