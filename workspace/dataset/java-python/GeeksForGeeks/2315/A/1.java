

// Java program to find if number N can 
// be represented as sum of a's and b's 
  
import java.util.*; 
class solution 
{ 
  
// Function to find if number N can 
// be represented as sum of a's and b's 
static void checkIfPossibleRec(int x, int a, int b, 
                                boolean isPossible[], int n) 
{ 
    // base condition 
    if (x > n) 
        return; 
  
    // if x is already visited 
    if (isPossible[x]) 
        return; 
  
    // set x as possible 
    isPossible[x] = true; 
  
    // recursive call 
    checkIfPossibleRec(x + a, a, b, isPossible, n); 
    checkIfPossibleRec(x + b, a, b, isPossible, n); 
} 
  
static boolean checkPossible(int n, int a, int b) 
{ 
    boolean isPossible[]=new boolean[n + 1]; 
    for(int i=0;i<=n;i++) 
    isPossible[i]=false; 
    checkIfPossibleRec(0, a, b, isPossible, n); 
    return isPossible[n]; 
} 
  
// Driver program 
public static void main(String args[]) 
{ 
    int a = 3, b = 7, n = 8; 
    if (checkPossible(a, b, n)) 
        System.out.print("Yes"); 
    else
        System.out.print( "No"); 
  
} 
  
} 
//contributed by Arnab Kundu 

