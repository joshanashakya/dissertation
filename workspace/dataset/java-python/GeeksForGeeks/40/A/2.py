

# Python3 program to count the pairs in array 
# such that one element is reverse of another 
  
# Function to reverse the digits 
# of the number 
def reverse(num): 
    rev_num = 0
  
    # Loop to iterate till the number is 
    # greater than 0 
    while (num > 0): 
  
        # Extract the last digit and keep 
        # multiplying it by 10 to get the 
        # reverse of the number 
        rev_num = rev_num * 10 + num % 10
        num = num // 10
  
    return rev_num 
  
# Function to find the pairs from the  
# such that one number is reverse of 
# the other 
def countReverse(arr,n): 
    res = 0
  
    # Iterate through all pairs 
    for i in range(n): 
        for j in range(i + 1, n): 
  
            # Increment count if one is 
            # the reverse of other 
            if (reverse(arr[i]) == arr[j]): 
                res += 1
  
    return res 
  
# Driver code 
if __name__ == '__main__': 
    a =  [16, 61, 12, 21, 25] 
    n =  len(a) 
    print(countReverse(a, n)) 
  
# This code is contributed by Surendra_Gangwar 

