

// Java program to calculate Nth term of  
// the series: 5, 13, 25, 41, 61... 
  
import java.io.*; 
  
class Nth { 
    public static int nthTerm(int N) 
    { 
        // By using above formula 
        return N * N + (N + 1) * (N + 1); 
    } 
      
    public static void main(String[] args) 
    { 
        int N = 3; // Nth term is 25 
          
        // call and print Nth term 
        System.out.println(nthTerm(N)); 
    }     
} 

