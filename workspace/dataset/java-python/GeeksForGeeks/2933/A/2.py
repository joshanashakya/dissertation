

# Python program to 
# answer queries for 
# frequencies 
# in O(1) time. 
  
hm = {} 
  
def countFreq(a): 
    global hm 
      
    # Insert elements and their  
    # frequencies in hash map. 
      
    for i in a: 
        if i in hm: hm[i] += 1
        else: hm[i] = 1
  
# Return frequency  
# of x (Assumes that  
# countFreq() is  
# called before) 
def query(x): 
    if x in hm: 
        return hm[x] 
    return 0
  
# Driver program 
a = [1, 3, 2, 4, 2, 1] 
countFreq(a) 
print(query(2)) 
print(query(3)) 
print(query(5)) 
  
# This code is contributed 
# by Ansu Kumari 

