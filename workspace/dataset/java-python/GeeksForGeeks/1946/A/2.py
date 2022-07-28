

# Python3 implementation of the approach 
  
# store the answer 
c = [] 
ans = 0
  
# Function to sum of all subsets of a 
# given array 
def subsetSum(): 
    global ans 
    L = len(c) 
    mul = pow(2, L - 1) 
    i = 0
    while ( i < len(c)): 
        ans += c[i] * mul 
        i += 1
          
# Function to generate the subsets 
def subsetGen(arr, i, n): 
  
    # Base-case 
    if (i == n) : 
  
        # Finding the sum of all the subsets 
        # of the generated subset 
        subsetSum() 
        return
      
    # Recursively accepting and rejecting 
    # the current number 
    subsetGen(arr, i + 1, n) 
    c.append(arr[i]) 
    subsetGen(arr, i + 1, n) 
    c.pop() 
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 1, 1 ] 
    n = len(arr) 
  
    subsetGen(arr, 0, n) 
    print (ans) 
      
# This code is contributed by Arnab Kundu 

