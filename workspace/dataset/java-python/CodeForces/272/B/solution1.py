def rec(x):    if x == 1:        return 1     if x%2 == 0:        return rec(x//2)     else:        return rec(x//2)+1 n = int(input())l = list(map(int,input().split()))d = {}ans = 0for i in l:    som = rec(i)    if som in d:        d[som] += 1     else:        d[som] = 1 for i in d:    ans = ans+int(((d[i]-1)/2)*(d[i])) print(ans)