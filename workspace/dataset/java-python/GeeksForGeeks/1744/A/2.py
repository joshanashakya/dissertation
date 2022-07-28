

# Python3 program to count numbers having 4 as a digit 
import math as mt 
  
# Function to count numbers from 1 to n  
# that have 4 as a digit 
def countNumbersWith4(n): 
  
    # Base case 
    if (n < 4): 
        return 0
  
    # d = number of digits minus one in n.  
    # For 328, d is 2 
    d = int(mt.log10(n)) 
  
    # computing count of numbers from 1 to 10^d-1, 
    # d=0 a[0] = 0 
    # d=1 a[1] = count of numbers from 0 to 9 = 1 
    # d=2 a[2] = count of numbers from  
    #            0 to 99 = a[1]*9 + 10 = 19 
    # d=3 a[3] = count of numbers from  
    #            0 to 999 = a[2]*19 + 100 = 171 
    a = [1 for i in range(d + 1)] 
    a[0] = 0
    if len(a) > 1: 
        a[1] = 1
    for i in range(2, d + 1): 
        a[i] = a[i - 1] * 9 + mt.ceil(pow(10, i - 1)) 
  
    # Computing 10^d 
    p = mt.ceil(pow(10, d)) 
  
    # Most significant digit (msd) of n, 
    # For 328, msd is 3 which can be 
    # obtained using 328/100 
    msd = n // p 
  
    # If MSD is 4. For example if n = 428,  
    # then count of numbers is sum of following. 
    # 1) Count of numbers from 1 to 399 
    # 2) Count of numbers from 400 to 428 which is 29. 
    if (msd == 4): 
        return (msd) * a[d] + (n % p) + 1
  
    # IF MSD > 4. For example if n is 728,  
    # then count of numbers is sum of following. 
    # 1) Count of numbers from 1 to 399 and count  
    #  of numbers from 500 to 699, i.e., "a[2] * 6" 
    # 2) Count of numbers from 400 to 499, i.e. 100 
    # 3) Count of numbers from 700 to 728, recur for 28 
    if (msd > 4): 
        return ((msd - 1) * a[d] + p + 
                 countNumbersWith4(n % p)) 
  
    # IF MSD < 4. For example if n is 328,  
    # then count of numbers is sum of following. 
    # 1) Count of numbers from 1 to 299 a 
    # 2) Count of numbers from 300 to 328, recur for 28 
    return (msd) * a[d] + countNumbersWith4(n % p) 
  
# Driver Code 
n = 328
print("Count of numbers from 1 to", n,  
      "that have 4 as a digit is", countNumbersWith4(n)) 
        
# This code is contributed by mohit kumar 29 

