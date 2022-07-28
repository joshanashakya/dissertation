

# Python3 program to find minimum number  
# of elements to add so that its median  
# equals x. 
  
def minNumber (a, n, x): 
    l = 0
    h = 0
    e = 0
    for i in range(n): 
      
        # no. of elements equals to x, 
        # that is, e. 
        if a[i] == x: 
            e+=1
          
        # no. of elements greater than x, 
        # that is, h. 
        elif a[i] > x: 
            h+=1
          
        # no. of elements smaller than x, 
        # that is, l. 
        elif a[i] < x: 
            l+=1
      
    ans = 0; 
    if l > h: 
        ans = l - h 
    elif l < h: 
        ans = h - l - 1; 
      
    # subtract the no. of elements  
    # that are equal to x. 
    return ans + 1 - e 
  
# Driver code 
x = 10
a = [10, 20, 30] 
n = len(a) 
print(minNumber(a, n, x)) 
  
# This code is contributed 
# by "Abhishek Sharma 44" 

