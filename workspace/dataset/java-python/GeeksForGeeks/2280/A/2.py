

# Python3 code to generate first 'n' terms 
# of Connell Sequence 
  
# Function to generate a fixed number 
# of even or odd terms. The size of r 
# decides whether numbers to be generated 
# even or odd. 
def gen(n, r): 
    a = r[-1] 
    a += 1
    for i in range(1, n + 1): 
        r.append(a) 
        a += 2
    return r 
  
# Generating the first 'n' terms of 
# Connell Sequence 
def conell(n): 
    res = [] 
    k = 1
  
    # A dummy 0 is inserted at the 
    # beginning for consistency 
    res.append(0) 
  
    while 1: 
  
        # Calling function gen() to generate 
        # 'k' number of terms 
        res = gen(k, res) 
        k += 1
        j = len(res) - 1
        while j != n and j + k > n: 
            k -= 1
  
        # Checking if 'n' terms are 
        # already generated 
        if j >= n: 
            break
  
    # Removing the previously inserted dummy 0 
    res.remove(res[0]) 
    return res 
  
# Driver Code 
if __name__ == "__main__": 
    n = 10
    print("The first %d terms are" % n) 
    res = conell(n) 
    for i in range(len(res)): 
        print(res[i], end = " ") 
    print() 
  
# This code is contributed by 
# sanjeev2552 

