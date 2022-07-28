

# Python 3 program to Find the  
# number of rectangles of size 
# 2*1 can be placed inside a 
# rectangle of size n*m 
  
# function to Find the number  
# of rectangles of size 2*1  
# can be placed inside a  
# rectangle of size n*m 
def NumberOfRectangles(n, m): 
  
    # if n is even 
    if (n % 2 == 0): 
        return (n / 2) * m 
  
    # if m is even 
    elif (m % 2 == 0): 
        return (m // 2) * n 
  
    # if both are odd 
    return (n * m - 1) // 2
  
# Driver code 
if __name__ == "__main__": 
    n = 3
    m = 3
  
    # function call 
    print(NumberOfRectangles(n, m)) 
  
# This code is contributed 
# by ChitraNayal 

