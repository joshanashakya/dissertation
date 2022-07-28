

# Python3 program to demonstrate 
# Gijswijt's sequence 
  
# if the sequence is a(1)a(2)a(3)..a(n-1) 
# check if the sequence can be represented as 
# x*(y^k) find the largest value of k 
def find_count(ele): 
  
    # count 
    count = 0
  
    for i in range(len(ele)): 
  
        # pattern of elements of size 
        # i from the end of sequence 
        p = [] 
  
        # count 
        c = 0
        j = len(ele) - 1
  
        # extract the pattern in a reverse order 
        while j >= (len(ele) - 1 - i) and j >= 0: 
            p.append(ele[j]) 
            j -= 1
  
        j = len(ele) - 1
        k = 0
  
        # check how many times 
        # the pattern is repeated 
        while j >= 0: 
  
            # if the element dosent match 
            if ele[j] != p[k]: 
                break
  
            j -= 1
            k += 1
  
            # if the end of pattern is reached 
            # set value of k=0 and 
            # increase the count 
            if k == len(p): 
                c += 1
                k = 0
  
        count = max(count, c) 
  
    # return the max count 
    return count 
  
# print first n terms of 
# Gijswijt's sequence 
def solve(n): 
  
    # set the count 
    count = 1
  
    # stoes the element 
    ele = [] 
  
    # print the first n terms of 
    # the sequence 
    for i in range(n): 
        print(count, end = " ") 
  
        # push the element 
        ele.append(count) 
  
        # find the count for next number 
        count = find_count(ele) 
  
# Driver Code 
if __name__ == "__main__": 
    n = 10
  
    solve(n) 
  
# This code is contributed by 
# sanjeev2552 

