d = {}d1 = {}ans = 0 for _ in range(int(input())):    x,y = map(int, input().split())     d[x+y] = d.get(x+y, 0) + 1    d1[x-y] = d1.get(x-y, 0) + 1 for k in d:    if d[k] > 1:        ans += (d[k]*(d[k]-1))//2 for z in d1:    if d1[z] > 1:        ans += (d1[z]*(d1[z]-1))//2 print(ans)
