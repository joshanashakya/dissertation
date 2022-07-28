n=int(input())q=list(map(int,input().split()))c=0for i in range(1,n-1):    if q[i]==0 and q[i-1]==q[i+1]==1:        c+=1        q[i+1]=0print(c)
