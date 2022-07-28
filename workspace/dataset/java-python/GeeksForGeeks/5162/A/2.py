

# Python 3 program to implement 
# the above approach 
from math import pow
  
# Function to calculate number of characters 
# in corresponding string of 'A' and 'B' 
def no_of_characters(M): 
      
    # Since the minimum number 
    # of characters will be 1 
    k = 1
  
    # Calculating number of characters 
    while (True): 
          
        # Since k length string can 
        # represent at most pow(2, k+1)-2 
        # that is if k = 4, it can 
        # represent at most pow(2, 4+1)-2 = 30 
        # so we have to calculate the 
        # length of the corresponding string 
        if (pow(2, k + 1) - 2 < M): 
            k += 1
        else: 
            break
  
    # return the length of 
    # the corresponding string 
    return k 
  
# Function to print corresponding 
# string of 'A' and 'B' 
def print_string(M): 
      
    # Find length of string 
    k = no_of_characters(M) 
  
    # Since the first number that can be  
    # represented by k length string will  
    # be (pow(2, k)-2)+1 and it will be  
    # AAA...A, k times, therefore, N will  
    # store that how much we have to print 
    N = M - (pow(2, k) - 2) 
  
    # At a particular time, 
    # we have to decide whether 
    # we have to print 'A' or 'B', 
    # this can be check by calculating 
    # the value of pow(2, k - 1) 
    while (k > 0): 
        num = pow(2, k - 1) 
  
        if (num >= N): 
            print("A", end = "") 
        else: 
            print("B", end = "") 
            N -= num 
        k -= 1
          
    print("\n", end = "") 
  
# Driver code 
if __name__ == '__main__': 
    M = 30; 
    print_string(M) 
  
    M = 55
    print_string(M) 
  
    M = 100
    print_string(M) 
      
# This code is contributed by 
# Surendra_Gangwar 

