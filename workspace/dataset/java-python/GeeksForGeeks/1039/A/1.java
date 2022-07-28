

//Java program to count the numbers within a range  
// whose prime factors are only 2 and 3  
  
import java.io.*; 
  
class GFG { 
      
// Function to count the number within a range  
// whose prime factors are only 2 and 3  
static int findTwoThreePrime(int l, int r)  
{  
    // Start with 2 so that 1 doesn't get counted  
    if (l == 1)  
        l++;  
  
    int count = 0;  
  
    for (int i = l; i <= r; i++) {  
        int num = i;  
  
        // While num is divisible by 2, divide it by 2  
        while (num % 2 == 0)  
            num /= 2;  
  
        // While num is divisible by 3, divide it by 3  
        while (num % 3 == 0)  
            num /= 3;  
  
        // If num got reduced to 1 then it has  
        // only 2 and 3 as prime factors  
        if (num == 1)  
            count++;  
    }  
  
    return count;  
}  
  
// Driver code  
    public static void main (String[] args) { 
  
        int l = 1, r = 10;  
        System.out.println (findTwoThreePrime(l, r));  
    } 
//This code is contributed by ajit     
} 

