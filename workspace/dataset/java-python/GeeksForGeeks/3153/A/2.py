

# Python 3 program to find number  
# of squares of a*a required to  
# cover n*m rectangle 
  
# function to find number of  
# squares of a*a required to  
# cover n*m rectangle 
def Squares(n, m, a): 
    return (((m + a - 1) // a) * 
            ((n + a - 1) // a)) 
  
# Driver code 
if __name__ == "__main__": 
    n = 6
    m = 6
    a = 4
  
    # function call 
    print(Squares(n, m, a)) 
  
# This code is contributed  
# by ChitraNayal 

