

// Java program to check whether number  
// has exactly three distinct factors  
// or not  
public class GFG { 
  
  
// Utility function to check whether a  
// number is prime or not  
static boolean isPrime(int n)  
{  
    // Corner cases  
    if (n <= 1)  
        return false;  
    if (n <= 3)  
        return true;  
  
    // This is checked so that we can skip  
    // middle five numbers in below loop  
    if (n % 2 == 0 || n % 3 == 0)  
        return false;  
  
    for (int i = 5; i * i <= n; i = i + 6)  
        if (n % i == 0 || n % (i + 2) == 0)  
            return false;  
  
    return true;  
}  
  
// Function to check whether given number  
// has three distinct factors or not  
static boolean isThreeDisctFactors(long n)  
{  
    // Find square root of number  
    int sq = (int)Math.sqrt(n);  
  
    // Check whether number is perfect  
    // square or not  
    if (1L * sq * sq != n)  
        return false;  
  
    // If number is perfect square, check  
    // whether square root is prime or  
    // not  
    return isPrime(sq) ? true : false;  
}  
  
// Driver program  
    public static void main(String[] args) { 
        long num = 9;  
    if (isThreeDisctFactors(num))  
        System.out.println("Yes");  
    else
        System.out.println("No");  
  
    num = 15;  
    if (isThreeDisctFactors(num))  
        System.out.println("Yes");  
    else
        System.out.println("No");  
  
    num = 12397923568441L;  
    if (isThreeDisctFactors(num))  
        System.out.println("Yes");  
    else
        System.out.println("No");  
    } 
} 

