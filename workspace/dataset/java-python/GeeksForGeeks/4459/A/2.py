

# Python program to find 
# an array that can be 
# sorted with k merge 
# sort calls. 
  
def unsort(l,r,a,k): 
  
    if (k < 1 or l + 1 == r): 
        return
   
    # We make two recursive calls, so 
    # reduce k by 2. 
    k -= 2
   
    mid = (l + r) // 2
    temp = a[mid - 1] 
    a[mid-1] = a[mid] 
    a[mid] = temp 
  
    unsort(l, mid, a, k) 
    unsort(mid, r, a, k) 
  
def arrayWithKCalls(n,k): 
  
    if (k % 2 == 0): 
        print("NO SOLUTION") 
        return
      
   
    # Create an array with values 
    # in [1, n] 
    a = [0 for i in range(n + 2)] 
    a[0] = 1
    for i in range(1, n): 
        a[i] = i + 1
    k-=1
   
    # calling unsort function 
    unsort(0, n, a, k) 
   
    for i in range(n): 
        print(a[i] ," ",end="") 
  
# Driver code 
  
n = 10
k = 17
arrayWithKCalls(n, k) 
  
# This code is contributed 
# by Anant Agarwal. 

