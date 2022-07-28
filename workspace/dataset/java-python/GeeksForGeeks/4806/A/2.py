

# Python 3 program to check if arrays  
# are permutations of eah other  
  
# Function to check if arrays  
# are permutaitons of each other 
def arePermutations(a, b, n, m) : 
  
    sum1, sum2, mul1, mul2 = 0, 0, 1, 1
  
    # Calculating sum and multiply of first array  
    for i in range(n) : 
        sum1 += a[i] 
        mul1 *= a[i] 
  
    # Calculating sum and multiply of second array  
    for i in range(m) : 
        sum2 += b[i] 
        mul2 *= b[i] 
  
    # If sum and mul of both arrays are equal,  
    # return true, else return false. 
    return((sum1 == sum2) and (mul1 == mul2)) 
  
  
# Driver code      
if __name__ == "__main__" : 
  
    a = [ 1, 3, 2] 
    b = [ 3, 1, 2] 
  
    n = len(a) 
    m = len(b) 
  
    if arePermutations(a, b, n, m) : 
        print("Yes") 
  
    else : 
        print("No") 
  
   
# This code is contributed by ANKITRAI1 

