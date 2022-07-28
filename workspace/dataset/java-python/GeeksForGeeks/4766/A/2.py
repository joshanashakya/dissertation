

# Python3 implementation of the approach  
  
# Function that returns true if a, b and c can  
# be made equal with the given operations  
def canBeEqual(a, b, c, k) :  
  
    arr = [0] * 3;  
    arr[0] = a;  
    arr[1] = b;  
    arr[2] = c;  
  
    # Sort the three numbers  
    arr.sort() 
  
    # Find the sum of difference of the 3rd and  
    # 2nd element and the 3rd and 1st element  
    diff = 2 * arr[2] - arr[1] - arr[0];  
  
    # Subtract the difference from k  
    k = k - diff;  
  
    # Check the required condition  
    if (k < 0 or k % 3 != 0) : 
        return False;  
  
    return True;  
  
# Driver code  
if __name__ == "__main__" :  
  
    a1 = 6; b1 = 3; c1 = 2; k1 = 7;  
  
    if (canBeEqual(a1, b1, c1, k1)) : 
        print("Yes");  
    else : 
        print("No");  
  
# This code is contributed by AnkitRai01 

