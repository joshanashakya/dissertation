

# Function to delete elements 
def deleteElements(arr, n, k): 
      
    # create an empty stack st 
    st = [] 
    st.append(arr[0]) 
      
    # index to mantain the top  
    # of the stack 
    top = 0
    count = 0
  
    for i in range(1, n): 
          
        # pop till the present element  
        # is greater than stack's top 
        # element 
        while(len(st) != 0 and count < k 
                   and st[top] < arr[i]): 
            st.pop() 
            count += 1
            top -= 1
  
        st.append(arr[i]) 
        top += 1
  
    # print the remaining elements 
    for i in range(0, len(st)): 
        print(st[i], " ", end="") 
  
# Driver code 
k = 2
arr = [20, 10, 25, 30, 40]  
deleteElements(arr, len(arr), k) 
  
# This code is contributed by himan085. 

