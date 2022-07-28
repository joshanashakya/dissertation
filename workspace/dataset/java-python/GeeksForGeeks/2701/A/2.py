

# Python3 implementation of the approach  
from collections import defaultdict 
  
# Function that checks if the  
# frequencies are in Lucas sequence.  
def lucas_sequence(s, n):  
  
    # map is used to store  
    # character frequencies  
    m = defaultdict(lambda:0) 
      
    for i in range(0, n):  
        m[s[i]] += 1    
  
    v1, v2 = [], []  
  
    # frequencies are extracted from  
    # map and stored in vector v1  
    for it in m:  
        v1.append(m[it])  
  
    # vector v1 elements are sorted, but 
    # first and second element are changed  
    # to '2' and '1' respectively, only if  
    # '1' and '2' are present in the vector.  
    v1.sort()  
    if v1[0] == 1 and v1[1] == 2:  
        v1[0], v1[1] = 2, 1
      
    else: 
        return "NO"
  
    # a and b are first and second terms  
    # of Lucas sequence  
    a, b = 2, 1
    v2.append(a)  
    v2.append(b)  
  
    # v2 contains Lucas sequence  
    for i in range(0, len(v1) - 2):  
        v2.append(a + b)  
        a, b = b, a + b  
      
    flag = 1
  
    # both vectors are compared  
    for i in range(0, len(v1)):  
        if v1[i] != v2[i]:  
            flag = 0
            break
  
    if flag == 1:  
        return "YES"
    else: 
        return "NO"
  
# Driver code  
if __name__ == "__main__": 
  
    s = "oooeeeeqkk"
    n = len(s)  
    print(lucas_sequence(s, n))  
  
# This code is contributed by Rituraj Jain 

