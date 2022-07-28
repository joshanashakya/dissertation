

import java.io.*; 
  
// Class to calculate Nth term of series 
class Nth { 
    public int nthTerm(int N) 
    { 
        // By using above formula 
        return (N * ((N % 2) + (N % 3))); 
    } 
} 
  
// Main class for main method 
class GFG { 
  
    public static void main(String[] args) 
    { 
  
        // get the value of N 
        int N = 5; 
  
        // create object of Class Nth 
        Nth a = new Nth(); 
  
        // Calculate and print the Nth term 
        System.out.println("Nth term for N = "
                           + N + " : "
                           + a.nthTerm(N)); 
    } 
} 

