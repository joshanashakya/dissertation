

# Python program to check if we can make 
# neighbors distinct. 
def distantAdjacentElement(a, n): 
  
    # dict used to count the frequency 
    # of each element occurring in the 
    # array 
    m = dict() 
  
    # In this loop we count the frequency 
    # of element through map m 
    for i in range(n): 
        if a[i] in m: 
            m[a[i]] += 1
        else: 
            m[a[i]] = 1
  
    # mx store the frequency of element which 
    # occurs most in array . 
    mx = 0
  
    # In this loop we calculate the maximum 
    # frequency and store it in variable mx. 
    for i in range(n): 
        if mx < m[a[i]]: 
            mx = m[a[i]] 
  
    # By swapping we can adjust array only 
    # when the frequency of the element 
    # which occurs most is less than or 
    # equal to (n + 1)/2 . 
    if mx > (n+1) // 2: 
        print("NO") 
    else: 
        print("YES") 
  
  
# Driver Code 
if __name__ == "__main__": 
    a = [7, 7, 7, 7] 
    n = len(a) 
    distantAdjacentElement(a, n) 
  
# This code is contributed by 
# sanjeev2552 

