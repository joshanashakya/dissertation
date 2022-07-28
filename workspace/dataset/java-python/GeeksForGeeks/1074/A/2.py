

# Python 3 program to sort all  
# the elements that are perfect  
# squares in their relative positions 
  
# import sqrt() from math lib 
from math import sqrt 
  
# function to sort all the elements  
# that are perfect squares in their  
# relative positions  
def sortPerfectSquare(arr, n) : 
      
    # v1 will contain index of  
    # perfect squares and v2 will  
    # contain each perfect square  
    v1 = [] 
    v2 = [] 
      
    for i in range(n): 
        b = sqrt(arr[i]) 
        a = int(b) 
          
        # if both a and b are equal then  
        # arr[i] is a perfect square  
        if a == b : 
            v1.append(i) 
            v2.append(arr[i]) 
      
    # sort second list  
    v2.sort() 
      
    j = 0
      
    # put the sorted perfect square  
    # back into the array  
    for i in range(n) : 
        if v1[j] == i : 
            arr[i] = v2[j]  
            j += 1
      
    # print final array 
    for i in range(n) : 
        print(arr[i], end = " ") 
          
# Driver code 
if __name__ == "__main__" : 
    arr = [9, 44, 100, 81, 21, 64] 
    n = len(arr) 
      
    sortPerfectSquare(arr, n);  
  
# This code is contributed by ANKITRAI1 

