n = int(input())a = list(map(int,input().split()))ans = max(a)for i in range(n-1):    p = a[i]    for j in range(i+1,n):        p = p^a[j]        ans = max(ans,p)print(ans)
