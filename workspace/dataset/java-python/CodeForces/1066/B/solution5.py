for _ in range(1):    n,r=map(int,input().split())    l=list(map(int,input().split()))    dp=[0]*n    for i in range(n):        if l[i]==1:            for j in range(max(0,i-r+1),min(n,i+r)):                dp[j]+=1    if 0 in dp:        print(-1)        break    ans=l.count(1)        for i in range(n):        if l[i]==1:            flag=0            for j in range(max(0,i-r+1),min(n,i+r)):                if dp[j]==1:                    flag=1            if flag==0:                ans+=-1                for j in range(max(0,i-r+1),min(n,i+r)):                    dp[j]-=1    print(ans)                                        
