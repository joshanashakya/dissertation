

# Python3 program to find the count of  
# occurrences of the average of array  
# elements with a given number  
  
# Function to find the count of  
# occurrences of the average of array  
# elements with a given number  
def getAverageCountArray(a, x, N):  
       
    # Dictionary to store count of occurrence  
    # of every array element in the array  
    map = {} 
      
    # Array that stores the average  
    # count for given array  
    avg = [0] * N  
    
    for i in range(N):   
        # first occurrence of a[i]  
        if a[i] not in map:   
            map[a[i]] =  1 
               
        # element has already occurred before  
        # so increase its count  
        else:  
            # gives current count of a[i]  
            map[a[i]] += 1
              
    for i in range(N):   
        av = (a[i] + x) // 2 
          
        if av in map: 
            val = map[av]  
            avg[i] = val  
               
    # Printing the average count array  
    for i in range(N): 
        print(avg[i], end = " ")  
           
       
if __name__ == "__main__": 
       
    a = [2, 0, 4, 6, 2]   
    x = 2 
    
    N = len(a)  
    getAverageCountArray(a, x, N)  
      
# This code is contributed by Rituraj Jain 

