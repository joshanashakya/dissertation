n,k=map(int,input().split())x=list(map(int,input().split()))c=0l=len(x)for i in range(1,l):    c=max(c,x[i-1]-x[i])c=max(0,c-k)print(c) 
