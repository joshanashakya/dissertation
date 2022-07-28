

// Java program to answer queries 
// for N-th prime factor of a number 
import java.util.*; 
  
class GFG 
{ 
      
static int N = 1000001; 
  
// 2-D vector that stores prime factors 
static Vector<Integer> []v = new Vector[N]; 
  
// Function to pre-store prime 
// factors of all numbers till 10^6 
static void preprocess() 
{ 
    // calculate unique prime factors for 
    // every number till 10^6 
    for (int i = 1; i < N; i++)  
    { 
  
        int num = i; 
  
        // find prime factors 
        for (int j = 2; j <= Math.sqrt(num); j++)  
        { 
            if (num % j == 0) 
            { 
  
                // store if prime factor 
                v[i].add(j); 
  
                while (num % j == 0)  
                { 
                    num = num / j; 
                } 
            } 
        } 
        if(num > 2) 
        v[i].add(num); 
    } 
} 
  
// Function that returns answer 
// for every query 
static int query(int number, int n) 
{ 
    return v[number].get(n - 1); 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
  
    for (int i = 0; i < N; i++) 
        v[i] = new Vector<Integer>(); 
  
    // Function to pre-store unique prime factors 
    preprocess(); 
  
    // 1st query 
    int number = 6, n = 1; 
    System.out.print(query(number, n) +"\n"); 
  
    // 2nd query 
    number = 210; n = 3; 
    System.out.print(query(number, n) +"\n"); 
  
    // 3rd query 
    number = 210; n = 2; 
    System.out.print(query(number, n) +"\n"); 
  
    // 4th query 
    number = 60; n = 2; 
    System.out.print(query(number, n) +"\n"); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

