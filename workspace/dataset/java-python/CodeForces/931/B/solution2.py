a,b,c=map(int,input().split())s=0while(c!=b):    c=(c+1)//2    b=(b+1)//2    s+=1    a//=2if a>1:print(s)else:print("Final!")
