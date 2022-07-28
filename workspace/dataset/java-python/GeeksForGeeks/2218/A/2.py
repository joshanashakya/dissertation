

# Python3 program to find the maximum  
# number of numbers divisible by 3 in  
# a large number 
def get_max_splits(num_string): 
      
    # This will contain the count of the splits 
    count = 0 
      
     # This will keep sum of all successive  
     # integers, when they are indivisible by 3 
    running_sum = 0
    for i in range(len(num_string)): 
        current_num = int(num_string[i]) 
        running_sum += current_num 
          
        # This is the condition of finding a split 
        if current_num % 3 == 0 or (running_sum != 0 and running_sum % 3 == 0):  
            count += 1
            running_sum = 0
    return count 
  
  
print get_max_splits("12345") 
  
# This code is contributed by Amit Ranjan 

