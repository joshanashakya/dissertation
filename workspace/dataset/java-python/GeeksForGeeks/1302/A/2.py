

# Python3 program to find count  
# of numbers having odd number 
# of divisors in given range 
  
# Function to count numbers  
# having odd number of divisors  
# in range [A, B] 
def OddDivCount(a, b): 
  
    # variable to odd divisor count 
    res = 0
      
    # iterate from a to b and count  
    # their number of divisors 
    for i in range(a, b + 1) : 
  
        # variable to divisor count 
        divCount = 0
        for j in range(1, i + 1) : 
            if (i % j == 0) : 
                divCount += 1
  
        # if count of divisor is odd 
        # then increase res by 1 
        if (divCount % 2) : 
            res += 1
    return res 
  
# Driver code 
if __name__ == "__main__": 
    a = 1
    b = 10
    print(OddDivCount(a, b)) 
  
# This code is contributed  
# by ChitraNayal 

