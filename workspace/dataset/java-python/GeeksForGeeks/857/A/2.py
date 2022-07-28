

# Python3 program to check if all  
# sub-numbers have distinct Digit product  
  
# Function to calculate product of  
# digits between given indexes  
def digitProduct(digits, start, end):  
  
    pro = 1
    for i in range(start, end + 1):  
        pro *= digits[i]  
      
    return pro  
  
# Function to check if all sub-numbers  
# have distinct Digit product  
def isDistinct(N):  
  
    s = str(N)  
      
    # Length of number N  
    length = len(s)  
  
    # Digit array  
    digits = [None] * length 
  
    # set to maintain digit products  
    products = set() 
  
    for i in range(0, length):  
        digits[i] = int(s[i]) 
      
    # Finding all possible subarrays  
    for i in range(0, length):  
        for j in range(i, length):  
  
            val = digitProduct(digits, i, j)  
      
            if val in products:  
                return False
            else: 
                products.add(val)  
          
    return True
  
# Driver Code 
if __name__ == "__main__":  
  
    N = 324
  
    if isDistinct(N) == True:  
        print("YES")  
    else: 
        print("NO")  
          
# This code is contributed  
# by Rituraj Jain 

