

# python program to find any one of them 
# can overtake the other 
  
# function to find if any one of them can 
# overtake the other 
def sackRace(p1, s1, p2, s2): 
      
    # Since starting points are always 
    # different, they will meet if following  
    # conditions are met. 
    # (1) Speeds are not same 
    # (2) Difference between speeds divide the 
    #     total distance between initial points.  
    return ( (s1 > s2 and (p2 - p1) % (s1 - s2) == 0)  
         or (s2 > s1 and (p1 - p2) % (s2 - s1) == 0)) 
  
  
# driver program 
p1 = 4
s1 = 4
p2 = 8
s2 = 2
if(sackRace(p1, s1, p2, s2)): 
    print("Yes") 
else: 
    print("No") 
      
# This code is contributed by Sam007 

