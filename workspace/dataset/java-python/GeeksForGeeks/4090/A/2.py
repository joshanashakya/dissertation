

# Python 3 program to print nearest  
# element with at least one common 
# prime factor. 
import math 
  
def nearestGcd(arr, n): 
  
    # Loop covers the every element of arr[] 
    for i in range(n): 
        closest = -1
  
        # Loop that covers from 0 to i-1 and  
        # i+1 to n-1 indexes simultaneously 
        j = i - 1
        k = i + 1
        while j > 0 or k <= n: 
            if (j >= 0 and 
                math.gcd(arr[i], arr[j]) > 1): 
                closest = j + 1
                break
              
            if (k < n and
                math.gcd(arr[i], arr[k]) > 1): 
                closest = k + 1
                break
            k += 1
            j -= 1
  
        # print position of closest element 
        print(closest, end = " ") 
  
# Driver code 
if __name__=="__main__": 
      
    arr = [2, 9, 4, 3, 13] 
    n = len(arr) 
    nearestGcd(arr, n) 
  
# This code is contributed by ita_c 

