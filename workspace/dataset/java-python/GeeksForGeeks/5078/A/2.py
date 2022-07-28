

# Python3 implementation of  
# above approach 
  
# function to Find the number of  
# solutions for x < y, where  
# a <= x <= b and c <= y <= d and 
# x, y integers.  
def NumberOfSolutions(a, b, c, d) : 
  
    # to store answer  
    ans = 0
  
    # iterate explicitly over all  
    # possible values of x  
    for i in range(a, b + 1) : 
  
        if d >= max(c, i + 1) : 
  
            ans += d - max(c, i + 1) + 1
  
    # return answer  
    return ans 
  
# Driver code 
if __name__ == "__main__" : 
  
    a, b, c, d = 2, 3, 3, 4
  
    # function call  
    print(NumberOfSolutions(a, b, c, d)) 
  
# This code is contributed by ANKITRAI1 

