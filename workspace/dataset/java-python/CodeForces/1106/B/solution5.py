import math,sys,bisect,heapqfrom collections import defaultdict,Counter,dequefrom itertools import groupby,accumulate#sys.setrecursionlimit(200000000)input = iter(sys.stdin.buffer.read().decode().splitlines()).__next__ilele = lambda: map(int,input().split())alele = lambda: list(map(int, input().split()))def list2d(a, b, c): return [[c] * b for i in range(a)]def list3d(a, b, c, d): return [[[d] * c for j in range(b)] for i in range(a)]#MOD = 1000000000 + 7def Y(c):  print(["NO","YES"][c])def y(c):  print(["no","yes"][c])def Yy(c):  print(["No","Yes"][c]) n,m = ilele()A = alele()C = alele()D = []mark= {}for i in range(1,n+1):    D.append((C[i-1],i))    mark[i] = A[i-1]D.sort()D = deque(D)#print(D,mark)for i in range(m):    t,c = ilele()    if not D:        print(0)    else:        tot = mark[t]        if tot >= c:            mark[t] -= c            print(c * C[t-1])        else:            rem = c - mark[t]            ans = mark[t] * C[t-1]            mark[t] = 0            while D:                z = mark[D[0][1]]                if z == 0:                    D.popleft()                else:                    if z >= rem:                        mark[D[0][1]] -= rem                        ans += rem*D[0][0]                        rem = 0                        print(ans)                        break                    else:                        rem -= z                        mark[D[0][1]] = 0                        ans += z*D[0][0]                        D.popleft()                        if rem == 0:                            print(ans)                            break            if rem != 0:                print(0)                                        