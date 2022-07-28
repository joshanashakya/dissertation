

// Java program to print prime factors in 
// pairs. 
public class GEE { 
  
    static void printPFsInPairs(int n) 
    { 
        for (int i = 1; i * i <= n; i++) 
            if (n % i == 0) 
                System.out.println(i + "*" + n / i); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
  
        int n = 24; 
        printPFsInPairs(n); 
    } 
} 

