for _ in range(int(input())):    x,n,m=map(int,input().split())    ans="NO"    i=1    if x<=10*m:        ans="YES"    else:        while i<=n:            k=x//2 + 10            x=k            i+=1            if x<=10*m:                ans="YES"    print(ans)        