

# Python3 program to find number  
# of leaf nodes  
  
# Function to calculate  
# leaf nodes in n-ary tree  
def calcNodes(N, I): 
    result = 0
  
    result = I * (N - 1) + 1
  
    return result  
  
# Driver Code  
if __name__ == '__main__': 
    N = 5
    I = 2
  
    print("Leaf nodes = ",  
           calcNodes(N, I)) 
  
# This code is contributed  
# by SHUBHAMSINGH10 

