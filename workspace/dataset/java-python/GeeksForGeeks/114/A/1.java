

import static java.lang.Math.sqrt; 
  
public class Primmefunc { 
  
    public static void prime(long n) 
    { 
        int flag = 0; 
  
        // checking divisibilty by 6 
        if ((n + 1) % 6 != 0 && (n - 1) % 6 != 0) { 
            System.out.println("Not Prime"); 
        } 
        else { 
  
            // breakout if number is perfect square 
            double s = sqrt(n); 
            if ((s * s) == n) { 
                System.out.println("Semi-Prime"); 
            } 
            else { 
                long f = (long)s; 
                long l = (long)((f * f)); 
  
                // Iterating over to get the 
                // closest average value 
                for (long i = f + 1; i < l; i++) { 
  
                    // 1st Factor 
                    long p = i - (long)(sqrt((i * i) - (n))); 
  
                    // 2nd Factor 
                    long q = n / p; 
  
                    // To avoid Convergence 
                    if (p < 2 || q < 2) { 
                        break; 
                    } 
  
                    // checking semi-prime condition 
                    if ((p * q) == n) { 
                        flag = 1; 
                        break; 
                    } 
  
                    // If convergence found 
                    // then number is semi-prime 
                    else { 
  
                        // convergence not found 
                        // then number is prime 
                        flag = 2; 
                    } 
                } 
  
                if (flag == 1) { 
                    System.out.println("Semi-Prime"); 
                } 
                else if (flag == 2) { 
  
                    System.out.println("Prime"); 
                } 
            } 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        // Driver code 
        // Entered number should be greater 
        // than 300 to avoid Convergence of 
        // second factor to 1 
        prime(8179); 
        prime(7894561); 
        prime(90000000); 
        prime(841); 
        prime(22553); 
        prime(1187); 
    } 
//written by Rushil Jhaveri 
} 

