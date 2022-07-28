

class GfG  
{  
  
// Function to check whether  
// a number is prime or not.  
static boolean is_prime(int num)  
{  
  
    // Count variable to store  
    // the number of factors of 'num'  
    int count = 0;  
  
    // Counting the number of factors  
    for (int i = 1; i * i <= (num); i++)  
    {  
  
        if ((num) % i == 0)  
        {  
  
            if (i * i != (num))  
                count += 2;  
  
            else
                count++;  
        }  
    }  
  
    // If number is prime return true  
    if (count == 2)  
        return true;  
  
    else
        return false;  
}  
  
// Function to check for divisibility  
static String is_divisible(int n)  
{  
  
    // if 'n' equals 1 then divisibility is possible  
    if (n == 1)  
    {  
        return "YES";  
    }  
  
    // Else check whether 'n+1' is prime or not  
    else 
    {  
  
        // If 'n+1' is prime then 'n!' is  
        // not divisible by 'n*(n+1)/2'  
        if (is_prime(n + 1))  
            return "NO";  
  
        // else divisibility occurs  
        else
            return "YES";  
    }  
}  
  
// Driver Code  
public static void main(String[] args)  
{  
  
    int n;  
  
    // Test for n=3  
    n = 3;  
  
    System.out.println(is_divisible(n));  
  
    // Test for n=4  
    n = 4;  
  
    System.out.println(is_divisible(n));  
} 
}  
  
// This code is contributed by Prerna Saini 

