

# Python3 program to find any pair 
# which has sum S and product P. 
from math import sqrt 
  
# Prints roots of quadratic equation 
# ax*2 + bx + c = 0 
def findRoots(b, c): 
  
    a = 1
    d = b * b - 4 * a * c 
  
    # calculating the sq root value 
    # for b * b - 4 * a * c 
    sqrt_val = sqrt(abs(d)) 
  
    if (d > 0): 
        x = -b + sqrt_val 
        y = -b - sqrt_val 
  
        # Finding the roots 
        root1 = (x) // (2 * a) 
        root2 = (y) // (2 * a) 
  
        # Check if the roots 
        # are valid or not 
        if (root1 + root2 == -1 * b 
            and root1 * root2 == c): 
            print(int(root1),",",int(root2)) 
        else: 
            print(-1) 
    elif (d == 0): 
  
        # Finding the roots 
        root = -b // (2 * a) 
  
        # Check if the roots 
        # are valid or not 
        if (root + root == -1 * b 
            and root * root == c): 
            print(root,",",root) 
        else: 
            print(-1) 
  
    # when d < 0 
    else: 
  
        # No such pair exists in this case 
        print(-1) 
  
# Driver code 
if __name__ == '__main__': 
    S = 5
    P = 6
    findRoots(-S, P) 
  
    S = 5
    P = 9
    findRoots(-S, P) 
  
# This code is contributed by mohit kumar 29 

