

# Python 3 code to find duplicates  
# using dictionary approach. 
def printDuplicates(arr): 
    dict = {} 
  
    for ele in arr: 
        try: 
            dict[ele] += 1
        except: 
            dict[ele] = 1
              
    for item in dict: 
          
         # if frequency is more than 1 
         # print the element 
        if(dict[item] > 1): 
            print(item, end=" ") 
  
    print("\n") 
  
# Driver Code 
if __name__ == "__main__": 
    list = [12, 11, 40, 12,  
            5, 6, 5, 12, 11] 
    printDuplicates(list) 
  
# This code is contributed 
# by Sushil Bhile 

