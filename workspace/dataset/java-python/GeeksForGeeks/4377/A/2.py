

# Python3 program to find the number   
# of solutions for the equation 
# x + y + z <= n, such that  
# 0 <= x <= X, 0 <= y <= Y, 0 <= z <= Z.  
  
# function to find the number of solutions 
# for the equation x + y + z <= n, such that  
# 0 <= x <= X, 0 <= y <= Y, 0 <= z <= Z.  
def NumberOfSolutions(x, y, z, n) : 
  
    # to store answer 
    ans = 0
  
    # for values of x  
    for i in range(x + 1) : 
  
        # for values of y  
        for j in range(y + 1) : 
  
            # maximum possible value of z  
            temp = n - i - j 
  
            # if z value greater than equals   
            # to 0 then only it is valid  
            if temp >= 0 : 
  
                # find minimum of temp and z 
                temp = min(temp, z) 
                ans += temp + 1
  
    # return required answer 
    return ans 
  
# Driver code 
if __name__ == "__main__" : 
  
    x, y, z, n = 1, 2, 3, 4
      
    # function calling 
    print(NumberOfSolutions(x, y, z, n)) 
  
# This code is contributed by ANKITRAI1 

