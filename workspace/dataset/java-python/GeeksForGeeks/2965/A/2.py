

# Python 3 implementation of the above approach 
  
# Function to find the smallest number 
# greater than k represented as 
# the sum of distinct powers 
def greaterK(n, k): 
      
    # Vector P to store the base k 
    # representation of the number 
    index = 0
    p = [0 for i in range(n + 2)] 
    x = n 
    while (x > 0): 
        p[index] = x % k 
        x //= k 
        index += 1
  
    idx = 0
    for i in range(0,len(p)-1, 1): 
        if (p[i] >= 2): 
              
            # If the representation is >=2, then 
            # this power of k has to be added 
            # once again and then increase the 
            # next power of k and make the 
            # current power 0 
            p[i] = 0
            p[i + 1] += 1
  
            # Reduce all the lower power of 
            # k to 0 
            for j in range(idx, i, 1): 
                p[j] = 0
              
            idx = i + 1
  
        if (p[i] == k): 
            p[i] = 0
            p[i + 1] += 1
          
    j = len(p) - 1
  
    # Check if the most significant 
    # bit also satisfy the above 
    # conditions 
    if (p[j] >= 2): 
        p[index] = 1
        index += 1
    ans = 0
  
    # Converting back from the 
    # k-nary representation to 
    # decimal form. 
    i = len(p)-1
    while(i>= 0): 
        ans = ans * k + p[i] 
        i -= 1
    print(ans) 
  
if __name__ == '__main__': 
    n = 29
    k = 7
    greaterK(n, k) 
  
# This code is contributed by Surendra_Gangwar 

