n=int(input().strip()) nums=['']+[' '+input().strip() for _ in range(n)]a=[0]+list(map(int,input().split()))  def send(x):    for i in range(1,n+1):        if nums[x][i]=='1':            a[i]-=1 vis=[0]*(n+1)while True:    for i in range(1,n+1):        if not vis[i] and not a[i]:            vis[i]=1            send(i)            break    else:        for i in range(1,n+1):            if not a[i]:                print(-1)                exit()        break  ans=[]for i in range(1,n+1):    if vis[i]:        ans.append(i) if ans:    print(len(ans))    print(*ans)else:    print(0)
