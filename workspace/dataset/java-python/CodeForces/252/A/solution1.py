import mathn=int(input());ans=0a=list(map(int,input().split()))for i in range(n):    x=0    for j in range(i,n):        x=x^a[j]        ans=max(ans,x)print(ans) 
