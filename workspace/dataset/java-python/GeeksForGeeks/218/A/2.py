

# Python program for above implementation 
  
# The target value for which we have 
# to find the solution 
target = 93
  
arr = [1, 31, 3, 1, 93, 3, 31, 1, 93] 
length = len(arr) 
  
# This variable contains the total 
# count of triplets found 
totalCount = 0
  
# Loop from the first to the third 
# last integer in the list 
for i in range(length - 2): 
  
    # Check if arr[i] is a factor of target 
    # or not. If not, skip to the next element 
    if target % arr[i] == 0: 
        for j in range(i + 1, length - 1): 
  
            # Check if the pair (arr[i], arr[j]) can be 
            # a part of triplet whose product is equal 
            # to the target 
            if target % (arr[i] * arr[j]) == 0: 
  
                # Find the remaining element of the triplet 
                toFind = target // (arr[i] * arr[j]) 
                for k in range(j + 1, length): 
  
                    # If element is found. increment the 
                    # total count of the triplets 
                    if arr[k] == toFind: 
                        totalCount += 1
  
print ('Total number of triplets found: ', totalCount) 
  
             

