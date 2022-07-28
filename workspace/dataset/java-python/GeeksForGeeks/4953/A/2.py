

# Python code for finding the 
# maximum length of AP 
  
def maxlenAP(a, n, d): 
  
    # key = starting element of an AP, 
    # value = length of AP 
    m = dict() 
  
    # since the length of longest AP is at least 
    # one i.e. the number itself. 
    maxt = 1
  
    # if element a[i]'s starting element(i.e., a[i]-i*d) 
    # is not in map then its value is 1 else there already 
    # exists a starting element of an AP of which a[i] 
    # can be a part. 
    for i in range(n): 
        if (a[i] - i * d) in m: 
            m[a[i] - i * d] += 1
        else: 
            m[a[i] - i * d] = 1
  
    # In this it variable will be 
    # storing key value of dictionary. 
    for it in m: 
        if m[it] > maxt: 
  
            # calculating the length of longest AP. 
            maxt = m[it] 
  
    return maxt 
  
  
# Driver code 
if __name__ == "__main__": 
    n, d = 10, 3
    a = [1, 4, 2, 5, 20, 11, 56, 100, 20, 23] 
    print(maxlenAP(a, n, d)) 
  
# This code is contributed by 
# sanjeev2552 

