

// A simple Java program to find index of given 
// Fibonacci number 
public class Fibonacci 
{ 
  
  static int findIndex(int n) 
  { 
    float fibo = 2.078087F * (float) Math.log(n) + 1.672276F; 
  
    // returning rounded off value of index 
    return Math.round(fibo); 
  } 
  
  public static void main(String[] args) 
  { 
    int result = findIndex(55); 
    System.out.println(result); 
  } 
} 

