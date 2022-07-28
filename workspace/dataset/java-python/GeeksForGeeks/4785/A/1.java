

// Java program to find max between 
// two Rational numbers 
  
import java.io.*; 
import java.util.*; 
  
class Fraction { 
      
 int num, den; 
  
//Constructor 
Fraction(int n,int d){ 
    num=n; 
    den=d; 
} 
  
 // Get max of the two fractions 
static Fraction maxFraction(Fraction first, Fraction sec) 
{ 
    // Declare nume1 and nume2 for get the value of 
    // first numerator and second numerator 
    int a = first.num; 
    int b = first.den; 
    int c = sec.num; 
    int d = sec.den; 
   
    // Compute ad-bc 
    int Y = a * d - b * c; 
   
    return (Y > 0) ? first : sec; 
} 
  
// Driver function 
public static void main (String[] args) { 
  
   Fraction first = new Fraction( 3, 2 ); 
   Fraction sec = new Fraction( 3, 4 ); 
   
    Fraction res = maxFraction(first, sec); 
    System.out.println(res.num +"/"+ res.den);  
      
} 
} 
  
// This code is contributed by Gitanjali. 

