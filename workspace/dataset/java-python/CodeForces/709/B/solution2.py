import sysinput = sys.stdin.readline n,m = map(int,input().split())  t=  list(map(int,input().split()))   t.sort()  if n<=1:    print(0)else:          ans=9999999999999999    for j in range(n):          if j+(n-2)<n:            #print(t[j+n-2]-abs(m-t[j]),t[j])            ans=min(ans,(t[j+n-2]-t[j])+abs(m-t[j]))         x=n-1-j         if x-(n-2)>=0:            ans=min( ans,  abs(t[x]-m)+(t[x]-t[x-(n-2)])      )      print(ans)