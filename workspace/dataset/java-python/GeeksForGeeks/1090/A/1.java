

// Java implementation of the approach  
class GfG 
{  
  
// Function to count number of times  
// prime P divide factorial N  
static boolean checkfact(int N, int countprime,  
                                    int prime)  
{  
    int countfact = 0;  
    if (prime == 2 || prime == 3)  
        countfact++;  
    int divide = prime;  
  
    // Lengendre Formula  
    while (N / divide != 0) 
    {  
        countfact += N / divide;  
        divide = divide * divide;  
    }  
  
    if (countfact >= countprime)  
        return true;  
    else
        return false;  
}  
  
// Function to find count number of times  
// all prime P divide summation  
static boolean check(int N)  
{  
  
    // Formula for summation of square after removing n  
    // and constant 6  
    int sumsquares = (N + 1) * (2 * N + 1);  
    int countprime = 0;  
  
    // Loop to traverse over all prime P which divide  
    // summation  
    for (int i = 2; i <= Math.sqrt(sumsquares); i++)  
    {  
        int flag = 0;  
  
        while (sumsquares % i == 0)  
        {  
            flag = 1;  
            countprime++;  
            sumsquares /= i;  
        }  
  
        if (flag == 1)  
        {  
            if (!checkfact(N - 1, countprime, i))  
                return false;  
            countprime = 0;  
        }  
    }  
  
    // If Number itself is a Prime Number  
    if (sumsquares != 1)  
        if (!checkfact(N - 1, 1, sumsquares))  
            return false;  
  
    return true;  
}  
  
// Driver Code  
public static void main(String[] args)  
{  
    int N = 5;  
    if (check(N))  
        System.out.println("Yes");  
    else
        System.out.println("No");  
} 
}  
  
// This code is contributed by Prerna Saini 

