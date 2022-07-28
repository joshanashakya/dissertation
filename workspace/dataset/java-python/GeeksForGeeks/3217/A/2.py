

# python 3 program to find maximum possible value K 
# such that array has at-least K elements that 
# are greater than or equals to K. 
  
# Function to return maximum possible value K 
# such that array has atleast K elements that 
# are greater than or equals to K 
def findMaximumNum(arr, n): 
    # output can contain any number from n to 0 
    # where n is length of the array 
  
    # We start a loop from n as we need to find 
    # maximum possible value 
    i = n 
    while(i >= 1): 
        # count contains total number of elements 
        # in input array that are more than equal to i 
        count = 0
  
        # traverse the input array and find count 
        for j in range(0,n,1): 
            if (i <= arr[j]): 
                count += 1
  
        if (count >= i): 
            return i 
              
        i -= 1
      
    return 1
  
# Driver code 
if __name__ == '__main__': 
    arr = [1, 2, 3, 8, 10] 
    n = len(arr) 
    print(findMaximumNum(arr, n)) 
  
# This code is contributed by 
# Surendra_Gangwar 

