from collections import Countern,k = map(int,input().split())a = list(map(int,input().split()))d = Counter(a)if max(d.values())>k:    print("NO")else:    print("YES")    b = sorted((x,i) for (i,x) in enumerate(a))    count = 0    ans = [0]*n    for x,i in b:        count = count%k+1        ans[i] = count    print(*ans)