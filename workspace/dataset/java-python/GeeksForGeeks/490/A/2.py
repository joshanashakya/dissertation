

# Python 3 program to find the maximum count of 
# values that follow the given condition 
import heapq 
  
# Function to find the maximum count of 
# values that follow the given condition 
def check(A, B,N): 
  
    # Initializing the max-heap for the array A[] 
    pq1 = [] 
    pq2 = [] 
  
    # Adding the values of A[] into max heap 
    for i in range(N): 
        heapq.heappush(pq1,-A[i])  
  
    # Adding the values of B[] into max heap 
    for i in range(N): 
        heapq.heappush(pq2,-B[i])  
  
    # Counter variable 
    c = 0
  
    # Loop to iterate through the heap 
    for i in range(N): 
  
        # Comparing the values at the top. 
        # If the value of heap A[] is greater, 
        # then counter is incremented 
        if -pq1[0] > -pq2[0]: 
            c += 1
            heapq.heappop(pq1) 
            heapq.heappop(pq2) 
  
        else: 
            if len(pq2) == 0: 
                break
            heapq.heappop(pq2) 
    return (c) 
  
# Driver code 
A = [ 10, 3, 7, 5, 8 ] 
B = [ 8, 6, 2, 5, 9 ] 
N = len(A) 
  
print(check(A, B, N)) 
  
# This code is contributed by apurva raj 

