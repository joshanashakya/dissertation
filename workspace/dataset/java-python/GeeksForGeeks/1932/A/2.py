

# Python3 program to find the sums for  
# which an array can be divided into  
# subarrays of equal sum.  
  
# from math lib import sqrt function 
from math import sqrt 
  
# Function to find the sums for which  
# an array can be divided into subarrays  
# of equal sum  
def getSum(a, n) : 
      
    P = [0] * n  
  
    # Creating prefix sum array  
    P[0] = a[0] 
    for i in range(1, n) :  
        P[i] = a[i] + P[i - 1] 
  
    # Total Sum  
    S = P[n - 1]  
  
    # Initializing a Map for look-up  
    hash = {} 
  
    # Setting all the present sum as 1  
    for i in range(n) : 
        hash[P[i]] = 1
  
    # Set to store the subarray sum  
    res = set() 
  
    # Check the divisors of S  
    for i in range(1, int(sqrt(S)) + 1) :  
        if (S % i == 0) : 
            pres = True;  
  
            div1 = i 
            div2 = S // i 
  
            # Check if all multiples of  
            # div1 present or not  
            for j in range(div1 , S + 1, div1) : 
                  
                if j not in hash.keys() : 
                    pres = False
                    break
  
            # If all multiples are present  
            if (pres and div1 != S) : 
                res.add(div1) 
  
            pres = True
  
            # Check if all multiples of div2  
            # present or not  
            for j in range(S // i , S + 1 , S // i) :  
                if j not in hash.keys(): 
                    pres = False;  
                    break
  
            # If all multiples are present  
            if (pres and div2 != S) : 
                res.add(div2) 
  
    # If array cannot be divided into  
    # sub-arrays of equal sum  
    if(len(res) == 0) : 
        print("-1")  
        return
  
    # Printing the results  
    for i in res : 
        print(i, end = " ") 
  
# Driver code  
if __name__ == "__main__" : 
  
    a = [ 1, 2, 1, 1, 1, 2, 1, 3 ] 
  
    n = len(a) 
  
    getSum(a, n) 
  
# This code is contributed by Ryuga 

