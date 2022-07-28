

# Returns the new average 
# after including x 
def getAvg(x, n, sum): 
    sum = sum + x; 
    return float(sum) / n; 
  
# Prints average of a  
# stream of numbers 
def streamAvg(arr, n): 
    avg = 0; 
    sum = 0; 
    for i in range(n): 
        avg = getAvg(arr[i], i + 1, sum); 
        sum = avg * (i + 1); 
        print("Average of ", end = ""); 
        print(i + 1, end = ""); 
        print(" numbers is ", end = ""); 
        print(avg); 
    return; 
  
# Driver Code 
arr= [ 10, 20, 30,  
       40, 50, 60 ]; 
n = len(arr); 
streamAvg(arr,n); 
  
# This code is contributed by mits 

