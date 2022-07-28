

# Python 3 program to find probability 
# of even or odd elements in a given range. 
import math 
  
# Number of tuples in a query 
C = 3
  
# Solve each query of K L R form 
def solveQuery(arr, n, Q, query): 
  
    # To count number of odd and even  
    # number upto i-th index. 
    even = [0] * (n + 1) 
    odd = [0] * (n + 1) 
    even[0] = 0
    odd[0] = 0
  
    # Counting number of odd and even  
    # integer upto index i 
    for i in range( n) : 
  
        # If number is odd, increment the  
        # count of odd frequency leave 
        # even frequency same. 
        if (arr[i] & 1) : 
            odd[i + 1] = odd[i] + 1
            even[i + 1] = even[i] 
  
        # If number is even, increment the 
        # count of even frequency leave odd 
        # frequency same. 
        else : 
            even[i + 1] = even[i] + 1
            odd[i + 1] = odd[i] 
  
    # To solve each query 
    for i in range( Q) : 
        r = query[i][2] 
        l = query[i][1] 
        k = query[i][0] 
  
        # Counting total number of element   
        # in current query 
        q = r - l + 1
  
        # Counting number of odd or even   
        # element in current query range 
        if (k): 
            p = odd[r] - odd[l - 1] 
        else: 
            p = even[r] - even[l - 1] 
  
        # If frequency is 0, output 0 
        if (not p): 
            print("0") 
  
        # If frequency is equal to number of  
        # element in current range output 1. 
        elif (p == q): 
            print("1") 
  
        # Else find the GCD of both. If yes,  
        # output by dividing both number by gcd 
        # to output the answer in reduced form. 
        else : 
            g = math.gcd(p, q) 
            print((p // g), (q // g)) 
  
# Driver Code 
if __name__ =="__main__": 
      
    arr = [ 6, 5, 2, 1, 7 ] 
    n = len(arr) 
    Q = 2
    query = [[0, 2, 2], 
             [1, 2, 5]] 
  
    solveQuery(arr, n, Q, query) 
  
# This code is contributed by ita_c 

