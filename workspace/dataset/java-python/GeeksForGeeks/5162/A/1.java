

// Java implementation of the approach  
import java.util.*; 
  
class GFG 
{ 
      
// Function to calculate number of characters  
// in corresponding string of 'A' and 'B'  
static int no_of_characters(int M)  
{  
  
    // Since the minimum number  
    // of characters will be 1  
    int k = 1;  
  
    // Calculating number of characters  
    while (true) 
    {  
  
        // Since k length string can  
        // represent at most pow(2, k+1)-2  
        // that is if k = 4, it can  
        // represent at most pow(2, 4+1)-2 = 30  
        // so we have to calculate the  
        // length of the corresponding string  
        if ((int)Math.pow(2, k + 1) - 2 < M)  
            k++;  
        else
            break;  
    }  
  
    // return the length of  
    // the corresponding string  
    return k;  
}  
  
// Function to print corresponding  
// string of 'A' and 'B'  
static void print_string(int M)  
{  
    int k, num, N;  
  
    // Find length of string  
    k = no_of_characters(M);  
  
    // Since the first number that can be represented  
    // by k length string will be (pow(2, k)-2)+1  
    // and it will be AAA...A, k times,  
    // therefore, N will store that  
    // how much we have to print  
    N = M - ((int)Math.pow(2, k) - 2);  
  
    // At a particular time,  
    // we have to decide whether  
    // we have to print 'A' or 'B',  
    // this can be check by calculating  
    // the value of pow(2, k-1)  
    while (k > 0)  
    {  
        num = (int)Math.pow(2, k - 1);  
  
        if (num >= N)  
            System.out.print("A");  
        else 
        {  
            System.out.print( "B");  
            N -= num;  
        }  
        k--;  
    }  
  
    // Print new line  
    System.out.println();  
}  
  
// Driver code  
public static void main(String args[]) 
{  
  
    int M;  
  
    M = 30;  
    print_string(M);  
  
    M = 55;  
    print_string(M);  
  
    M = 100;  
    print_string(M);  
  
}  
} 
  
// This code is contributed by Arnab Kundu 

