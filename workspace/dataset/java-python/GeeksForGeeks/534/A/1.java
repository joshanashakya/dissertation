

// Java program to get minimum cost to sort 
// strings by reversal operation 
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
  
// Returns the count of odd and 
// even subsequences 
static pair countSum(int arr[], int n) 
{ 
    int result = 0; 
  
    // Variables to store the count of even 
    // subsequences and odd subsequences 
    int count_odd, count_even; 
  
    // Initialising count_even and count_odd to 0 
    // since as there is no subsequence before the 
    // iteration with even or odd count. 
    count_odd = 0; 
    count_even = 0; 
  
    // Find sum of all subsequences with even count 
    // and odd count and storing them as we iterate. 
    for (int i = 1; i <= n; i++) 
    { 
  
        // if the number is even 
        if (arr[i - 1] % 2 == 0) 
        { 
            count_even = count_even + count_even + 1; 
            count_odd = count_odd + count_odd; 
        } 
  
        // if the number is odd 
        else
        { 
            int temp = count_even; 
            count_even = count_even + count_odd; 
            count_odd = count_odd + temp + 1; 
        } 
    } 
    return new pair(count_even, count_odd ); 
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
  
// This code is contributed by 29AjayKumar 

