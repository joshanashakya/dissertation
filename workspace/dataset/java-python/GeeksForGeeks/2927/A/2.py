

# Python 3 Program to output an array having  
# exactly X subsequences where difference  
# between maximum and minimum element of each  
# subsequence is less than d 
  
# This function outputs the desired array. 
def printArray(X, d, first_ele): 
      
    # Iterate till all the disjoint 
    # sets are found. 
    while (X > 0): 
  
        # count_ele the elements in one  
        # disjoint set. pow_of_two will  
        # keep all the powers of twos. 
        count_ele, pow_of_two = 0, 2
  
        # Iterate to know the maximum length of  
        # disjoint set by checking whether X is 
        # greater than the total number of  
        # possible not empty sequences of that  
        # disjoint set. 
        while (X - pow_of_two + 1 >= 0): 
            count_ele += 1
            pow_of_two *= 2
  
        # now deleting the total subsequences of 
        # the maximum length disjoint set from X. 
        X = X - (pow_of_two / 2) + 1
  
        # outputing the disjoint set having  
        # equal elements. 
        for j in range(count_ele): 
            print(first_ele, end = " ") 
  
        # by adding d, it makes another  
        # disjoint set of equal elements. 
        first_ele += d 
          
# Driver Code 
if __name__ == '__main__': 
    d, X = 100, 25
    printArray(X, d, 1) 
      
# This code is contributed by PrinciRaj19992 

