

# Python3 program to find N digit number such 
# that it is not divisible by any of its digits 
   
# Function that prthe answer 
def findTheNumber(n): 
    # if n == 1 then it is 
    # not possible 
    if (n == 1): 
        print("Impossible") 
        return
   
    # loop to n-1 times 
    for i in range(n-1): 
        print("5",end="") 
   
    # print as last digit of 
    # the number 
    print("4") 
   
# Driver code 
if __name__ == '__main__': 
    n = 12
   
    #Function call 
    findTheNumber(n) 
  
# This code is contributed by mohit kumar 29 

