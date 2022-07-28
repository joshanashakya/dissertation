

// Java program to find all pairs 
// with given GCD and LCM. 
public class GCD 
{ 
    // Java function to calculate GCD 
    // of two numbers 
    static int gcd(int a, int b) 
    { 
        if (a == 0) 
            return b; 
        return gcd(b%a , a); 
    } 
      
    // Java function to count number  
    // of pairs with given GCD and LCM 
    static int countPairs(int G, int L) 
    { 
        // To store count 
        int count = 0; 
          
        // To store product a*b = G*L 
        int p = G*L; 
          
        // p/a will be b if a divides p 
        for (int a = 1; a<=L; a++) 
            if ((p%a == 0) && gcd(a, p/a) == G) 
                count++; 
                  
       return count; 
    } 
      
    public static void main (String[] args) 
    { 
        int G = 2, L = 12; 
        System.out.print("Total possible pair with GCD " + G); 
        System.out.print(" & LCM " + L); 
        System.out.print(" = " + countPairs(G, L)); 
          
    } 
      
} 
  
// This code is contributed by Saket Kumar 

