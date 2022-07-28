

# Python3 program to find  
# XOR of pair sums. 
  
def xor_pair_sum(ar, n): 
    total = 0
    for i in range(n): 
        total = total ^ ar[i] 
  
    return 2 * total 
  
  
# Driver program to test the above function 
if __name__ == "__main__": 
    data = [1, 2, 3] 
    print(xor_pair_sum(data, len(data))) 
  
# This code is contributed 
# by Kanav Malhotra 

