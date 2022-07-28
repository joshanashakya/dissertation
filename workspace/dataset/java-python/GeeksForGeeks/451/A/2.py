

#Function to return the count of all identical rows 
def countIdenticalRows(mat): 
    count = 0
  
    for i in range(len(mat)): 
  
        #HashSet for current row 
        hs=dict() 
  
        #Traverse the row 
        for j in range(len(mat[i])): 
  
            #Add all the values of the row in HashSet 
            hs[mat[i][j]]=1
          
  
        #Check if size of HashSet = 1 
        if (len(hs)== 1): 
            count+=1
      
  
    return count 
  
  
#Driver code 
  
mat= [ [ 1, 1, 1 ], 
                [ 1, 2, 3 ], 
                [ 5, 5, 5 ] ] 
print(countIdenticalRows(mat)) 
  
#This code is contributed by Mohit kumar 29 

