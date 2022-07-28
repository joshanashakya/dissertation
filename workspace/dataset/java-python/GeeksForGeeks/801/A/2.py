

# Python 3 program to count number of times we 
# need to add digits to get a single digit. 
def NumberofTimes(s): 
  
    # Here the count variable store 
    # how many times we do sum of 
    # digits and temporary_sum 
    # always store the temporary sum 
    # we get at each iteration . 
    temporary_sum = 0
    count = 0
  
    # In this loop we always compute 
    # the sum of digits in temporary_ 
    # sum variable and convert it 
    # into string str till its length 
    # become 1 and increase the count 
    # in each iteration. 
    while (len(s) > 1): 
      
        temporary_sum = 0
  
        # computing sum of its digits 
        for i in range(len(s)): 
            temporary_sum += (ord(s[ i ]) - 
                              ord('0'))  
  
        # converting temporary_sum into  
        # string str again . 
        s = str(temporary_sum) 
  
        # increase the count 
        count += 1
  
    return count 
  
# Driver Code 
if __name__ == "__main__": 
      
    s = "991"
    print(NumberofTimes(s)) 
  
# This code is contributed by Ita_c 

