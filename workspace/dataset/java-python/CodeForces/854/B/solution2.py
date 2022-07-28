n,k=input().split()n=int(n)k=int(k)if(k>=n or k==0):    min1=0    max1=0else:    min1=1    if(k*3<=n):        max1=k*2    else:        x=k*3-n        max1=k*2-xprint(min1,end=" ")print(max1)
