

# Python3 implementation of the approach  
  
# function to count maximum  
# XOR value for a triplet  
def Maximum_xor_Triplet(n, a):  
  
    # set is used to avoid repetitions  
    s = set()  
  
    for i in range(0, n):  
        for j in range(i, n):  
  
            # store all possible unique  
            # XOR value of pairs  
            s.add(a[i] ^ a[j])  
  
    ans = 0
    for i in s:  
        for j in range(0, n):  
  
            # store maximum value  
            ans = max(ans, i ^ a[j])  
  
    print(ans)  
  
# Driver code  
if __name__ == "__main__": 
  
    a = [1, 3, 8, 15]  
    n = len(a)  
    Maximum_xor_Triplet(n, a)  
  
# This code is contributed  
# by Rituraj Jain 

