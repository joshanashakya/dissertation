

# function for finding count of possible subsequence 
def countSubseq(arr, n): 
    count = 0
  
    # creating a map to count the frequency of each element 
    mp = {} 
  
    # store frequency of each element 
    for x in arr: 
        if x in mp.keys(): 
            mp[x]+=1
        else: 
            mp[x]=1
  
    # iterate through the map 
    for i in mp.keys(): 
  
        # add all possible combination for key equal zero 
        if (i == 0): 
            count += pow(2, mp[i]) - 1
  
        # add all (odd number of elements) possible  
        # combination for key other than zero 
        else: 
            count += pow(2, mp[i] - 1) 
    return count 
  
# Driver function 
arr= [2, 2, 2, 5, 6 ] 
n = len(arr) 
print(countSubseq(arr, n)) 
  
# This code is contributed by apurva raj 

