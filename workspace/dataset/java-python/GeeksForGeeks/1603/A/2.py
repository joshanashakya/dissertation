

# Python3 program to find the k-th  
# missing element in a given sequence  
  
  
# Returns k-th missing element. It returns -1 if  
# no k is more than number of missing elements.  
def find(a, b, k, n1, n2): 
  
    # insert all elements of  
    # given sequence b[]. 
    s = set() 
      
    for i in range(n2): 
        s.add(b[i]) 
  
    # Traverse through increasing sequence and  
    # keep track of count of missing numbers.  
    missing = 0
    for i in range(n1): 
        if a[i] not in s: 
            missing += 1
        if missing == k: 
            return a[i] 
    return -1
  
# Driver code 
a = [0, 2, 4, 6, 8, 10, 12, 14, 15] 
b = [4, 10, 6, 8, 12] 
n1 = len(a) 
n2 = len(b) 
k = 3
print(find(a, b, k, n1, n2)) 
  
# This code is contributed by Shrikant13 

