

# Python3 implementation of the approach.  
  
# Function to calculate the prefix sum  
# of all the even factors  
def sieve_modified():  
  
    for i in range(2, MAX, 2):  
  
        # Add i to all the multiples of i  
        for j in range(i, MAX, i):  
            prefix[j] += i  
  
    # Update the prefix sum  
    for i in range(1, MAX):  
        prefix[i] += prefix[i - 1]  
  
# Function to return the sum of  
# all the even factors of the  
# numbers in the given range  
def sumEvenFactors(L, R):  
  
    return (prefix[R] - prefix[L - 1])  
  
# Driver code  
if __name__ == "__main__": 
      
    MAX = 100000
    prefix = [0] * MAX
    sieve_modified()  
    l, r = 6, 10
    print(sumEvenFactors(l, r))  
  
# This code is contributed by Rituraj Jain 

