n,k=map(int,input().split())arr=[]c=0for i in range(n):    a,b=map(int,input().split())    c=c+b-a+1 if c%k==0:    print(0)else:    print(k-c%k)
