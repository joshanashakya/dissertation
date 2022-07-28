

# Python Program to implement standard 
# deviation of grouped data. 
  
import math 
  
# Function to find mean of grouped data. 
def mean( mid, freq, n): 
  
    sum = 0
    freqSum = 0
    for i in range(0,n): 
        sum = sum + mid[i] * freq[i] 
        freqSum = freqSum + freq[i] 
      
    return sum / freqSum 
  
   
# Function to find standard 
# deviation of grouped data. 
def groupedSD(lower_limit, upper_limit ,freq , n): 
  
    mid=[[0] for i in range(0,n)] 
    sum = 0
    freqSum = 0
    sd=0
    for i in range(0,n): 
        mid[i] = (lower_limit[i] + upper_limit[i]) / 2
        sum = sum + freq[i] * mid[i] * mid[i] 
        freqSum = freqSum + freq[i] 
   
    # Formula to find standard deviation 
    # of grouped data. 
    sd = math.sqrt((sum - freqSum * mean(mid, freq, n)* mean(mid, freq, n)) / (freqSum - 1)) 
    return sd 
  
  
#  driver code 
# Declare and initialize 
# the lower limit of interval. 
lower_limit= [ 50, 61, 71, 86, 96 ] 
   
# Declare and initialize 
# the upper limit of interval. 
upper_limit= [ 60, 70, 85, 95, 100 ] 
freq =[ 9, 7, 9, 12, 8 ] 
   
# Calculating the size of array. 
n = len(lower_limit) 
   
print(groupedSD(lower_limit, upper_limit, freq, n)) 
  
# This code is contributed by Gitanjali. 

