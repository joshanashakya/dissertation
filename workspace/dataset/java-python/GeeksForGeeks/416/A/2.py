

# Python 3 program to count the number of  
# subarrays that having only 0's and only 1's 
  
# Function to count number of subarrays 
def countSubarraysof1and0(a, n): 
    count1 = 0
    count0 = 0
  
    number1 = 0
    number0 = 0
  
    # Iterate in the array to find count 
    # of subarrays with only 1 in it 
    for i in range(0, n, 1): 
          
        # check if array element is 1 or not 
        if (a[i] == 1): 
            count1 += 1
        else: 
            number1 += ((count1) * 
                        (count1 + 1) / 2) 
            count1 = 0
  
    # Iterate in the array to find count 
    # of subarrays with only 0 in it 
    for i in range(0, n, 1): 
          
        # check if array element 
        # is 0 or not 
        if (a[i] == 0): 
            count0 += 1
        else: 
            number0 += (count0) * (count0 + 1) / 2
            count0 = 0
      
    # After iteration completes, 
    # check for the last set of subarrays 
    if (count1): 
        number1 += (count1) * (count1 + 1) / 2
  
    if (count0): 
        number0 += (count0) * (count0 + 1) / 2
  
    print("Count of subarrays of 0 only:",  
                             int(number0)) 
    print("Count of subarrays of 1 only:",  
                             int(number1)) 
  
# Driver Code 
if __name__ == '__main__': 
    a = [1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1]  
    n = len(a) 
  
    countSubarraysof1and0(a, n) 
  
# This code is contributed by 
# Surendra_Gangwar 

