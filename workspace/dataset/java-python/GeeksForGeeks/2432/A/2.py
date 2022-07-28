

# Python3 implementation of the approach 
  
# Function to return the count of numbers 
# from 1 to N which are not divisible by 
# any number in the range [2, 10] 
def countNumbers(n): 
    return (n - n // 2 - n // 3 - n // 5 - n // 7 + 
             n // 6 + n // 10 + n // 14 + n // 15 +
             n // 21 + n // 35 - n // 30 - n // 42 - 
             n // 70 - n // 105 + n // 210) 
  
# Driver code 
if __name__ == '__main__': 
    n = 20
    print(countNumbers(n)) 
  
# This code contributed by Rajput-Ji 

