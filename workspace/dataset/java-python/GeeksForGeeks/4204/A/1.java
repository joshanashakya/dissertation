

//Java implementation of above approach 
import java.util.*; 
public class ACE { 
  
    static int gcd(int a,int b) 
    { 
        return b==0 ? a :gcd(b,a%b); 
    } 
      
    //Function to find the LCM 
    static int find_LCM(int x, int y) 
    { 
     return (x * y) / gcd(x, y); 
    } 
  
    //Function to count the pairs 
    static int CountPairs(int n, int m, int A, int B) 
    { 
     int cnt = 0; 
     int lcm = find_LCM(A, B); 
  
     for (int i = 1; i <= n; i++) 
         cnt += (m + (i % lcm)) / lcm; 
  
     return cnt; 
    } 
  
    //Driver code 
    public static void main(String[] args) { 
          
        int n = 60, m = 90, A = 5, B = 10; 
  
        System.out.println(CountPairs(n, m, A, B)); 
  
    } 
  
} 

