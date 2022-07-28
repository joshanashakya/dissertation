

# Python3 program to find number of  
# Subsequences with Even and Odd Sum  
  
# Function to find number of  
# Subsequences with Even and Odd Sum  
def countSum(arr, n) :  
  
    NumberOfOdds = 0; NumberOfEvens = 0;  
  
    # Counting number of odds  
    for i in range(n) :  
        if (arr[i] & 1) :  
            NumberOfOdds += 1;  
  
    # Even count  
    NumberOfEvens = n - NumberOfOdds;  
  
    NumberOfOddSubsequences = (1 << NumberOfEvens) * \ 
                              (1 << (NumberOfOdds - 1));  
  
    # Total Subsequences is (2^n - 1)  
    # For NumberOfEvenSubsequences subtract  
    # NumberOfOddSubsequences from total  
    NumberOfEvenSubsequences = (1 << n) - 1 - \ 
                                NumberOfOddSubsequences;  
  
    return (NumberOfEvenSubsequences,  
            NumberOfOddSubsequences);  
  
# Driver code  
if __name__ == "__main__":  
  
    arr = [ 1, 2, 2, 3 ];  
  
    n = len(arr);  
  
    # Calling the function  
    ans = countSum(arr, n);  
  
    print("EvenSum =", ans[0], end = " ");  
    print("OddSum =", ans[1]);  
  
# This code is contributed by AnkitRai01 

