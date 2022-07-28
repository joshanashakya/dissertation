

# Python3 program to check whether  
# two lists are overlaping or not 
def is_member(List, key): 
  
    for i in range(0, len(List)): 
        if key == List[i]: 
            return True
    return False
  
def overlap(List1 , List2): 
  
    for key in List1: 
        if is_member( List2, key ): 
            return True
  
    return False
  
# Driver Code 
if __name__ == '__main__': 
  
    s1 = 'geeksforgeeks'
    s2 = 'geeks'
  
    List1 = list( s1 ) 
    List2 = list( s2 ) 
  
    yes_or_no = str(overlap( List1, List2 )) 
      
    if (yes_or_no): 
        print("Yes") 
    else: 
        print("No") 
  
# This code is contributed  
# by Krishna_Yadav 

