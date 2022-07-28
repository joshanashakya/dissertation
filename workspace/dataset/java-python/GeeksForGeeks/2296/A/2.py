

# Python 3 program to find the largest  
# factor of a number which is also a  
# perfect square 
import math 
  
# Function to find the largest factor 
# of a given number which is a 
# perfect square 
def largestSquareFactor( num): 
  
    # Initialise the answer to 1 
    answer = 1
  
    # Finding the prime factors till sqrt(num) 
    for i in range(2, int(math.sqrt(num))) : 
          
        # Frequency of the prime factor in the 
        # factorisation initialised to 0 
        cnt = 0
        j = i 
  
        while (num % j == 0) : 
            cnt += 1
            j *= i 
  
        # If the frequency is odd then mutiply i 
        # frequency-1 times to the answer 
        if (cnt & 1) : 
            cnt -= 1
            answer *= pow(i, cnt) 
          
        # Else if it is even, multiply 
        # it frequency times 
        else : 
            answer *= pow(i, cnt) 
    return answer 
  
# Driver Code 
if __name__ == "__main__": 
    N = 420
  
    print(largestSquareFactor(N)) 
  
# This code is contributed  
# by ChitraNayal 

