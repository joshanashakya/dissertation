

# Python3 program to find first occurrence 
# of c in a/b 
  
# function to print the first digit 
def first( a , b , c ): 
  
    # reduce the number to its mod 
    a %= b 
      
    # traverse for every decimal places 
    for i in range(1, b + 1): 
  
        # get every fraction places 
        # when (a*10/b)/c 
        a = a * 10
  
        # check if it is equal to 
        # the required integer 
        if int(a / b) == c: 
            return i 
          
        # mod the number 
        a %= b 
      
    return -1
  
# driver code to test the above function 
a = 1
b = 4
c = 5
print(first(a, b, c)) 
  
# This code is contributed by "Sharad_Bhardwaj". 

