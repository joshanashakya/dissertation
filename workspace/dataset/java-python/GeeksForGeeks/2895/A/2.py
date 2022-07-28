

# Python 3 program to find next greater  
# Number than N with the same quantity of 
# digits A and B 
  
# Recursive function to find the 
# required number 
def findNumUtil(res, a, aCount, b, bCount, n): 
    if (res > 1e11): 
        return 1e11
  
    # If the resulting number is >= n  
    # and count of a = count of b,  
    # return the number 
    if (aCount == bCount and res >= n): 
        return res 
  
    # select minimum of two and call 
    # the function again 
    return min(findNumUtil(res * 10 + a,  
                           a, aCount + 1, b, bCount, n),  
               findNumUtil(res * 10 + b, a,  
                           aCount, b, bCount + 1, n)) 
  
  
# Function to find the number next  
# greater Number than N with the  
# same quantity of digits A and B 
def findNum(n, a, b): 
    result = 0
    aCount = 0
    bCount = 0
  
    return findNumUtil(result, a, aCount, 
                               b, bCount, n) 
  
# Driver code 
if __name__ == '__main__': 
    N = 4500
    A = 4
    B = 7
  
    print(findNum(N, A, B)) 
  
# This code is contributed by 
# Sanjit_Prasad 

