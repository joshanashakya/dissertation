

# Python3 program to find the total 
# time taken to execute the task 
# in given order 
from collections import deque 
  
# Function to calculate the 
# total time taken to execute 
# the given task in original order 
def run_tasks(A, B): 
  
    # To find the total time 
    # taken for executing 
    # the task 
    total_time = 0
  
    # While A is not empty 
    while (len(A) > 0): 
  
        # Store the front element of queue A and B 
        x = A.popleft() 
        y = B.popleft() 
  
        # If the front element of the queue A 
        # is equal to the front element of queue B 
        # then pop the element from both 
        # the queues and execute the task 
        # Increment total_time by 1 
        if (x == y): 
            total_time += 1
  
        # If front element of queue A is not equal 
        # to front element of queue B then 
        # pop the element from queue A & 
        # append it at the back of queue A 
        # Increment the total_time by 2 
        #(1 for append operation and 
        # 1 for pop operation) 
        else: 
            B.appendleft(y) 
            A.append(x) 
            total_time += 2
  
    # Return the total time taken 
    return total_time 
  
# Driver Code 
if __name__ == '__main__': 
  
    # Given task to be executed 
    A = deque() 
    A.append(3) 
    A.append(2) 
    A.append(1) 
    A.append(4) 
  
    # Order in which task need to be 
    # executed 
    B = deque() 
    B.append(4) 
    B.append(1) 
    B.append(3) 
    B.append(2) 
  
    # Function the returns the total 
    # time taken to execute all the task 
    print(run_tasks(A, B)) 
  
# This code is contributed by mohit kumar 29 

