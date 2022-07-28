

# Python3 program to illustrate the 
# floating-point error 
  
def floatError(no): 
    sum = 0.0
    for i in range(10): 
        sum = sum + no 
    return sum
  
if __name__ == '__main__': 
    print(floatError(0.1)) 
  
# This code is contributed by mohit kumar 29 

