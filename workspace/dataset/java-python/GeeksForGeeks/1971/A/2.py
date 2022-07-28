

# An efficient Python3 program to compute  
# sum of bitwise OR of all pair 
  
# Returns sum of bitwise OR 
# of all pairs 
def sumXOR( arr,  n): 
      
    sum = 0
    for i in range(0, 32): 
  
        #  Count of zeros and ones 
        zc = 0
        oc = 0
           
        # Individual sum at each bit position 
        idsum = 0
        for j in range(0, n): 
            if (arr[j] % 2 == 0): 
                zc = zc + 1
                  
            else: 
                oc = oc + 1
            arr[j] = int(arr[j] / 2) 
          
           
        # calculating individual bit sum  
        idsum = oc * zc * (1 << i) 
   
        # final sum     
        sum = sum + idsum;  
      
    return sum
  
  
  
# driver function  
sum = 0
arr = [  5, 9, 7, 6 ] 
n = len(arr) 
sum = sumXOR(arr, n); 
print (sum) 
  
# This code is contributed by saloni1297 

