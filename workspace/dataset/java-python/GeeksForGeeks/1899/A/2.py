

# Python3 program to implement above approach  
  
# Function to find the count  
def countEle(s, a, N):  
   
    # Hashmap to store all the elements  
    # which are popped once.  
    mp = {}  
    for i in range(0, N):   
        num = a[i]  
  
        # Check if the number is present  
        # in the hashmap Or in other words  
        # been popped out from the stack before.  
        if num in mp:  
            print("0", end = " ")  
  
        else: 
            cnt = 0 
  
            # Keep popping the elements  
            # while top is not equal to num  
            while s[-1] != num: 
                mp[s.pop()] = True 
                cnt += 1
               
            # Pop the top ie. equal to num  
            s.pop() 
            cnt += 1
  
            # Print the number of elements popped.  
            print(cnt, end = " ")  
  
# Driver code  
if __name__ == "__main__": 
   
    N = 5 
    s = []  
    s.append(1)  
    s.append(2)  
    s.append(3)  
    s.append(4)  
    s.append(6)  
  
    a = [6, 3, 4, 1, 2]   
    countEle(s, a, N)  
  
# This code is contributed by Rituraj Jain 

