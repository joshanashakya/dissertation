

# Python3 program to find n-th number   
# in a series made of digits 3 and 5  
    
# Return n-th number in series made   
# of 3 and 5  
def printNthElement(n) :  
        
    # create an array of size (n + 1)  
    arr =[0] * (n + 1);  
    arr[1] = 3
    arr[2] = 5
    
    for i in range(3, n + 1) :  
        # If i is odd  
        if (i % 2 != 0) :  
            arr[i] = arr[i // 2] * 10 + 3
        else :  
            arr[i] = arr[(i // 2) - 1] * 10 + 5
        
    return arr[n]  
        
# Driver code  
n = 6
print(printNthElement(n))  

