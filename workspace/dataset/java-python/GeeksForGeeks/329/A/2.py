

# python implementation to count subsets having  
# even numbers only and all are distinct  
  
#function to count the required subsets  
def countSubSets(arr, n): 
    us = set() 
    even_count = 0
  
    # inserting even numbers in the set 'us'  
    # single copy of each number is retained  
    for i in range(n): 
        if arr[i] % 2 == 0: 
            us.add(arr[i]) 
  
    # counting distinct even numbers  
    even_count = len(us) 
  
    # total count of required subsets  
    return pow(2, even_count)-  1
  
  
# Driver program 
arr = [4, 2, 1, 9, 2, 6, 5, 3] 
n = len(arr) 
print("Numbers of subset=", countSubSets(arr,n)) 
  
# This code is contributed by Shrikant13 
  

