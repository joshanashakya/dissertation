

// Java program to find sum of all 
// amicable numbers up to n 
import java.util.*; 
class GFG 
{ 
      
static final int N=100005; 
  
// Function to return all amicable numbers 
static Set<Integer> AMICABLE() 
{ 
    int sum[] = new int[N]; 
    for(int i = 0; i < N; i++) 
        sum[i]=0; 
      
    for (int i = 1; i < N; i++)   
    { 
  
        // include 1 
        sum[i]++; 
  
        for (int j = 2; j * j <= i; j++)  
        { 
  
            // j is proper divisor of i 
            if (i % j == 0) 
            { 
                sum[i] += j; 
  
                // if i is not a perfect square 
                if (i / j != j) 
                    sum[i] += i / j; 
            } 
        } 
    } 
  
    Set<Integer> s = new HashSet<Integer>(); 
    for (int i = 2; i < N; i++) 
    { 
  
        // insert amicable numbers 
        if (i != sum[i] && sum[i] < N && i == sum[sum[i]]) 
        { 
            s.add(i); 
            s.add(sum[i]); 
        } 
    } 
    return s; 
} 
  
// function to find sum of all 
// amicable numbers up to N 
static int SumOfAmicable(int n) 
{ 
    // to store required sum 
    int sum = 0; 
  
    // to store all amicable numbers 
    Set<Integer> s = AMICABLE(); 
      
      
    // sum all amicable numbers upto N 
    for (Integer x : s)  
    { 
        if (x <= n) 
            sum += x; 
    } 
  
    // required answer 
    return sum; 
} 
  
// Driver code  
public static void main(String args[]) 
{ 
    int n = 284; 
    System.out.println( SumOfAmicable(n)); 
} 
} 
  
// This code is contributed by Arnab Kundu 

