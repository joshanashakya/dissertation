

# Python 3 program to check if number n is  
# expressed as sum of two abundant numbers  
  
# from math lib import sqrt function 
from math import sqrt  
  
N = 100005
  
# Function to return all abundant numbers  
# This function will be helpful for  
# multiple queries  
def ABUNDANT() : 
  
    # To store abundant numbers  
    v = set() ;  
  
    for i in range(1, N) :  
  
        # to store sum of the divisors  
        # include 1 in the sum  
        sum = 1
        for j in range(2, int(sqrt(i)) + 1) : 
              
            # if j is proper divisor 
            if (i % j == 0) : 
                sum += j 
                  
            # if i is not a perfect square  
            if (i / j != j) : 
                sum += i // j 
                  
        # if sum is greater than i then i  
        # is a abundant numbe 
        if (sum > i) : 
            v.add(i) 
      
    return v 
  
# Check if number n is expressed  
# as sum of two abundant numbers  
def SumOfAbundant(n) :  
    v = ABUNDANT() 
      
    for i in range(1, n + 1) : 
  
        # if both i and n-i are abundant numbers  
        if (list(v).count(i) and 
            list(v).count(n - i)) :  
            print(i, " ", n - i)  
            return
              
    # can not be expressed 
    print(-1) 
      
# Driver code  
if __name__ == "__main__" : 
    n = 24
    SumOfAbundant(n) 
  
# This code is contributed by Ryuga 

