x,y,a,b=map(int,input().split())c=0xx=[]for i in range(a,x+1):    for j in range(b,y+1):                if(i>j):            c+=1            xx.append([i,j])print(c)for i in range(c):    print(xx[i][0],xx[i][1])      