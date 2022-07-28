

# Python3 implementation of the approach  
from collections import defaultdict 
  
# Function to return the count of  
# required pairs  
def get_unordered_pairs(a, n):  
  
    # To store unique elements  
    vs = []  
  
    # To hash elements with their frequency  
    m = defaultdict(lambda:0)  
  
    # Store frequencies in m and  
    # all distinct items in vs  
    for i in range(0, n):  
        m[a[i]] += 1
        if m[a[i]] == 1:  
            vs.append(a[i])  
  
    # Traverse through distinct elements  
    number_of_pairs = 0
    for i in range(0, len(vs)):  
  
        # If current element is greater  
        # than its frequency in the array  
        if m[vs[i]] < vs[i]: 
            continue
  
        # If element is equal to its frequency,  
        # a pair of the form (x, x) is formed.  
        elif m[vs[i]] == vs[i]:  
            number_of_pairs += 1
  
        # If element is less than its 
        # frequency  
        else: 
            number_of_pairs += 1
            for j in range(vs[i] + 1, m[vs[i]] + 1):  
                if m[j] >= vs[i]:  
                    number_of_pairs += 1
      
    return number_of_pairs  
  
# Driver code  
if __name__ == "__main__":  
  
    arr = [3, 3, 2, 2, 2]  
    n = len(arr)  
    print(get_unordered_pairs(arr, n)) 
  
# This code is contributed 
# by Rituraj Jain 

