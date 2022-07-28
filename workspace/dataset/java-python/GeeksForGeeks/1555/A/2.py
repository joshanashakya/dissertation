

# Python program to rank of all elements 
# in a Stream in descending order 
# when they arrive 
  
# FindRank function to find rank 
def FindRank(arr, length): 
      
    # Rank of first element is always 1 
    print(1, end =" ") 
      
    # Iterate over array 
    for i in range(1, length): 
          
        # As element let say its rank is 1 
        rank = 1
  
        # Element is compared 
        # with previous elements  
        for j in range(0, i): 
              
            # If greater than previous 
            # than rank is incremented 
            if(arr[j] > arr[i]): 
                rank = rank + 1
                  
        # print rank 
        print(rank, end =" ") 
          
          
# Driver code 
if __name__ == '__main__':  
      
    # array named arr 
    arr = [88, 14, 69, 30, 29, 89] 
  
    # length of arr 
    length = len(arr) 
  
    FindRank(arr, length) 

