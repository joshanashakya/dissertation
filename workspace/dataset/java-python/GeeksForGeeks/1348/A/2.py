

# Python3 program to find the two numbers  
# when divisors are given in a random order  
  
# from math lib import sqrt method 
from math import sqrt 
  
# Function to get the two numbers  
def getNumbers(a, n) :  
  
    # Mark the frequency of all elements  
    freq = {};  
    for i in range(n) : 
        if a[i] not in freq.keys() : 
            freq[a[i]] = 0
              
        freq[a[i]] += 1
  
    # Get the first maximum element  
    maxi1 = max(a) 
  
    # Decrease the frequency of all divisors  
    # of the maximum number that are present  
    # int a[]  
    for i in range(1, int(sqrt(maxi1)) + 1) : 
  
        if (maxi1 % i == 0 and
            freq[i] in freq.keys() and
            freq[i] != 0) :  
            freq[i] -= 1
  
            if (i != (maxi1 // i) and
                freq[maxi1 // i] in freq.keys() and
                freq[maxi1 // i] != 0) :  
                freq[maxi1 // i] -= 1
      
    # The second number is the largest number  
    # present in remaining numbers.  
    maxi2 = -1
    for i in range(n) : 
        if (freq[a[i]] != 0) : 
            maxi2 = max(maxi2, a[i])  
  
    print(maxi1, maxi2)  
  
# Driver Code  
if __name__ == "__main__" : 
      
    a = [ 10, 2, 8, 1, 2, 4, 1, 20, 4, 5 ]  
    n = len(a) 
    getNumbers(a, n) 
      
# This code is contributed by Ryuga 

