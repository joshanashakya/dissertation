n = int(input())l = list(map(int,input().split()))ans=0x = nfor i in range(n-1,-1,-1):    if(i < x):           ans+=1    x = min(x,i-l[i])print(ans)
