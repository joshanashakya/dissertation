

// Java program to find number of spectators  
// standing at a time 
  
class GFG {  
  
    static void result(long n, long k,long t) 
    { 
        // If the time is less than k 
        // then we can print directly t time. 
        if (t <= k) 
            System.out.println(t); 
       
        // If the time is n then k spectators 
        // are standing. 
        else if (t <= n) 
            System.out.println(k); 
       
        // Otherwise we calculate the  
        // spectators standing. 
        else { 
            long temp = t - n; 
            temp = k - temp; 
            System.out.println(temp); 
        } 
    } 
       
    // Driver code 
    public static void main(String args[]) 
    { 
        // Stores the value of n, k and t 
        // t is time 
        // n & k is the number of specators 
        long n, k, t; 
        n = 10; 
        k = 5; 
        t = 12; 
        result(n, k, t); 
          
    } 
} 
  
/*This code is contributed by Nikita Tiwari.*/

