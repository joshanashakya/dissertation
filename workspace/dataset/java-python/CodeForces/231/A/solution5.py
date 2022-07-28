t=int(input())count=0for i in range(t):    x,y,z=map(int,input().split())    sum=x+y+z        if sum>=2:        count+=1print(count)             
