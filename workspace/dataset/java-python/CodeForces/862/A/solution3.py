n, x= map(int,input().split(' '))evil = list(map(int,input().split(' ')))current = ans = 0for i in range(x):    if i not in evil:        ans += 1ans += 1 if x in evil else 0print(ans)
