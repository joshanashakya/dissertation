from sys import stdin,stdoutnmbr = lambda: int(input())lst = lambda: list(map(int, input().split()))for _ in range(1):#nmbr()):    n=nmbr()    a=[lst() for _ in range(n)]    ans=max(v[0] for v in a)+1    for p,b in a:        cnt=0        power=1        while power<b:            power*=4            cnt+=1        ans=max(cnt+p,ans)    print(ans)