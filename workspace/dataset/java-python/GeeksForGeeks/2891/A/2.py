

# Efficient Python 3 program to find n-th  
# number made of even digits only 
  
# function to find nth number made of  
# even digits only  
def findNthEvenDigitNumber( n): 
  
    # If n = 1 return 0 
    if (n == 1): 
        return 0
  
    # vector to store the digits  
    # when converted into base 5 
    v = [] 
  
    # Reduce n to n-1 to exclude 0 
    n = n - 1
  
    # Reduce n to base 5 number and 
    # store digits 
    while (n > 0): 
          
        # pushing the digits into vector 
        v.append(n % 5) 
        n = n // 5
  
    # variable to represent the number   
    # after converting it to base 5.  
    # Since the digits are be in reverse 
    # order, we traverse vector from back 
    result = 0
    for i in range(len(v) - 1, -1, -1): 
        result = result * 10
        result = result + v[i] 
  
    # return 2*result (to convert  
    # digits 0, 1, 2, 3, 4 to  
    # 0, 2, 4, 6, 8. 
    return 2 * result 
  
# Driver Code 
if __name__ == "__main__": 
      
    print(findNthEvenDigitNumber(2)) 
    print(findNthEvenDigitNumber(10)) 
  
# This code is contributed by ita_c 

