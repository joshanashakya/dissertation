n,k=map(int,input().split())l=list(map(int,input().split()))res=0for i in range(k):    count=0    for j in range(n):        if i != j%k:            count+=l[j]    res=max(res,abs(count))print(res)
