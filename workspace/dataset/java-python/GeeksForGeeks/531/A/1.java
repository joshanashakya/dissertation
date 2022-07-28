

// Java program to find number of 
// Subsequences with Even and Odd Sum 
import java.util.*; 
  
class GFG  
{ 
static class pair 
{  
    int first, second;  
    public pair(int first, int second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} 
  
// Function to find number of 
// Subsequences with Even and Odd Sum 
static pair countSum(int arr[], int n) 
{ 
    int NumberOfOdds = 0, NumberOfEvens = 0; 
  
    // Counting number of odds 
    for (int i = 0; i < n; i++) 
        if (arr[i] % 2 == 1) 
            NumberOfOdds++; 
  
    // Even count 
    NumberOfEvens = n - NumberOfOdds; 
  
    int NumberOfOddSubsequences = (1 << NumberOfEvens) *  
                                  (1 << (NumberOfOdds - 1)); 
  
    // Total Subsequences is (2^n - 1) 
    // For NumberOfEvenSubsequences subtract 
    // NumberOfOddSubsequences from total 
    int NumberOfEvenSubsequences = (1 << n) - 1 -  
                                    NumberOfOddSubsequences; 
  
    return new pair(NumberOfEvenSubsequences, 
                    NumberOfOddSubsequences); 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int arr[] = { 1, 2, 2, 3 }; 
  
    int n = arr.length; 
  
    // Calling the function 
    pair ans = countSum(arr, n); 
  
    System.out.print("EvenSum = " + ans.first); 
    System.out.print(" OddSum = " + ans.second); 
} 
}  
  
// This code is contributed by PrinciRaj1992 

