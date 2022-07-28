

# Function that returns True if there 
# exists a triplet with sum x 
def existsTriplet(a, b,c, x, l1,l2, l3): 
      
    # Sorting arrays such that a 
    # represents smallest array 
    if (l2 <= l1 and l2 <= l3): 
        l1, l2 = l2,l1 
        a, b = b,a 
    elif (l3 <= l1 and l3 <= l2): 
        l1, l3 = l3,l1 
        a, c = c,a 
  
    # Iterating the smallest array 
    for i in range(l1): 
  
        # Two pointers on second and third array 
        j = 0
        k = l3 - 1
        while (j < l2 and k >= 0): 
  
            # If a valid triplet is found 
            if (a[i] + b[j] + c[k] == x): 
                return True
            if (a[i] + b[j] + c[k] < x): 
                j += 1
            else: 
                k -= 1
  
    return False
  
# Driver code 
a = [ 2, 7, 8, 10, 15 ] 
b = [ 1, 6, 7, 8 ] 
c = [ 4, 5, 5 ] 
l1 = len(a) 
l2 = len(b) 
l3 = len(c) 
  
x = 14
  
if (existsTriplet(a, b, c, x, l1, l2, l3)): 
    print("Yes") 
else: 
    print("No") 
  
# This code is contributed by mohit kumar 29 
  

