

# Python3 program to make the array zero  
# by decrementing value in pairs  
  
# Function to check if all the elements  
# can be made 0 in an array  
def canMake(n, ar) : 
  
    # Variable to store  
    # sum and maximum element  
    # in an array  
    sum = 0; maxx = -1;  
  
    # Loop to calculate the sum and max value  
    # of the given array  
    for i in range(n) : 
        sum += ar[i];  
        maxx = max(maxx, ar[i]);  
  
    # If n is 1 or sum is odd or  
    # sum - max element < max  
    # then no solution  
    if (n == 1 or sum % 2 == 1
        or sum - maxx < maxx) : 
        print("No");  
      
    else : 
  
        # For the remaining case, print Yes  
        print("Yes");  
  
# Driver code  
if __name__ == "__main__" :  
  
    n = 6;  
    arr = [ 1, 1, 2, 3, 6, 11 ];  
  
    canMake(n, arr);  
  
# This code is contributed by AnkitRai01 

