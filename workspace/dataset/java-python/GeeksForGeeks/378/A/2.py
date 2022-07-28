

# Python3 program for finding maximum 
# number of dots after throwing a  
# dice N times. 
  
# Function to find the maximum  
# expectation 
def expect(m,n) : 
  
    ans = 0.0
    i = m 
    while (i): 
          
        # formula to find the maximum  
        # number and  
        # sum of maximum numbers  
        ans += (pow(i / m, n) - pow((i-1) / m, n)) * i 
        i -= 1
  
    return ans 
  
# Driver code 
if __name__ == "__main__" : 
      
    # multiple assignments 
    m,n = 6,3
  
    # function calling 
    print(expect(m,n)) 

