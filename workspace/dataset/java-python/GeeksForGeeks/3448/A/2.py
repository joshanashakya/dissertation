

# Python 3 program to find harmonic mean. 
  
# Function that returns harmonic mean. 
def harmonicMean(arr, freq, n) : 
    sm = 0
    frequency_sum = 0
    for i in range(0,n) : 
        sm = sm + freq[i] / arr[i] 
        frequency_sum  = frequency_sum  + freq[i] 
      
    return (round(frequency_sum / sm,4)) 
  
  
# Driver code 
num = [ 13, 14, 15, 16, 17 ] 
freq = [ 2, 5, 13, 7, 3 ] 
n = len(num) 
print (harmonicMean(num, freq, n)) 
  
  
# This code is contributed by Nikita Tiwari. 

