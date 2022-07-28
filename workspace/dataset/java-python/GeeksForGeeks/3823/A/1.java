

// Java program to find x y z that 
// satisfies 2/n = 1/x + 1/y + 1/z... 
import java.io.*; 
  
class Sums { 
    // function to find x y and z that 
    // satisfy given equation. 
    static void printXYZ(int n){ 
        if (n == 1) 
            System.out.println(-1); 
        else{ 
        System.out.println("x is "+ n); 
        System.out.println("y is "+ (n+1)); 
        System.out.println("z is "+ (n * (n + 1))); 
        } 
    } 
    // Driver program to test the above function 
    public static void main (String[] args) { 
        int n = 7; 
        printXYZ(n); 
    } 
} 
  
// This code is contributed by Chinmoy Lenka 

