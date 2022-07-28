

# Python 3 program to find the minimum number 
# of additional cuts required to make 
# circle segments equal sized 
   
import math 
# Function to find the minimum number 
# of additional cuts required to make 
# circle segments are equal sized 
def minimumCuts(a, n): 
      
    # Sort the array 
    a.sort() 
   
    # Initial gcd value 
    gcd = a[1] - a[0] 
    s = gcd 
   
    for i in range(2,n) : 
        gcd = math.gcd(gcd, a[i] - a[i - 1]) 
        s += a[i] - a[i - 1] 
   
    # Inlcuding the last segment 
    if (360 - s > 0): 
        gcd = math.gcd(gcd, 360 - s) 
   
    return (360 // gcd) - n 
   
# Driver code 
if __name__ == "__main__": 
    arr = [ 30, 60, 180 ] 
   
    n = len(arr) 
   
    print(minimumCuts(arr, n)) 

