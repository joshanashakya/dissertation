

# Python3 program to print the cumulative  
# frequency according to the order given 
  
# Function to print the cumulative frequency 
# according to the order given 
def countFreq(a, n): 
  
    # Insert elements and their 
    # frequencies in hash map. 
    hm = dict() 
    for i in range(n): 
        hm[a[i]] = hm.get(a[i], 0) + 1
  
    cumul = 0
  
    # traverse in the array 
    for i in range(n): 
  
    # add the frequencies 
        cumul += hm[a[i]] 
  
    # if the element has not been 
    # visited previously 
        if(hm[a[i]] > 0): 
            print(a[i], "->", cumul) 
              
    # mark the hash 0 
    # as the element's cumulative  
    # frequency has been printed 
        hm[a[i]] = 0
  
# Driver Code 
a = [1, 3, 2, 4, 2, 1] 
n = len(a) 
countFreq(a, n) 
  
# This code is contributed by mohit kumar 

