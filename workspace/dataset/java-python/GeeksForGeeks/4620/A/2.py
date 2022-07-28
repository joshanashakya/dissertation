

# Python program to find number of spectators  
# standing at a time 
  
def result(n, k, t) : 
      
    # If the time is less than k 
    # then we can print directly t time. 
    if (t <= k) : 
        print(t ) 
   
    # If the time is n then k spectators 
    # are standing. 
    elif (t <= n) : 
        print( k) 
   
    # Otherwise we calculate the  
    # spectators standing. 
    else : 
          
        temp = t - n 
        temp = k - temp 
        print (temp) 
          
# Driver code 
  
# Stores the value of n, k and t 
# t is time 
# n & k is the number of specators 
n = 10
k = 5
t = 12
result(n, k, t) 
  
  
# This code is contributed by Nikita Tiwari. 

