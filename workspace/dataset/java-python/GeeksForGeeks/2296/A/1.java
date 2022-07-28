

// Java program to find the largest factor of  
// a number which is also a perfect square  
  
class GFG 
{ 
    
// Function to find the largest factor  
// of a given number which  
// is a perfect square  
static int largestSquareFactor(int num)  
{  
    // Initialise the answer to 1  
    int answer = 1;  
    
    // Finding the prime factors till sqrt(num)  
    for (int i = 2; i < Math.sqrt(num); ++i) {  
        // Frequency of the prime factor in the  
        // factorisation initialised to 0  
        int cnt = 0;  
        int j = i;  
    
        while (num % j == 0) {  
            cnt++;  
            j *= i;  
        }  
    
        // If the frequency is odd then mutiply i  
        // frequency-1 times to the answer  
        if ((cnt & 1)!=0) {  
            cnt--;  
            answer *= Math.pow(i, cnt);  
        }  
        // Else if it is even, multiply  
        // it frequency times  
        else {  
            answer *= Math.pow(i, cnt);  
        }  
    }  
    
    return answer;  
}  
    
// Driver Code  
public static void  main(String args[])  
{  
    int N = 420;  
    
    System.out.println(largestSquareFactor(N));  
    
} 
}  

