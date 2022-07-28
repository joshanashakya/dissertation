

# Python3 Program to find sum of values of  
# all special triplets 
  
# Finding special triplets (x, y, z) where 
# x belongs to A y belongs to B and z  
# belongs to C p, q and r are size of  
# A, B and C respectively 
def findSplTripletsSum(a, b, c, p, q, r): 
    summ = 0
    for i in range(p): 
        for j in range(q): 
            for k in range(r): 
  
                # (a[i], b[j], c[k]) is special if 
                # a[i] <= b[j] and c[k] <= b[j] 
                if (a[i] <= b[j] and c[k] <= b[j]): 
  
                    # calculate the value of this special 
                    # triplet and add sum of all values  
                    # of such triplets 
                    summ += (a[i] + b[j]) * (b[j] + c[k]) 
    return summ 
  
# Driver Code 
A = [1, 4, 5 ] 
B = [2, 3 ] 
C = [2, 1, 3 ] 
  
p = len(A) 
q = len(B) 
r = len(C) 
  
print("Sum of values of all special triplets = ", 
            findSplTripletsSum(A, B, C, p, q, r)) 
  
# This code is contributed by Mohit kumar 29 

