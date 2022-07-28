

# Python3 program to find the largest smaller  
# number by swapping one digit.  
import sys 
  
# Returns largest possible number  
# with one swap such that the number  
# is smaller than str. It is assumed  
# that there are leading 0s.  
def prevNum(string, n): 
    index = -1
  
    # Traverse from right until we find  
    # a digit which is greater than its  
    # next digit. For example, in 34125,  
    # our index is 4.  
    for i in range(n - 2, -1, -1): 
        if int(string[i]) > int(string[i + 1]): 
            index = i 
            break
  
    # We can also use binary search here as  
    # digits after index are sorted in  
    # increasing order.  
    # Find the biggest digit in the right of  
    # arr[index] which is smaller than arr[index]      
    smallGreatDgt = -1
    for i in range(n - 1, index, -1): 
        if (smallGreatDgt == -1 and int(string[i]) <  
                                    int(string[index])): 
            smallGreatDgt = i 
        elif (index > -1 and int(string[i]) >= 
                             int(string[smallGreatDgt]) and 
                             int(string[i]) < int(string[index])): 
            smallGreatDgt = i 
      
    # If index is -1 i.e. digits are  
    # in increasing order. 
    if index == -1: 
        return "" . join("-1") 
    else:  
          
        # Swap both values 
        (string[index],  
         string[smallGreatDgt]) = (string[smallGreatDgt],  
                                   string[index]) 
    return "" . join(string) 
  
# Driver Code 
if __name__=='__main__': 
    n_str = "34125"
    ans = prevNum(list(n_str), len(n_str)) 
    print(ans) 
          
# This code is contributed by Vikash Kumar 37 

