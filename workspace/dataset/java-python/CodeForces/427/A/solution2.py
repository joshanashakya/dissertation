n=int(input())l=[int(i) for i in input().split()]x=0y=0for i in l:    if i<0 and x==0:        y=y+1    elif i<0 and x>0:        x=x+i    else:        x=x+iprint(y)    
