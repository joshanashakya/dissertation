

# Python3 program to find the max sum of 
# numbers whose lcm is n 
  
# Returns maximum sum of numbers with 
# LCM as N 
def maxSumLCM(n) : 
      
    # Initialize result 
    max_sum = 0 
  
    # Finding a divisor of n and adding 
    # it to max_sum 
    i = 1
    while(i * i<= n ): 
        if (n % i == 0) : 
            max_sum = max_sum + i 
            if (n // i != i) : 
                max_sum = max_sum + (n // i) 
        i = i + 1
      
    return max_sum 
  
# Driver code 
n = 2
print(maxSumLCM(n)) 
  
# This code is contributed by Nikita Tiwari. 

