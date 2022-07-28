

# function to prin the odd and even indexed digits 
def odd_even(n): 
      
    # lists to store the odd and 
    # even positioned digits 
    odd_indexes = [] 
    even_indexes = [] 
      
    # traverse through all the indexes  
    # in the integer 
    for i in range(len(n)): 
          
        # if the digit is in odd_index position 
        # append it to odd_position list 
        if i % 2 == 0: odd_indexes.append(n[i]) 
          
        # else append it to the even_position list 
        else: even_indexes.append(n[i]) 
          
    # print the elements in the list in sorted order 
    for i in sorted(odd_indexes): print(i, end =" ") 
    for i in sorted(even_indexes): print(i, end =" ") 
  
  
# Driver Code 
n = [3, 2, 7, 6, 8] 
odd_even(n) 

