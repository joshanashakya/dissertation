

# Python3 program to print multiples  
# of Unit Digit of Given Number 
  
# Function to print the multiples 
# of unit digit 
def printMultiples(n): 
  
    # Find the unit digit of 
    # the given number 
    unit_digit = n % 10
  
    # if the unit digit is 0 then 
    # change it to 10 
    if (unit_digit == 0): 
        unit_digit = 10
  
    # print the multiples of unit digit 
    # until the multiple is less than 
    # or equal to n 
    for i in range(unit_digit, n + 1,  
                   unit_digit): 
        print(i, end = " ") 
  
# Driver Code 
n = 39
  
printMultiples(n) 
  
# This code is contributed by Mohit Kumar 

